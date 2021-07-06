import java.util.LinkedList;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Operations {

    public static Table junction (Table t1, Table t2){
        LinkedList<String> collNames = t1.getCollNames();
        for (String collName : t2.getCollNames()) {
            if(!collNames.contains(collName)){
                collNames.add(collName);
            }
        }
        Table result = new Table(collNames);
        for(LinkedHashMap<String, Cell> row : t1.getContent()){
            for (String coll : collNames) {
                if(!row.keySet().contains(coll)){
                    row.put(coll, new Cell());
                }
            }
            result.addMapRow(row);
        }
        for(LinkedHashMap<String, Cell> row : t2.getContent()){
            for (String coll : collNames) {
                if(!row.keySet().contains(coll)){
                    row.put(coll, new Cell());
                }
            }
            result.addMapRow(row);
        }
        return result;
    }

    public static Table extraction (Table t, String [] colls, int [] lines){
        Table result = new Table(new LinkedList<String>(Arrays.asList(colls)));
        for (int line : lines) {
            LinkedList<String> row = new LinkedList<String>();
            for (String coll : colls) {
                String c = t.getContent().get(line).get(coll).toString();
                row.add(c);
            }
            result.addRow(row);
        }

        return result;
    }

    
}
