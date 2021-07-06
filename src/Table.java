import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;


public class Table implements Comparable<Table> {
  private LinkedList<LinkedHashMap<String, Cell>> tableContent;
  private LinkedList<String> collNames;

  public Table(LinkedList<String> colls){
    this.collNames = colls;
    this.tableContent = new LinkedList<LinkedHashMap<String, Cell>>();
  }

  public Table(LinkedList<String> colls, LinkedList<LinkedHashMap<String, Cell>> content){
    this.collNames = colls;
    this.tableContent = content;
  }

  public Table(String[] collNames, String[][]cont){
    this.collNames = new LinkedList<String>(Arrays.asList(collNames));
    this.tableContent = new LinkedList<LinkedHashMap<String, Cell>>();
    int i = 0;
    for (String[] line : cont) {
      LinkedHashMap<String, Cell> row = new LinkedHashMap<String, Cell>();
      for (String elem : line) {
        row.put(this.collNames.get(i), new Cell(elem));                
      }
      i++;
      this.tableContent.add(row);
    }

  }

  public String[][] contString(){
    int lines = this.tableContent.size();
    int colls = this.collNumber();
    String [][] cont = new String[lines][colls];

    for (int line = 0; line < lines; line++) {
      for (int coll = 0; coll < colls; coll++) {
        cont[line][coll] = this.tableContent.get(line).get(this.collNames.get(coll)).toString();
      }
    }
    return cont;
  }

  public LinkedList<LinkedHashMap<String, Cell>> getContent(){
    return this.tableContent;
  }

  public LinkedList<String> getCollNames(){
    return this.collNames;
  }

  public LinkedHashMap<String, Cell> getRow(int i){
    return tableContent.get(i);
  }

  public String [] getLine(int line){
    int size = collNumber();
    String [] result = new String[size];
    for (int i = 0; i < size; i++) {
      result[i] = tableContent.get(line).get(collNames.get(i)).toString();
    }
    return result;
  }

  public String [] getColl(String coll){
    int size = tableContent.size();
    String [] result = new String[size];
    for (int i = 0; i < size; i++) {
      result[i] = tableContent.get(i).get(coll).toString();
    }
    return result;
  }

  public int lineNumber(){
    return this.tableContent.size();
  }

  public int collNumber(){
    return this.collNames.size();
  }


  public void addColl (String collName, LinkedList<String> valls){
    int i = 0;
    this.collNames.add(collName);
    for (LinkedHashMap<String, Cell> row : this.tableContent) {
      row.put(collName, new Cell(valls.get(i)));
      i++;
    }
  }

  public void  setVal(String coll, int line, String val){

    tableContent.get(line).get(coll).setVal(val);
  }

  //---------TABLE-OPERATIONS---------//


  // ex: iterate("Idade", "< 10")
  public LinkedList<LinkedHashMap<String, Cell>> iterate(String coll, String logic){
    if(!collNames.contains(coll)){
      return new LinkedList<LinkedHashMap<String, Cell>>();
    }
    LinkedList<LinkedHashMap<String, Cell>> result = new LinkedList<LinkedHashMap<String, Cell>>();
    String [] args = logic.split(" ");
    Cell val = new Cell(args[1]);
    int compare;
    switch (args[0]) {
      case "<": 
        for(LinkedHashMap<String, Cell> row : this.tableContent){
          if(row.get(coll).getType().equals("NUMBER")){
            compare = row.get(coll).compareTo(val);
            if(compare == -1){
              result.add(row);
            }
          }
        }

        break;

      case "<=":
        for(LinkedHashMap<String, Cell> row : this.tableContent){
          if(row.get(coll).getType().equals("NUMBER")){
            compare = row.get(coll).compareTo(val);
            if(compare == -1 || compare == 0){
              result.add(row);
            }
          }
        }

        break;

      case ">":
        for(LinkedHashMap<String, Cell> row : this.tableContent){
          if(row.get(coll).getType().equals("NUMBER")){
            compare = row.get(coll).compareTo(val);
            if(compare == 1){
              result.add(row);
            }
          }
        }

        break;

      case ">=":
        for(LinkedHashMap<String, Cell> row : this.tableContent){
          if(row.get(coll).getType().equals("NUMBER")){
            compare = row.get(coll).compareTo(val);
            if(compare == 1 || compare == 0){
              result.add(row);
            }
          }
        }

        break;
      case "=":
        for(LinkedHashMap<String, Cell> row : this.tableContent){
          if(row.get(coll).getType().equals("NUMBER")){
            compare = row.get(coll).compareTo(val);
            if(compare == 0){
              result.add(row);
            }
          }
        }

        break;

      default:
        return new LinkedList<LinkedHashMap<String, Cell>>();
    }
    return result;
  }



  public void addRow(LinkedList<String> vals){
    LinkedHashMap<String,Cell> row = new LinkedHashMap<String, Cell>();
    for (int i = 0; i < vals.size() && i < collNames.size(); i++){
      row.put(collNames.get(i), new Cell(vals.get(i)));
    }
    tableContent.add(row);
  }

