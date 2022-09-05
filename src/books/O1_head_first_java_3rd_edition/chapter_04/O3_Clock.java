package books.O1_head_first_java_3rd_edition.chapter_04;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class O3_Clock {
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}

class ClockTestDrive{
    public static void main(String[] args) {

        O3_Clock c = new O3_Clock();

        c.setTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        String getTime = c.getTime();

        System.out.println("Current Time is - "  + getTime);

    }
}


// Head first java 3rd edition, page - 277 / 1597