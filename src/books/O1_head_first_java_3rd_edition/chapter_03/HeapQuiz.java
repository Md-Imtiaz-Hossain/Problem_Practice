package books.O1_head_first_java_3rd_edition.chapter_03;

public class HeapQuiz {
    int id = 0;

    public static void main(String[] args) {
        int x = 0;

        HeapQuiz[] heapQuiz = new HeapQuiz[5];

        while (x < 3){
            heapQuiz[x] = new HeapQuiz();
            heapQuiz[x].id = x;
            x += 1;
        }

        heapQuiz[3] = heapQuiz[1];
        heapQuiz[4] = heapQuiz[1];
        heapQuiz[3] = null;
        heapQuiz[4] = heapQuiz[0];
        heapQuiz[0] = heapQuiz[3];
        heapQuiz[3] = heapQuiz[2];
        heapQuiz[2] = heapQuiz[0];


        try {
            System.out.println(heapQuiz[4].id);
            System.out.println(heapQuiz[3].id);
            System.out.println(heapQuiz[1].id);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

// Head first Java 3rd edition, Page - 227 / 1597
