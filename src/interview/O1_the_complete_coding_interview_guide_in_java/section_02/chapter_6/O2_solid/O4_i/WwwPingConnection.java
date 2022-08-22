package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O4_i;

public class WwwPingConnection implements HttpConnection {

    private final String www;

    public WwwPingConnection(String www) {
        this.www = www;
    }
        
    @Override
    public void http() {
        System.out.println("Setup an HTTP connection to " + www);
    }

    @Override
    public void connect() {
        System.out.println("Connect to " + www);
    }
//
//    @Override
//    public void socket() {
//        System.out.println("Socket to " + www);
//    }
}
