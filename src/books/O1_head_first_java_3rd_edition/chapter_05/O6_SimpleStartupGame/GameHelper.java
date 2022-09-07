package books.O1_head_first_java_3rd_edition.chapter_05.O6_SimpleStartupGame;

import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String p){
        System.out.println(p + " : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
