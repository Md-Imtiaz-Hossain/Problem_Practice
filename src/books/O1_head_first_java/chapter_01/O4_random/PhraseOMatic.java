package books.O1_head_first_java.chapter_01.O4_random;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {

        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"Md Imtiaz", "A N M Bajlur rahman", "Sohag", "Seikh"};

        String[] wordListTwo = {"House", "Bilding", "Room", "Dining"};

        String[] wordListThree = {"Chair", "Table", "Door"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + "'s " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}


// Book: Head First Java, Page: 108 / 1597