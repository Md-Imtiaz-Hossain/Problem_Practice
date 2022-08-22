package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O1_oop.inheritance;

public class Main {
    public static void main(String[] args) {

        Programmer p = new Programmer("Md Imtiaz Hossain", "L-Star");

        String name = p.getName();
        String team = p.getTeam();

        System.out.println(name + " is assigned to the " + team + " team");
    }
}








// Book: The Complete Coding Interview Guide in Java, Page: 73(98/788)