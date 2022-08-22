package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O3_l;

public class VipMember extends Member {

    public VipMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("VIP member joins tournament ...");
    }

    @Override
    public void organizeTournament() {
        System.out.println("VIP member organize tournament ...");
    }
}
