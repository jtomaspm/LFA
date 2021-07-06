import java.util.LinkedList;
import java.util.Arrays;
import java.util.LinkedHashMap;
public class test {
    public static void main(String[] args) {
        //CELLS EXEMPLE
        System.out.println("CELLS EXEMPLE:\n");
        Cell [] cells = new Cell[4];
        cells[0] = new Cell("ola");
        cells[1] = new Cell("adeus");
        cells[2] = new Cell("1");
        cells[3] = new Cell("2");
        for(int i = cells.length-1; i > 0; i--){
            String s1 = cells[i].toString();
            String s2 = cells[i-1].toString();
            cells[i].addVal(cells[i-1].toString());
            System.out.println(s1 + " + " + s2 + " = " + cells[i].toString());
        }
        System.out.println();

        //TABLE EXEMPLE
        System.out.println("TABLE EXEMPLE:\n");
        String[] colls = {"Nome", "Apelido", "1Semestre", "2Semestre"};
        Table table1 = new Table(new LinkedList(Arrays.asList(colls)));
        table1.addRow(new LinkedList(Arrays.asList(new String[]{"Jorge", "Pina", "14", "13"})));
        table1.addRow(new LinkedList(Arrays.asList(new String[]{"Rui", "Sasa", "5", "4"})));
        table1.addRow(new LinkedList(Arrays.asList(new String[]{"Sara", "Zara", "18", "20"})));
        table1.addRow(new LinkedList(Arrays.asList(new String[]{"Hugo", "Lopes", "15", "11"})));
        System.out.println(table1.toString());
        LinkedList<String> medias = new LinkedList<String>();
        for(int i = 0; i < table1.lineNumber(); i++){
            medias.add(table1.mediaLine(i) + "");
        }
        table1.addColl("Media", medias);
        System.out.println(table1.toString());
        Table aprovados = new Table(table1.getCollNames(), table1.iterate("Media", ">= 9.5"));


        //JUNCTION TEST
        String[] c = {"Nome", "NR", "Sex"};
        Table t1 = new Table(new LinkedList(Arrays.asList(c)));
        t1.addRow(new LinkedList(Arrays.asList(new String[]{"qq", "1", "h"})));
        t1.addRow(new LinkedList(Arrays.asList(new String[]{"aa", "2", "m"})));
        String[] c1 = {"Nome", "Apelido", "Data"};
        Table t2 = new Table(new LinkedList(Arrays.asList(c1)));
        t2.addRow(new LinkedList(Arrays.asList(new String[]{"hh", "rr", "5"})));
        t2.addRow(new LinkedList(Arrays.asList(new String[]{"jj", "rr", "3"})));
        Table jun = Operations.junction(t1, t2);
        System.out.println(jun);
        

    }
}
