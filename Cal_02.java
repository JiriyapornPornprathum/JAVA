public class Cal_02 {
    private String Str = "";
    private String opt = "";
    private Double number1;
    private Double number2;
    private int number; 

    public Cal_02() {
    }

    public Cal_02(double x) {
        setValue1( x );
    }

    public void setValue1(double x){
        this.number1 = x;
        System.out.println(this.number1);
    }

    public void setValue2(String x){
        this.number2 = Double.parseDouble(x);
    }

    public void setValue3(int n){ 
        this.number = n; 
    }

    public void setOpt(String x){
        this.opt = x;
        System.out.println(this.opt);
    }

    public void setFree(){
        this.Str = "";
    }

    /* public void setString(String x){
        this.Str = x;
    } */

    public double getValue(){
        return(this.number1);
    }

    public String toString(){
        return(Double.toString(getValue()));
    }

    public void addValue(String Str){
        this.Str += Str;
        System.out.println(this.Str);
        setValue1(Double.parseDouble(this.Str));
    }

    public void Cal_Value(String x){
        Double num1 = this.number2;
        Double num2 = Double.parseDouble(x);

        if (this.opt.equals("+")) {
            this.number1 = num1 + num2;
        }else if (this.opt.equals("-")) {
            this.number1 = num1 - num2;
        }else if (this.opt.equals("*")) {
            this.number1 = num1 * num2;
        }else if (this.opt.equals("/")) {
            this.number1 = num1 / num2;
        }else{
            System.out.println("none");
        }
    }
   
}
