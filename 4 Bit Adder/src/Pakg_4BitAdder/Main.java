package Pakg_4BitAdder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();

        boolean M = false; // M = 0 for Addition, M = 1 for Subtraction



        // Getting inputs
        System.out.println("Enter A in 4-bits");
        boolean[] A;
        A = getBitInputs("A");

        System.out.println("Enter B in 4-bits");
        boolean[] B;
        B = getBitInputs("B");

        System.out.println();

        System.out.print("Choose operation: ");
        char op = input.next().charAt(0);
        if ( op == '-' )
            M = true;

        System.out.println();

        boolean[] sum = new boolean[4];
        boolean[] carry = new boolean[5];

        boolean B0_out = XOR(B[0], M);
        boolean B1_out = XOR(B[1], M);
        boolean B2_out = XOR(B[2], M);
        boolean B3_out = XOR(B[3], M);

        carry[0] = M;

        sum[0] = FullAdder(A[0], B0_out, carry[0]).sum;
        carry[1] = FullAdder(A[0], B0_out, carry[0]).carry;

        sum[1] = FullAdder(A[1], B1_out, carry[1]).sum;
        carry[2] = FullAdder(A[1], B1_out, carry[1]).carry;

        sum[2] = FullAdder(A[2], B2_out, carry[2]).sum;
        carry[3] = FullAdder(A[2], B2_out, carry[2]).carry;

        sum[3] = FullAdder(A[3], B3_out, carry[3]).sum;
        carry[4] = FullAdder(A[3], B3_out, carry[3]).carry;

        //ShowingOutputs
        printBits(sum);

        System.out.println();
        System.out.println("Carry: " +converter(carry[4]));
        System.out.println("V: " +converter(XOR(carry[3], carry[4])));

    }

    public static Answers FullAdder(boolean a, boolean b, boolean c_in){

        Answers halfAdderOne = new Answers();

        halfAdderOne.sum = HalfAdder(a, b).sum;
        halfAdderOne.carry = HalfAdder(a, b).carry;

        Answers halfAdderSecond = new Answers();

        halfAdderSecond.sum = HalfAdder(halfAdderOne.sum, c_in).sum;
        halfAdderSecond.carry = HalfAdder(halfAdderOne.sum, c_in).carry;

         boolean finalCarryOut = OR(halfAdderSecond.carry, halfAdderOne.carry);

        Answers finalAnswer = new Answers();

        finalAnswer.sum = halfAdderSecond.sum;
        finalAnswer.carry = finalCarryOut;

        return finalAnswer;
    }

    public static Answers HalfAdder(boolean a, boolean b){
        Answers answer = new Answers();
        answer.sum = XOR(a, b);
        answer.carry = AND(a, b);
        return answer;
    }

    private static boolean XOR(boolean a, boolean b){
        return a == b;
    }

    private static boolean AND(boolean a, boolean b){
        return a && b;
    }

    private static boolean OR(boolean a, boolean b){
        return a || b;
    }

    private static void printBits(boolean[] array){
        System.out.print("Answer: ");
        System.out.println(converter(array[3]) +" " +converter(array[2]) +" " +converter(array[1]) +" " +converter(array[0]));
    }

    private static boolean[] getBitInputs(String var){
        Scanner input = new Scanner(System.in);

         boolean[] inputArray = new boolean[4];

        System.out.println();
        System.out.print("Please Enter "+var+": ");

        String inputString = input.next();

        for ( int i = 3, j = 0; i >=0 ; i--, j++ ){
            inputArray[i] = getIntFromChar(inputString.charAt(j));
        }
        return inputArray;
    }

    private static  int converter(boolean bool){
        if (bool)
            return 1;
        return 0;
    }

    private static boolean getIntFromChar(char ch){
        return ch != '0';
    }
}

class Answers{
    public boolean sum;
    public boolean carry;
 }

