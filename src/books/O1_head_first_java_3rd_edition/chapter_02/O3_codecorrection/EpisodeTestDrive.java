package books.O1_head_first_java_3rd_edition.chapter_02.O3_codecorrection;

public class EpisodeTestDrive {
    public static void main(String[] args) {

        Episode episode = new Episode();
        episode.seriesNumber = 4;

        episode.skipIntro();
        episode.skipToNext();


    }
}

class Episode{
    int seriesNumber;
    int episodeNumber;

    void skipIntro(){
        System.out.println("Sipping intro......");
    }

    void skipToNext(){
        System.out.println("Loading next episode...");
    }
}
