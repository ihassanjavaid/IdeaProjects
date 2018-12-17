package BackEnd;

import java.util.Scanner;

public class Board extends Dice {
    private Snake[] snakes;
    private Ladder[] ladders;
    public Player[] players;

    private int noOfPlayers;

    public Board(){
        initializeTwoPlayersOnly();
        initLaddersandSnakes();
    }

    private void initializePlayers(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Players: ");
        int numOfPlayers = input.nextInt();
        this.noOfPlayers = numOfPlayers;
        input.nextLine();

        String[] playerNames = new String[numOfPlayers];
        for ( int i = 0 ; i < playerNames.length ; i++ ){
            System.out.println();
            System.out.print("Enter name of 3Player # "+(i+1) +": ");
            playerNames[i] = input.nextLine();
        }

        players = new Player[numOfPlayers];

        for ( int j = 0; j < numOfPlayers ; j++){
            players[j] = new Player(playerNames[j]);
        }
    }

    private void initializeTwoPlayersOnly(){
        players = new Player[2];
        players[0] = new Player();
        players[1] = new Player();
    }

    public int getNoOfPlayers(){
        return this.noOfPlayers;
    }

    private void initLaddersandSnakes(){

        snakes = new Snake[4];
        snakes[0] = new Snake(77, 67);
        snakes[1] = new Snake(71, 50);
        snakes[2] = new Snake(62, 59);
        snakes[3] = new Snake(46, 27);

        ladders = new Ladder[4];
        ladders[0] = new Ladder(2, 23);
        ladders[1] = new Ladder(10, 36);
        ladders[2] = new Ladder(19, 44);
        ladders[3] = new Ladder(32, 57);

    }

    public Ladder[] getLadders() {
        return ladders;
    }

    public Snake[] getSnakes() {
        return snakes;
    }

    @Override
    public int rollTheDice() {
        return super.rollTheDice();
    }
}
