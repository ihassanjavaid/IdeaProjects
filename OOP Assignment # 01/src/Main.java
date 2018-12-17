import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Rational Number.");
        System.out.println();

        System.out.print("Enter the operation you want to perform: + , - , *, /   ");
        String ope = input.next();
        System.out.println();

        if ( ope.equals("+") || ope.equals("-") || ope.equals("*") || ope.equals("/") ) {

            char op = ope.charAt(0);

            System.out.println("Enter 1st Rational Number");
            Rational ratNum1 = new Rational(input.nextInt(), input.nextInt());
            System.out.println();
            System.out.println("Enter 2nd Rational Number");
            Rational ratNum2 = new Rational(input.nextInt(), input.nextInt());

            Rational ans;

            switch (op) {

                case '+':
                    ans = ratNum1.addRationals(ratNum2);
                    ans.displayRational();
                    break;

                case '-':
                    ans = ratNum1.subtractRationals(ratNum2);
                    ans.displayRational();
                    break;

                case '*':
                    ans = ratNum1.multiplyRationals(ratNum2);
                    ans.displayRational();
                    break;

                case '/':
                    ans = ratNum1.divideRationals(ratNum2);
                    ans.displayRational();
                    break;
            }
        }
        else {
            System.out.println("Please enter a valid operation!");
        }
    }
}
