package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O3_l;

public class FreeMember implements TournamentJoiner {

    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("Free member joins tournament ...");
    }
}
