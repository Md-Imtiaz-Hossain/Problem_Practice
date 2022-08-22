package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O3_l;

public class PremiumMember extends Member {

    public PremiumMember(String name) {
        super(name);
    }
        
    @Override
    public void joinTournament() {
        System.out.println("Premium member joins tournament ...");
    }

    @Override
    public void organizeTournament() {
        System.out.println("Premium member organize tournament ...");
    }
}
