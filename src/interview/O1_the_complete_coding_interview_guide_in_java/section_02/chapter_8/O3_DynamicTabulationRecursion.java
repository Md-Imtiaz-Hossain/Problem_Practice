package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_8;

public class O3_DynamicTabulationRecursion {
    public static void main(String[] args) {

        System.out.print("Fibonacci of Nth number : ");
        System.out.println(fibonacciTabulation(8));

        System.out.print("Series of Nth number : ");
        for (int i = 0; i <= 8; i++) {
            System.out.print(fibonacciTabulation(i) + " ");
        }
    }

    static int fibonacciTabulation(int k) {
        if (k <= 1) {
            return k;
        }
        int first = 1;
        int second = 0;
        int result = 0;
        for (int i = 1; i < k; i++) {
            result = first + second;
            second = first;
            first = result;
        }
        return result;
    }
}
