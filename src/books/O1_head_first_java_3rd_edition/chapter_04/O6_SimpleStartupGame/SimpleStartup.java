package books.O1_head_first_java_3rd_edition.chapter_04.O6_SimpleStartupGame;

public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(int guess){
        String result = "miss";
        for (int cell : locationCells){
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
