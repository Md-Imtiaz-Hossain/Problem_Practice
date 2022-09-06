package books.O1_head_first_java_3rd_edition.chapter_04.O6_SimpleStartupGame;

import java.util.Scanner;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartup.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("Enter a Number (0-4) ");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

//        int userGuess = 2;
//
//        // Static guess value passed
//        String result = theStartup.checkYourself(userGuess);
//        String testResult = "failed";
//        if (result.equals("hit")) {
//            testResult = "passed";
//        }
//        System.out.println(testResult);


        // Infinite while loop until input value is = 0
//        int r;
//        while ((r = input.nextInt()) != 0){
//            String result = theStartup.checkYourself(r);
//            String testResult = "failed";
//            if (result.equals("hit")) {
//                testResult = "passed";
//            }
//            System.out.println(testResult);
//        }


    }
}


// Head first java 3rd edition, page - 316 / 1597