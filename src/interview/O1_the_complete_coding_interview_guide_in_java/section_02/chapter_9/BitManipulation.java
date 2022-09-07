package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_9;

/**
 * Bitwise Exclusive OR (XOR) [^]:
 * It returns 1 only if the compared bits have a different value. Otherwise, it returns 0;
 * for example, 5 = 101, 7 = 111, 5 ^ 7 = 101 | 111 = 010 = 2.
 */
class BitWiseExclusiveOr{
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(9));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(9 ^ 7));
    }
}

/**
 * Bitwise OR [|]: It acts as the logical OR (||),
 * meaning that it returns 1 if at least one of the compared bits is 1 (or both).
 * Otherwise, it returns 0; for example, 5 = 101, 7 = 111, 5 | 7 = 111 = 7.
 */
class BitWiseOr{
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(5 | 7));
    }
}

/**
 * Bitwise AND [&]: It acts as the logical AND (&&), meaning that
 * it returns 1 only if the compared bits are equal to 1;
 * for example, 5 = 101, 7 = 111, 5 & 7 = 101 = 5
 */
class BitWiseAnd{
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(7));
        System.out.println(Integer.toBinaryString(5 & 7));
    }
}

/**
 * Unary bitwise complement operator [~]: This operator takes every bit of
 * the number and flips its value, so 1 becomes 0 and vice versa;
 * for example, 5 = 101, * ~5 = 010.
 */
class UnaryBitwiseOperator{
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(51));
        System.out.println(Integer.toBinaryString(~51));
    }
}

/**
 * Program of integer to binary.
 * radix:2 means binary
 */
public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(52));
        System.out.println(Integer.toString(52,2));
    }
}

