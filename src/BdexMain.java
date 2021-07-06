import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
import java.io.FileWriter;   
import java.io.IOException;

public class BdexMain {
  public static void main(String[] args) {
    try {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      // create a lexer that feeds off of input CharStream:
      BdexLexer lexer = new BdexLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      BdexParser parser = new BdexParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at program rule:
      ParseTree tree = parser.program();
      if (parser.getNumberOfSyntaxErrors() == 0) {
        // print LISP-style tree:
        // System.out.println(tree.toStringTree(parser));
        BdexCompiler compiler = new BdexCompiler();
        ST result = compiler.visit(tree);
        result.add("name", "Output");
        System.out.println(result.render());

        try {  
          FileWriter myWriter = new FileWriter("Output.java");
          myWriter.write(result.render());
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }
    catch(IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
    catch(RecognitionException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
