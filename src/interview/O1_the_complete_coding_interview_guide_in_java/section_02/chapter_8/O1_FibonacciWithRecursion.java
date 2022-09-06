package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_8;

public class O1_FibonacciWithRecursion {
    public static void main(String[] args) {

        System.out.print("Fibonacci of Nth number : ");
        System.out.println(fibonacciRecursion(6));

        System.out.print("Series of Nth number : ");
        for (int i = 0; i <= 6; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    static int fibonacciRecursion(int n) {
        if (n <= 1) return n;
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}


/**
 * Te plain recursive algorithm for the Fibonacci numbers has a runtime of O(2pow(n)) and a
 * space complexity of O(n).
 * We'll notice that O(2pow(n)) is far from being efficient. Exponential runtimes' fit the Horrible area of the Big O chart.
 * Can we do this better? Yes, via the Memoization approach.
 */

// Book: The Complete Coding Interview Guide in Java, Page: 185 (210 / 788)