package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_9;

/**
 * 5 = 101, ~5 = 010, 010 + 1 = (1)101 = -5 [here (1) is sign bit represent that it is a negative number]
 *  1001011
 * -75      = 10110101
 * -75 >> 1 = 11011010
 *
 * -75      = 10110101
 * -75 >> 2 = 11101101
 */
class NegativeNumber{
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(75));
        System.out.println(Integer.toBinaryString(-75));
        System.out.println(Integer.toBinaryString(-75 >> 1));
        System.out.println(Integer.toBinaryString(-75));
        System.out.println(Integer.toBinaryString(-75 >> 2));
    }
}

/**
 * Signed Left Shift [<<]
 * Signed Lef Shift, or shortly Lef Shift , takes two operands. Lef Shift gets the bit pattern
 * of the first operand (lef-hand side operand) and shift it to the left by the number of
 * positions given by the second operand (right-hand operand).
 *
 * Note
 * 1. Lef shifting a number by n positions is equivalent to multiplying by 2n (for
 * example, 23 << 3 is equal to 184, which is equivalent to 184 = 23 * 23).
 * 2. The number of positions to shift is automatically reduced to modulo 32; that
 * is, 23 << 35 is equivalent to 23 << (35 % 32), which is equivalent to 23 << 3.
 */
class SignLeftShift{
    public static void main(String[] args) {
        System.out.println("   "+ Integer.toBinaryString(23));
        System.out.println(Integer.toBinaryString(23 << 3));
    }
}


public class BitShiftOperator {
    public static void main(String[] args) {
        System.out.println("Shifing is a common operation when working on bits. Here, we have Signed Lef Shif\n" +
                "[<<], Signed Right Shif [>>], and Unsigned Right Shif [>>>]. Shifing works for byte\n" +
                "(8-bit), short (16-bit), int (32-bit), long (64-bit), and char (16-bit); bit shif operators\n" +
                "don't throw exceptions.");

        int a = 10, b = 12;
        a = a ^ b ^ (b = a); // XOR[^]
        a = (a * b) / (b = a);
        System.out.println(a + " " + b);

    }
}


/**
 * Tips and tricks:
 * • If we XOR[^] a number with itself for an even number of times, then the result is 0
 *   (x ^ x = 0; x ^ x ^ x^ x = (x ^ x) ^ (x ^ x) = 0 ^ 0 = 0).
 *
 * • If we XOR[^] a number with itself for an odd number of times, then the result is that number
 *   (x ^ x ^ x = (x ^ (x ^ x)) = (x ^ 0) = x; x ^ x ^ x ^ x ^ x = (x ^ (x ^ x) ^ (x ^ x)) = (x ^ 0 ^ 0) = x)
 *
 * • We can compute the value of the expression p % q with p > 0, q > 0, where q is
 * a power of 2; that is, p & (q - 1). A simple application where you can see this is ComputeModuloDivision.
 *
 * • For a given positive integer p, we say that it is odd if ((p & 1) != 0) and
 * even if ((p & 1) == 0). A simple application where you can see this is OddEven.
 *
 * • For two given numbers p and q, we can say that p is equal to q if ((p ^ q) == 0).
 * A simple application where you can see this is CheckEquality.
 *
 * • For two given integers p and q, we can swap them via p = p ^ q ^ (q = p).
 * A simple application where you can see this is SwapTwoIntegers.
 */
