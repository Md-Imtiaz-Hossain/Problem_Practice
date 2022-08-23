package books.O1_head_first_java.chapter_02.O2_GuessGame;

import java.util.Random;
public class Player {
    public int number;

    public void guess() {
        Random randomGenerator = new Random();
        number = randomGenerator.nextInt(10);
    }
}
