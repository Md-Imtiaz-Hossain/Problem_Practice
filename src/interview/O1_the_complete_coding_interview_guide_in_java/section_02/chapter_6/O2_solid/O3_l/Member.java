package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O2_solid.O3_l;

public abstract class Member implements TournamentJoiner, TournamentOrganizer {

    private final String name;

    public Member(String name) {
        this.name = name;
    }  
}
