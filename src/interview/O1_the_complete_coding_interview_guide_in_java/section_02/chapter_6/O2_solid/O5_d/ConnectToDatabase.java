package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O5_d;

public class ConnectToDatabase {

    public void connect(JdbcUrl jdbcUrl) {
        System.out.println("Connecting to " + jdbcUrl.get());
    }
}
