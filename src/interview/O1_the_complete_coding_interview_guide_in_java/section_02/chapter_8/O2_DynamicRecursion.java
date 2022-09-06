package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_8;

public class O2_DynamicRecursion {
    public static void main(String[] args) {

        System.out.print("Fibonacci of Nth number : ");
        System.out.println(fibonacciDynamic(7));

        System.out.print("Series of Nth number : ");
        for (int i = 0; i <= 7; i++) {
            System.out.print(fibonacciDynamic(i) + " ");
        }

    }
    static int fibonacciDynamic(int num) {
        int[] cache = new int[1000];
        if (num <= 1) return num;
        if (cache[num] != 0) return cache[num];
        cache[num] = fibonacciDynamic(num - 1) + fibonacciDynamic(num - 2);
        return cache[num];
    }
}


