package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int a = 5;


            try {
                System.out.print("Enter B: ");
                int b = input.nextInt();
                a = a / b;
                System.out.println(a);
            } catch (ArithmeticException e) {

                System.out.println(e);
            }
            catch (InputMismatchException e) {
                System.out.println(e);
            } finally {
                System.out.println("End of program");
            }
        }
    }
}
