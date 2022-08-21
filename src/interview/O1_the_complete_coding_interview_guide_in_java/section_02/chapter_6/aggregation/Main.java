package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.aggregation;

public class Main {
    public static void main(String[] args) {

        Racket racket = new Racket("Younex 5990", 100, 300);
        TennisPlayer player = new TennisPlayer("Imtiaz Hossain", racket);

        System.out.println("Player name: '" + player.getName() + "' plays with Type: '" + player.getRacket().getType() + "'");
    }
}




// Book: The Complete Coding Interview Guide in Java, Page:  81 (106 / 788)