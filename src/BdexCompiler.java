import org.stringtemplate.v4.*;
import java.util.*;

public class BdexCompiler extends BdexBaseVisitor<ST> {
	
	private STGroup templates = new STGroupFile("java.stg");
   private String varnameGlobal = "";

   @Override public ST visitProgram(BdexParser.ProgramContext ctx) {
   ST res = templates.getInstanceOf("module");
	Iterator<BdexParser.OperationContext> list = ctx.operation().iterator();
	while(list.hasNext()){
		res.add("stat", visit(list.next()).render());
	}
	return res;
   }

   @Override public ST visitOperation(BdexParser.OperationContext ctx) {
      
        return visitChildren(ctx);
   }

   @Override public ST visitTopDel(BdexParser.TopDelContext ctx) {
      if(ctx.VARNAME() != null){
         varnameGlobal = ctx.VARNAME().getText();
            
         }
        return visitChildren(ctx);
   }

   @Override public ST visitTopNum(BdexParser.TopNumContext ctx) {
      if(ctx.VARNAME() != null){
         varnameGlobal = ctx.VARNAME().getText();
            
         }
        return visitChildren(ctx);
   }

   

   @Override public ST visitTopSet(BdexParser.TopSetContext ctx) {
      if(ctx.VARNAME() != null){
         varnameGlobal = ctx.VARNAME().getText();
            
         }
        return visitChildren(ctx);
   }

   @Override public ST visitTopRed(BdexParser.TopRedContext ctx) {
      if(ctx.VARNAME() != null){
         varnameGlobal = ctx.VARNAME().getText();
            
         }
        return visitChildren(ctx);
   }


   @Override public ST visitMediaColl(BdexParser.MediaCollContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String coll = generateVarName();
      result += "String "+ coll+" = " + (ctx.STRING().getText()) + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".mediaColl(" + coll + ");\n";
      res.add("text", result);
      return res;

      
   }

