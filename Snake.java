package SnakeAndLadder;
import java.util.Random;

public class Snake {
    public static void main(String[] args) {
        Random rand = new Random();
        int diceRoll = rand.nextInt(6) + 1;
        System.out.println("Dice roll: " + diceRoll);
    }
}