import java.util.*;
public class Output {
	private static HashMap<String,Object> variables = new HashMap<String,Object>();
	public static void main(String [] args){
		String v1 = "Liga1";
		LinkedList<String> v2 = new LinkedList<String>();
		int v3 = 5;
		v2.add("Nome EquipaA");
		v2.add("vitorias");
		v2.add("derrotas");
		v2.add("empates");
		v2.add("pontos");
		Table v4 = new Table(v2);
		variables.put(v1,v4);
		String v5 = "Liga2";
		LinkedList<String> v6 = new LinkedList<String>();
		int v7 = 5;
		v6.add("Nome EquipaB");
		v6.add("vitorias");
		v6.add("derrotas");
		v6.add("empates");
		v6.add("pontos");
		Table v8 = new Table(v6);
		variables.put(v5,v8);
		String v9 = "Liga1";
		Table v10 = (Table) variables.get(v9);
		LinkedList<String> v11 = new LinkedList<String>();
		v11.add("Man City");
		v11.add("12");
		v11.add("0");
		v11.add("0");
		v11.add("36");
		v10.addRow(v11);
		String v12 = "Liga1";
		Table v13 = (Table) variables.get(v12);
		LinkedList<String> v14 = new LinkedList<String>();
		v14.add("Psg");
		v14.add("11");
		v14.add("0");
		v14.add("1");
		v14.add("30");
		v13.addRow(v14);
		String v15 = "Liga1";
		Table v16 = (Table) variables.get(v15);
		LinkedList<String> v17 = new LinkedList<String>();
		v17.add("Benfica");
		v17.add("9");
		v17.add("3");
		v17.add("0");
		v17.add("21");
		v16.addRow(v17);
		Object v18 = variables.get("Liga1");
		System.out.println(v18);
		String v19 = "Liga2";
		Table v20 = (Table) variables.get(v19);
		LinkedList<String> v21 = new LinkedList<String>();
		v21.add("Barcelona");
		v21.add("12");
		v21.add("0");
		v21.add("0");
		v21.add("36");
		v20.addRow(v21);
		String v22 = "Liga2";
		Table v23 = (Table) variables.get(v22);
		LinkedList<String> v24 = new LinkedList<String>();
		v24.add("Sporting");
		v24.add("11");
		v24.add("0");
		v24.add("1");
		v24.add("30");
		v23.addRow(v24);
		String v25 = "Liga2";
		Table v26 = (Table) variables.get(v25);
		LinkedList<String> v27 = new LinkedList<String>();
		v27.add("Juventus");
		v27.add("10");
		v27.add("2");
		v27.add("0");
		v27.add("24");
		v26.addRow(v27);
		Object v28 = variables.get("Liga2");
		System.out.println(v28);
		String v30 = "pontos";
		String v31 = ">= 30";
		String v32 = "Liga1";
		Table v33 = (Table) variables.get(v32);
		LinkedList<LinkedHashMap<String, Cell>> v34 = v33.iterate(v30, v31);
		Table v29 = new Table(((Table) variables.get("Liga1")).getCollNames(),v34);
		variables.put("firstSecondPlaceA", v29);
		String v36 = "pontos";
		String v37 = ">= 30";
		String v38 = "Liga2";
		Table v39 = (Table) variables.get(v38);
		LinkedList<LinkedHashMap<String, Cell>> v40 = v39.iterate(v36, v37);
		Table v35 = new Table(((Table) variables.get("Liga2")).getCollNames(),v40);
		variables.put("firstSecondPlaceB", v35);
		String v41 = "Champions";
		LinkedList<String> v42 = new LinkedList<String>();
		int v43 = 0;
		Table v44 = new Table(v42);
		variables.put(v41,v44);
		String v46 = "Liga1";
		String v47 = "Liga2";
		Table v45 =  Operations.junction((Table) variables.get(v46),(Table) variables.get(v47));
		String v48 = "vitorias";
		String v49 = "Champions";
		Table v50 = (Table) variables.get(v49);
		double victorys =  v50.mediaColl(v48);
		String v52 = "derrotas";
		String v53 = "Champions";
		Table v54 = (Table) variables.get(v53);
		double loses =  v54.mediaColl(v52);
		String v56 = "empates";
		String v57 = "Champions";
		Table v58 = (Table) variables.get(v57);
		double draws =  v58.mediaColl(v56);
		String v60 = "pontos";
		String v61 = "Champions";
		Table v62 = (Table) variables.get(v61);
		double TotalPoints =  v62.sumColl(v60);
		Object v64 = variables.get("victorys");
		System.out.println(v64);
		Object v65 = variables.get("loses");
		System.out.println(v65);
		Object v66 = variables.get("draws");
		System.out.println(v66);
		Object v67 = variables.get("TotalPoints");
		System.out.println(v67);
		String v69 = "pontos";
		String v70 = "<= 22";
		String v71 = "Champions";
		Table v72 = (Table) variables.get(v71);
		LinkedList<LinkedHashMap<String, Cell>> v73 = v72.iterate(v69, v70);
		Table v68 = new Table(((Table) variables.get("Champions")).getCollNames(),v73);
		variables.put("lastPlace", v68);
		Object v74 = variables.get("Champions");
		System.out.println(v74);

	}
}