package books.O1_head_first_java_3rd_edition.chapter_04;

public class O4_Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;

        O4_Mix4[] mixes = new O4_Mix4[20];

        int i = 0;

        while (i<20) {
            mixes[i] = new O4_Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count = count + 1;
            count = count + mixes[i].maybeNew(i);
            i = i + 1;
        }
        System.out.println(count + " " + mixes[1].counter);


    }

    private int maybeNew(int index) {
        if (index<5) {
            O4_Mix4 mix = new O4_Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }

}

// candidate--> i<9, index<5 output--> 14 1
// candidate--> i<20, index<5 output--> 25 1
// candidate--> i<7, index<7 output--> 14 1
// candidate--> i<19, index<1 output--> 20 1



// Head first java 3rd edition, page - 281 / 1597