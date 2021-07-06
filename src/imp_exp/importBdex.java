import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class importBdex extends importBdexBaseVisitor<Object> {

   private HashMap<String,Object> variables = new HashMap<String,Object>();

   @Override public Object visitProgram(importBdexParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitStat(importBdexParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitImportar(importBdexParser.ImportarContext ctx) {
      File csvfile = new File(ctx.STRING().getText()) ;
      
      if(csvfile.isFile() && csvfile.exists()){
        try{
         BufferedReader reader = new BufferedReader(new FileReader(ctx.STRING().getText()));
         int i = 1;
          LinkedList<LinkedHashMap<String, Cell>> tableContent = new LinkedList<LinkedHashMap<String, Cell>>();
          LinkedList<String> collNames = new LinkedList<String>();
         String row;
         while((row = reader.readLine()) != null){
          String[] data = row.split(",");
          if(i == 1){
             collNames = new LinkedList<String>(Arrays.asList(data));
          }else{
            LinkedHashMap<String, Cell> line = new LinkedHashMap(data.length);
            for(int j=0; j<data.length; j++){
               line.put(collNames.get(j), new Cell(data[j]));
             }
            tableContent.add(line);
         }
         i++;
       }
         reader.close();
         Table table = new Table(collNames,tableContent);
         variables.put("importedTable", table);
         return table;
        }catch(Exception e){
            System.out.println("Error"+ e);
      }
    }else{
         return "File does not exist!";
    }
    return "";
    
    }


   @Override public Object visitExportar(importBdexParser.ExportarContext ctx) {
      String tablename = ctx.STRING().getText();
      Table table = (Table) variables.get(tablename);
      try{
      FileWriter writer = new FileWriter("exported.csv");
      LinkedList<String> collnames = table.getCollNames();
      LinkedList<LinkedHashMap<String, Cell>> content = table.getContent();

      for(String names : collnames){
         writer.append(names + ",");
      }
      writer.append("\n");

      for(LinkedHashMap<String, Cell> row : content){
         LinkedList<Cell> cells = (LinkedList<Cell>) row.values();
         for(Cell celula : cells){
            writer.append(celula.toString()+",");
         }
         writer.append("\n");
      } 
      
        writer.flush();
        writer.close();
        
      }catch(Exception e){
          System.out.println("Error"+ e );
      }
      return "Done";
   }
}