   @Override public ST visitMediaLine(BdexParser.MediaLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String line = generateVarName();
      String []render = visit(ctx.expr()).render().split("\n");
      String []last = render[render.length-1].split("=");
      String ls = last[last.length-1];
      result += "int "+ line+" = " + ls + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".mediaLine(" + line + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationSumColl(BdexParser.TableOperationSumCollContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String coll = generateVarName();
      result += "String "+ coll+" = " + (ctx.STRING().getText()) + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".sumColl(" + coll + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationSumLine(BdexParser.TableOperationSumLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String line = generateVarName();
      result += "int "+ line+" = " + ctx.expr().var + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".sumLine(" + line + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationDivColl(BdexParser.TableOperationDivCollContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String coll = generateVarName();
      result += "String "+ coll+" = " + (ctx.STRING().getText()) + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".divColl(" + coll + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationDivLine(BdexParser.TableOperationDivLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String line = generateVarName();
      result += "int "+ line+" = " + ctx.expr().var + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".divLine(" + line + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationMullColl(BdexParser.TableOperationMullCollContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String coll = generateVarName();
      result += "String "+ coll+" = " + (ctx.STRING().getText()) + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".mulColl(" + coll + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitTableOperationMullLine(BdexParser.TableOperationMullLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String line = generateVarName();
      result += "int "+ line+" = " + ctx.expr().var + ";\n";
      String tablename =  generateVarName();
      result += "String "+tablename+" = \"" + varnameGlobal+ "\";\n";
      String table = generateVarName();
      result += "Table "+ table + " = (Table) variables.get("+tablename+");\n";
      ctx.var = generateVarName();
      result += "double " + ctx.var +" = "+ table + ".mulLine(" + line + ");\n";
      res.add("text", result);
      return res;
   }

   @Override public ST visitAddLineStr(BdexParser.AddLineStrContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String Tablename = generateVarName();
      result += "String " + Tablename+ " = \"" + varnameGlobal+"\";\n";
      String table = generateVarName();
      result += "Table "+table+" = (Table) variables.get(" + Tablename + ");\n";
      int length = ctx.STRING().size();
      String vals = generateVarName();
      result += "LinkedList<String> "+ vals+" = new LinkedList<String>();\n";
      for(int i=0; i < length; i++){
         if(ctx.STRING(i) != null){
            result += vals + ".add(" + (ctx.STRING(i).getText()) + ");\n";
         }
      } 
      result += table + ".addRow("+vals+");\n";

      res.add("text", result);
      return res;
   }

   @Override public ST visitDeleteLine(BdexParser.DeleteLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String Tablename = generateVarName();
      result += "String " + Tablename+ " = \"" + varnameGlobal+"\";\n";
      String table = generateVarName();
      result += "Table "+table+" = (Table) variables.get(" + Tablename + ");\n";
      String line = generateVarName();
      result += "int " + line + " = " + ctx.expr().var + ";\n";
      result += table + ".deleteRow("+line+");\n";
      res.add("text", result);
      return res;
      
   }

   @Override public ST visitExtractVarnameOuStringOuINT(BdexParser.ExtractVarnameOuStringOuINTContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String table = generateVarName();
      result += "String "+table+" = "+ ctx.VARNAME(0).getText()+";\n";
      String arrayColls = generateVarName();
      result += "String[] " + arrayColls+";\n";
      if(ctx.VARNAME(1).getText() == null){
      	result += arrayColls+" = new String[" + ctx.STRING().size() + "];\n";
      	for(int i = 0; i< ctx.STRING().size(); i++){
      		result += arrayColls+"[i] = "+(ctx.STRING(i).getText())+";\n";
      	}
      }else{
      	result += arrayColls+" = (String []) variables.get(" + ctx.VARNAME(0).getText() + ");\n";
      }
      String arrayLines = generateVarName();
      result += "int[] " + arrayLines +" = new int[" + ctx.INT().size() + "];\n";
      for(int i = 0; i< ctx.INT().size(); i++){
      	result += arrayLines+"[i] = " + Integer.parseInt(ctx.INT(i).getText()) + ";\n";
      }
      ctx.var = generateVarName();
      result += "Table "+ ctx.var + " = " + "Operations.extraction((Table)variables.get(" + table + ")," + arrayColls + ","+ arrayLines + ");\n";

      res.add("text", result);
      return res;
      
   }

   @Override public ST visitCreatTABLE(BdexParser.CreatTABLEContext ctx) {
	   ST res = templates.getInstanceOf("commonText");
      String result = "";
	   String Tablename = generateVarName();
	   result += "String "+Tablename+" = \"" + ctx.VARNAME().getText()+"\";\n";
      String collnames = generateVarName();
	   result += "LinkedList<String> "+ collnames+" = new LinkedList<String>();\n";
      String length = generateVarName();
      result += "int "+ length+" = "+ ctx.STRING().size() + ";\n";
      for(int i=0;i<ctx.STRING().size();i++){;
         result += collnames+".add("+(ctx.STRING(i).getText())+");\n";
      }
      ctx.var = generateVarName();
      result += "Table "+ctx.var+" = new Table("+collnames+");\n";
      result += "variables.put("+Tablename+","+ctx.var+");\n";
      res.add("text",result);
	   return res;

   }

   @Override public ST visitCreatTableJunction(BdexParser.CreatTableJunctionContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
	   ctx.var = generateVarName();
      result += "String " + ctx.var + " = \"" + ctx.VARNAME(0).getText()+"\";\n";
      result += "Table " + ctx.var + " = " + ctx.junction().var+";\n";
      result += "variables.put("+ctx.VARNAME(0).getText()+","+ctx.var+");\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitCreatTableExtraction(BdexParser.CreatTableExtractionContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
	   ctx.var = generateVarName();
      result += "Table " + ctx.var + " = \"" + ctx.extraction().var+"\";\n";
      result += "variables.put(\""+ctx.var+"\","+ctx.var+");\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitSetValueTable(BdexParser.SetValueTableContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String line = generateVarName();
      result += "int " + line+ " = " + Integer.parseInt(ctx.INT().getText())+ ";\n"; 
      String coll = generateVarName();
      result += "String " + coll + " = " + (ctx.STRING(0).getText()) + ";\n";
      String value = generateVarName();
      result += "String " + value + " = " + (ctx.STRING(1).getText())+ ";\n";
      String tablename = generateVarName();
      result += "String " + tablename+ " = \"" + varnameGlobal + "\";\n";
      String table = generateVarName();
      result += "Table " + table + " = (Table) variables.get(" + tablename + ");\n";
      result += table + ".setVal("+ coll+ "," + line + "," + value + ");\n";
      res.add("text",result);
      return res;
   }

   @Override public ST visitJuncTable(BdexParser.JuncTableContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";

      ctx.var = generateVarName();
      String table1 = generateVarName();

      result += "String " + table1 + " = \"" + ctx.VARNAME(0).getText() + "\";\n";
      String table2 = generateVarName();
      result += "String " + table2 + " = \"" + ctx.VARNAME(1).getText() + "\";\n";

      result += "Table " + ctx.var + " =  Operations.junction((Table) variables.get(" + table1 + "),(Table) variables.get(" + table2 + "));\n";
      
      res.add("text",result);
      return res;
   }

   @Override public ST visitReadColl(BdexParser.ReadCollContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
	   String coll =  generateVarName();
	   result += "String " + coll + " = " + ctx.CollName.getText()+ ";\n";
		String tablename = generateVarName();
		result += "String " + tablename + " = \"" + varnameGlobal + "\";\n";
		String table = generateVarName();
		result += "Table " + table + " = (Table) variables.get(" + tablename + ");\n";
		ctx.var = generateVarName();
      result += "String [] "+ ctx.var + " = " + table + ".getColl(" + coll + ");\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitReadLine(BdexParser.ReadLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
	   String line =  generateVarName();
	   result += "int " + line + " = " + Integer.parseInt(ctx.LineIndex.getText())+ ";\n";
		String tablename = generateVarName();
		result += "String " + tablename + " = \"" + varnameGlobal + "\";\n";
		String table = generateVarName();
		result += "Table " + table + " = (Table) variables.get(" + tablename + ");\n";
		ctx.var = generateVarName();
      result += "String [] "+ ctx.var + " = " + table + ".getLine(" + line + ");\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitReadSTR(BdexParser.ReadSTRContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      String coll =  generateVarName();
	   result += "String " + coll + " = " + ctx.CollName.getText()+ ";\n";
	   String line =  generateVarName();
	   result += "int " + line + " = " + Integer.parseInt(ctx.LineIndex.getText())+ ";\n";
		String tablename = generateVarName();
		result += "String " + tablename + " = \"" + varnameGlobal + "\";\n";
		String table = generateVarName();
		result += "Table " + table + " = (Table) variables.get(" + tablename + ");\n";
		ctx.var = generateVarName();
      result += "String "+ ctx.var + " = " + table + ".getContent().get(" + line + ").get(" + coll + ");\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitPrintStr(BdexParser.PrintStrContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";

      String s;
    	if((ctx.STRING().getText()) != null){
    	   s = (ctx.STRING().getText());
    	 	result += "System.out.println(" + s + ");\n";
    	}
    	

      res.add("text",result);
	return res;
   }

   @Override public ST visitPrintExpr(BdexParser.PrintExprContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";

      
    	if(ctx.expr() != null){
		result += visit(ctx.expr()).render();
    	 	result += "System.out.println(" + ctx.expr().var + ");\n";
    	}

      res.add("text",result);
	return res;
   }

   @Override public ST visitIterationTableCollumnLine(BdexParser.IterationTableCollumnLineContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";

      String coll = generateVarName();
      result += "String " + coll + " = " + (ctx.STRING(0).getText()) + ";\n";
      String logic = generateVarName();
      result += "String " + logic + " = " + (ctx.STRING(1).getText()) + ";\n";
      String tableName = generateVarName();
      result += "String " + tableName + " = \"" + varnameGlobal +"\";\n";
      String table = generateVarName();
      result += "Table " + table  + " = (Table) variables.get(" + tableName + ");\n";
      ctx.var = generateVarName();
      result += "LinkedList<LinkedHashMap<String, Cell>> " + ctx.var + " = " + table + ".iterate(" + coll + ", " + logic + ");\n";
      
      res.add("text",result);
	   return res;
   }

   @Override public ST visitForOperation(BdexParser.ForOperationContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
 
      String pos = generateVarName();
      result += "String " + pos + " = \"" + ctx.VARNAME().getText() + "\";\n";
      String startValue = generateVarName();
      result += "int " + startValue + " = " + Integer.parseInt(ctx.INT(0).getText()) + ";\n";
      String endValue = generateVarName();
      result += "int " + endValue +" = " + Integer.parseInt(ctx.INT(1).getText())+ ";\n";
      result += "for( int i = " + startValue+ ";" + "i<" + endValue + "; i++){\n";
      for(int i = 0; i < ctx.operation().size(); i++){
         result += visit(ctx.operation(i)).render();
      }
      result += "}\n";
      res.add("text",result);
	   return res;
   }

   @Override public ST visitExprDouble(BdexParser.ExprDoubleContext ctx) {
      ST res = templates.getInstanceOf("commonText");

      ctx.var = generateVarName();
      res.add("text", "double "+ ctx.var + " = " + ctx.DOUBLE().getText());
      return res;
   }

  @Override public ST visitExprInt(BdexParser.ExprIntContext ctx) {
      ST res = templates.getInstanceOf("commonText");

      ctx.var = generateVarName();
      res.add("text", "double "+ ctx.var + " = " + ctx.INT().getText());
      return res;
   }

   @Override public ST visitExprMultDivMod(BdexParser.ExprMultDivModContext ctx) {
      ST res = templates.getInstanceOf("commonText");

      ctx.var = generateVarName();
      res.add("text", "double "+ ctx.var +" = " + ctx.expr(0).var + ctx.op.getText() + ctx.expr(1).var + ");\n");
      return res;
   }

   @Override public ST visitExprAddSub(BdexParser.ExprAddSubContext ctx) {
      ST res = templates.getInstanceOf("commonText");

      ctx.var = generateVarName();
      res.add("text", "double "+ ctx.var +" = " + ctx.expr(0).var + ctx.op.getText() + ctx.expr(1).var + ");\n");
      return res;
   }

   @Override public ST visitExprParent(BdexParser.ExprParentContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprVar(BdexParser.ExprVarContext ctx) {
      ST res = templates.getInstanceOf("commonText");

      ctx.var = generateVarName();
      res.add("text", "Object "+ ctx.var + " = " + "variables.get(\"" + ctx.VARNAME().getText() + "\");\n");
      return res;
   }

   @Override public ST visitNewVarNameDouble(BdexParser.NewVarNameDoubleContext ctx) {
      ST res = null;
      if(ctx.expr() != null){
         
	      res = templates.getInstanceOf("decl");
	      res.add("type", "double");
	      ctx.var = ctx.VARNAME(0).getText();
      	res.add("var",  ctx.var);
         res.add("value", ctx.expr().getText());
      }
      if(ctx.numOp() != null && ctx.VARNAME(1)!=null){
         res = templates.getInstanceOf("commonText");
         varnameGlobal = ctx.VARNAME(1).getText();
         String render = visit(ctx.numOp()).render();
         String[] rendA = render.split("\n");
         render = "";
         for(int i = 0; i < rendA.length-1; i++){
            render += rendA[i] + "\n";
	      }
         
         ctx.var = ctx.VARNAME(0).getText();
         String last = rendA[rendA.length-1];
         String [] lS = last.split("=");
         render += "double " + ctx.var + " = " + lS[lS.length-1]+"\n";
         render += "variables.put(\"" + ctx.var + "\", " + ctx.var + ");\n";


         res.add("text", render);
      }
         
      return res;
   }

   @Override public ST visitNewVarNameString(BdexParser.NewVarNameStringContext ctx) {
      ST res = templates.getInstanceOf("decl");
      res.add("type", "String");
      ctx.var = ctx.VARNAME().getText();
      res.add("var",  ctx.var);
      res.add("value", (ctx.STRING().getText()));
      return res;
   }

   @Override public ST visitNewVarNameArray(BdexParser.NewVarNameArrayContext ctx) {
      ST res = templates.getInstanceOf("declArray");
      ctx.var = ctx.VARNAME().getText();
      res.add("var",  ctx.var);
      String args = "";
      for (int i = 0; i < ctx.STRING().size(); i++) {
         args += (ctx.STRING(i).getText());
         if(!(i == ctx.STRING().size()-1)){
            args += ", ";
         }
      }
      res.add("value", args);
      return res;
   }

   @Override public ST visitCreatTableIteration(BdexParser.CreatTableIterationContext ctx) {
      ST res = templates.getInstanceOf("commonText");
      String result = "";
      ctx.var = generateVarName();
      varnameGlobal = ctx.VARNAME(1).getText();
      result = visit(ctx.iteration()).render();

      
      result += "Table " + ctx.var + " = new Table(((Table) variables.get(\""+ varnameGlobal +"\")).getCollNames()" + "," + ctx.iteration().var + ");\n";
      result += "variables.put(\"" + ctx.VARNAME(0).getText() + "\", " + ctx.var + ");\n";
      res.add("text", result);
      return res;
   }

   private int varCount = 0;
   private String generateVarName(){
	varCount++;
	return "v"+varCount;
   }


   private String tableTemplate(Table tempTable, String Tablename){
      String result = "";
      String[][] temp = (tempTable).contString();
      //Table t  = new Table(new String[]{"nome"}, new String[][]{{"ana"},{"bia"}});
      String table = generateVarName();
      result += "Table " + table + " = new Table(new String[]{";  
      for (String coll : tempTable.getCollNames()) {
         result += "\""+ coll +"\"";
         if(!coll.equals(tempTable.getCollNames().getLast())){
            result +=",";
         }
      }
      result += "}, new String[][]{";
      for (String[] line : temp) {
         result += "{";
         for (String elem : line) {
            result += "\""+ elem +"\"";
            if (!elem.equals(line[line.length-1])){
               result += ",";
            }
            
         }
         result += "}";
      }
      result += "});\n";
      
      result += "variables.put("+Tablename+","+table+");\n";
      return result;
   }
}