  public void addMapRow(LinkedHashMap<String, Cell> row){
    for (String coll : this.collNames) {
      if(!row.keySet().contains(coll)){
        row.put(coll, new Cell());
      }
    }
    tableContent.add(row);
  }

  public boolean deleteRow(int row){
    if(row < this.tableContent.size()){
      this.tableContent.remove(row);
      return true;
    }else{
      return false;
    }
  }

  public void deleteRows(LinkedList<LinkedHashMap<String, Cell>> result){
    for(LinkedHashMap<String, Cell> row : result){
      this.tableContent.remove(row);
    }
  }

  public double mediaColl(String coll){
    double media = 0;
    int count = 0;
    for (LinkedHashMap<String,Cell> row : tableContent) {
      Cell c = row.get(coll);
      if(c.getType().equals("NUMBER")){
        media += c.getVal();
        count++;
      }    
    }
    media /= count;
    return media;
  }

  public double mediaLine(int line){
    double media = 0;
    int count = 0;
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        media += c.getVal();
        count++;
      }
    }
    media /= count;
    return media;
  }

  public double sumColl(String coll){
    double sum = 0;
    for (LinkedHashMap<String,Cell> row : tableContent) {
      Cell c = row.get(coll);
      if(c.getType().equals("NUMBER")){
        sum += c.getVal();
      }    
    }
    return sum;
  }

  public double sumLine(int line){
    double sum = 0;
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        sum += c.getVal();
      }
    }
    return sum;
  }

  public double divColl(String coll){
    double sum = 0;
    boolean div = false;
    for (LinkedHashMap<String,Cell> row : tableContent) {
      Cell c = row.get(coll);
      if(c.getType().equals("NUMBER")){
        if(!div){
          sum += c.getVal();
          div = true;
        }else{
          sum /= c.getVal();
        }
      }    
    }
    return sum;
  }

  public double divLine(int line){
    boolean div = false;
    double sum = 0;
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        if(!div){
          sum += c.getVal();
          div = true;
        }else{
          sum /= c.getVal();
        }
      }
    }
    return sum;
  }

  public double mulColl(String coll){
    double sum = 0;
    boolean div = false;
    for (LinkedHashMap<String,Cell> row : tableContent) {
      Cell c = row.get(coll);
      if(c.getType().equals("NUMBER")){
        if(!div){
          sum += c.getVal();
          div = true;
        }else{
          sum *= c.getVal();
        }
      }    
    }
    return sum;
  }

  public double mulLine(int line){
    boolean div = false;
    double sum = 0;
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        if(!div){
          sum += c.getVal();
          div = true;
        }else{
          sum *= c.getVal();
        }
      }
    }
    return sum;
  }



  @Override
  public String toString(){
    String result = "";
    for (String collName : collNames) {
      result += collName + " ";
    }
    result += "\n";

    if(tableContent != null){
      for (LinkedHashMap<String,Cell> row : tableContent) {
        for (String key : collNames) {
          result += row.get(key) + " ";
        }
        result += "\n";
      }
    }

    return result;
  }

  public void addToLine(int line, double val){
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(line).get(key).setVal((c.getVal() + val) + "");
      }
    }
  }

  public void addToColl(String coll, double val){
    for (int row = 0; row < tableContent.size(); row++) {
      Cell c = tableContent.get(row).get(coll);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(row).get(coll).setVal((c.getVal() + val) + "");
      }
    }
  }

  public void subToLine(int line, double val){
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(line).get(key).setVal((c.getVal() - val) + "");
      }
    }
  }

  public void subToColl(String coll, double val){
    for (int row = 0; row < tableContent.size(); row++) {
      Cell c = tableContent.get(row).get(coll);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(row).get(coll).setVal((c.getVal() - val) + "");
      }
    }
  }

  public void mulToLine(int line, double val){
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(line).get(key).setVal((c.getVal() * val) + "");
      }
    }
  }

  public void mulToColl(String coll, double val){
    for (int row = 0; row < tableContent.size(); row++) {
      Cell c = tableContent.get(row).get(coll);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(row).get(coll).setVal((c.getVal() * val) + "");
      }
    }
  }

  public void divToLine(int line, double val){
    for (String key : this.collNames) {
      Cell c = this.tableContent.get(line).get(key);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(line).get(key).setVal((c.getVal() / val) + "");
      }
    }
  }

  public void divToColl(String coll, double val){
    for (int row = 0; row < tableContent.size(); row++) {
      Cell c = tableContent.get(row).get(coll);
      if(c.getType().equals("NUMBER")){
        this.tableContent.get(row).get(coll).setVal((c.getVal() / val) + "");
      }
    }
  }
  @Override
  public int compareTo(Table other){
    return Integer.compare(this.collNumber(), other.collNumber());
  }

}
