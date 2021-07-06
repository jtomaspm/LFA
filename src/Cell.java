public class Cell implements Comparable<Cell>{

    private String value;

    public Cell(){
        this.value = "null";
    }

    public Cell(String value){
        this.setVal(value);
    }


    private boolean checkNumber(String value){
        try {
            double val = Double.parseDouble(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public double getVal(){
        if(checkNumber(this.value)){
            return Double.parseDouble(this.value);
        }else{
            return 0;
        }
    }

    public void setVal(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }

    @Override
    public int compareTo(Cell other){
        if(this.getType().equals("NUMBER") && other.getType().equals("NUMBER")){
            return Double.compare(this.getVal(), other.getVal());
        }else if(this.getType().equals("TEXT") && other.getType().equals("TEXT")){
            return Integer.compare(this.toString().length(), other.toString().length());
        }else if(this.getType().equals("TEXT") && other.getType().equals("NUMBER")){
            return Integer.compare(this.toString().length(), (int)(other.getVal()));
        }else if(this.getType().equals("NUMBER") && other.getType().equals("TEXT")){
            return Integer.compare( (int)(this.getVal()), other.toString().length());
        }
        return 10;
    }

    public String getType(){
        if(checkNumber(this.value)){
            return "NUMBER";
        }
        return "TEXT";
    }

    public void addVal(String value){
        switch (this.getType()) {
            case "NUMBER":
            double n1 = 0;
                if(checkNumber(value)){
                    n1 = Double.parseDouble(value);
                    double n2 = Double.parseDouble(this.toString());
                    n1 += n2;
                    this.value = n1 + "";
                }else{
                    this.value +=  value;
                }
                break;
                
            case "TEXT":
                this.value +=  value;
                break;
        }
    }

}