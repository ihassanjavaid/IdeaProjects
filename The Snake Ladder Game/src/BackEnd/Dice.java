package BackEnd;

import java.util.Random;

public abstract class Dice{

    public int rollTheDice(){
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
}