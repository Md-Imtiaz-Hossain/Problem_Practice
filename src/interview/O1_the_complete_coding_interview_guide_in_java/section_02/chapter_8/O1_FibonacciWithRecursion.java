package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_8;

public class O1_FibonacciWithRecursion {
    public static void main(String[] args) {
        int n = 8;

        // find out nth position fibonacci number and print.
        System.out.print("Fibonacci of Nth number : ");
        System.out.println(fib(n));


        // print fibonacci number till nth number
        System.out.print("Series of Nth number : ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(fib(i) + " ");
        }

        int sum = 0;
        for (int i = 0 ; i < n ; i++){
            sum = sum + fib(i);
        }
        System.out.println("\nSummation of all series number: " + sum);

    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

}


/**
 * Te plain recursive algorithm for the Fibonacci numbers has a runtime of O(2pow(n)) and a
 * space complexity of O(n).
 * We'll notice that O(2pow(n)) is far from being efficient. Exponential runtimes' fit the Horrible area of the Big O chart.
 * Can we do this better? Yes, via the Memoization approach.
 */

// Book: The Complete Coding Interview Guide in Java, Page: 180 (205 / 788)