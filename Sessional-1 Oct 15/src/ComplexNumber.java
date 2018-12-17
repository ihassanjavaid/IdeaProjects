public class ComplexNumber {
    private int a;
    private int b;
    public static void main(String[] args){
        ComplexNumber compnum1 = new ComplexNumber(6, 7);
        ComplexNumber compnum2 = new ComplexNumber(9, 3);
        System.out.println(compnum1.add(compnum2).toString());
        System.out.println(compnum1.multiply(compnum2).toString());
    }
    public ComplexNumber(int a, int b){
        this.a = a;
        this.b = b;
    }
    public ComplexNumber(ComplexNumber comp){
        this.a = comp.a;
        this.b=comp.b;
    }
    public String toString(){
        return  this.a+ "+" +this.b +"i";
    }
    public ComplexNumber add(ComplexNumber num){
        int x = this.a + num.a;
        int  y = this.b + num.b;
        return new ComplexNumber(x, y);
    }
    public ComplexNumber multiply(ComplexNumber num) {
        int x = this.a * num.a - this.b * num.b;
        int y = this.a * num.b + this.b * num.b;
        return new ComplexNumber(x, y);
    }
}
