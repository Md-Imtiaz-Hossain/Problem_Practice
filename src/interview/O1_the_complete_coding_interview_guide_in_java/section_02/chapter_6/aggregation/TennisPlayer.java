package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.aggregation;

public class TennisPlayer {
    private String name;
    private Racket racket;
    public TennisPlayer(String name, Racket racket) {
        this.name = name;
        this.racket = racket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Racket getRacket() {
        return racket;
    }

    public void setRacket(Racket racket) {
        this.racket = racket;
    }
}
