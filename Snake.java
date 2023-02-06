package SnakeAndLadder;
import java.util.Random;

public class Snake {
    private static final int NO_PLAY = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;
    int currentPosition = 0;
    Random rand = new Random();

            while(currentPosition < 100) {
        int diceRoll = rand.nextInt(6) + 1;
        int option = rand.nextInt(3);

        switch (option) {
            case NO_PLAY:
                break;
            case LADDER:
                currentPosition += diceRoll;
                break;
            case SNAKE:
                currentPosition -= diceRoll;
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                break;
            default:
                break;
        }
    }

            System.out.println("Player has reached 100!");
}