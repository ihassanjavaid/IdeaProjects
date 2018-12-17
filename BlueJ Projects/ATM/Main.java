import java.util.Scanner;

public class Main{
    public static void main()
    {
        Scanner getInput = new Scanner(System.in);
        int amount = getInput.nextInt();
        
        ATM myMachine = new ATM();
        myMachine.withdraw(amount);
    }
}