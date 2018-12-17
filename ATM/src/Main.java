import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);

        System.out.print("Please enter an amount: ");
        int amount = getInput.nextInt();

        ATM machine = new ATM();
        int[] finalBillsArray = machine.withdrawMoney(amount);

        System.out.println();
        System.out.println("5000 notes: " +finalBillsArray[2] +"\n" +
                                     "1000 notes: "  +finalBillsArray[1]+ "\n" +
                                     "500 notes: " +finalBillsArray[0]);
    }

}
