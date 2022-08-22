package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O5_d;

public class MySQLJdbcUrl implements JdbcUrl {

    private final String dbName;

    public MySQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String get() {
        return "jdbc:mysql:// ... " + this.dbName;
    }
}
