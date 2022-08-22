package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O5_d;

public class Main {

    public static void main(String[] args) {


        System.out.println("\nApproach that follow Dependency Inversion Principle:\n");

        PostgreSQLJdbcUrl p2 = new PostgreSQLJdbcUrl("my_db_PostgreSQLJdbcUrl");
        MySQLJdbcUrl p3 = new MySQLJdbcUrl("my_db_MySQLJdbcUrl");

        ConnectToDatabase c2 = new ConnectToDatabase();

        c2.connect(p2);
        c2.connect(p3);
    }
}




/**
 * SOLID
 * SOLID is an acronym for the first fve Object-Oriented Design (OOD) principles enunciated by Robert C. Martin, also known as Uncle Bob (optional phrase).
 * • S: Single Responsibility Principle
 * • O: Open Closed Principle
 * • L: Liskov's Substitution Principle
 * • I: Interface Segregation Principle
 * • D: Dependency Inversion Principle
 */


// Book: The Complete Coding Interview Guide in Java, Page: 102 (127 / 788)