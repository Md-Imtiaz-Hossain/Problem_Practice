package interview.O2_basic_to_advance.part_1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Q10. If Else
 */
class O10 {
    public static void main(String[] args) {
        boolean learning = true;
        if (learning) {
            System.out.println("Java programmer");
        }
        else {
            System.out.println("What are you doing here?");
        }
    }
}

/**
 * Q9. Find the largest number from array.
 */
class O9 {
    public static void main(String[] args) {
        int[] a = {5, 8, 11, 1, 55};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

/**
 * Q8. How to add two number Program in java.
 */
class O8 {
    public static void main(String[] args) {
        int a = 5, b = 8;
        System.out.println(a + b);
    }
}

/**
 * Q7. How to swap 2 no not using 3rd variable Program in java
 */
class O7 {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println(a + " " + b);
        a = (a * b) / (b = a);
        System.out.println(a + " " + b);
    }
}

/**
 * Q6. How to swap 2 no using 3rd variable Program in java
 */
class O6 {
    public static void main(String[] args) {
        int a = 5, b = 6, temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}


/**
 * Q5: Temperature converter
 * <p>
 * Note:
 * <p>
 * Celsius to Kelvin: K = C + 273.15
 * Kelvin to Celsius: C = K - 273.15
 * Fahrenheit to Celsius: C = (F-32) (5/9)
 * Celsius to Fahrenheit: F = C(9/5) + 32
 * Fahrenheit to Kelvin: K = (F-32) (5/9) + 273.15
 * Kelvin to Fahrenheit: F = (K-273.15) (9/5) + 32
 */
class O5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit: ");
        float temperatureInFahrenheit = input.nextInt();
        System.out.println("Celsius: " + ((temperatureInFahrenheit - 32) * 5) / 9);

        System.out.print("Enter Temperature in Celsius: ");
        float temperatureInCelsius = input.nextInt();
        System.out.println("Fahrenheit: " + ((temperatureInCelsius * (9 / 5)) + 32));
    }
}

/**
 * Q4. Take Big Number and print
 * <p>
 * Note:
 * BigInteger must support values in the range -2^Integer.MAX_VALUE (exclusive) to +2^Integer.MAX_VALUE (exclusive) and
 * may support values outside that range. The range of probable prime values is limited and
 * may be less than the full supported positive range of BigInteger. The range must be at least 1 to 2^500000000.
 */
class O4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bigNumber = input.nextLine();
        BigInteger bigInteger = new BigInteger(bigNumber);
        System.out.println("BigInteger Range: " + Math.pow(2.0, 500000000.0));
        System.out.println("BigInteger Multiplication: " + bigInteger.multiply(bigInteger));
        System.out.println("BigInteger Divide: " + bigInteger.divide(bigInteger));
        System.out.println("BigInteger DivideAndRemainder: " + Arrays.toString(bigInteger.divideAndRemainder(bigInteger)));
    }
}

/**
 * Q3. Command Line Argument
 * <p>
 * Note:
 * 1. Public
 * It is an Access modifier, which specifies from where and who can access the method.
 * Making the main() method public makes it globally available. It is made public
 * so that JVM can invoke it from outside the class as it is not present in the current class.
 * <p>
 * 2. Static
 * It is a keyword that is when associated with a method, making it a class-related method.
 * The main() method is static so that JVM can invoke it without instantiating the class.
 * This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
 * <p>
 * 3. Void
 * It is a keyword and is used to specify that a method doesn’t return anything. As the main() method doesn’t return anything,
 * its return type is void. As soon as the main() method terminates, the java program terminates too.
 * Hence, it doesn’t make any sense to return from the main() method as JVM can’t do anything with the return value of it.
 * <p>
 * 4. main
 * It is the name of the Java main method. It is the identifier that the JVM looks for as the starting point of the java program. It’s not a keyword.
 * <p>
 * 5. String[] args
 * It stores Java command-line arguments and is an array of type java.lang.String class.
 * Here, the name of the String array is args, but it is not fixed and the user can use any name in place of it.
 */
class O3 {
    public static void main(String[] f) {
        System.out.println(f);
        for (String elem : f)
            System.out.println(elem);
    }
}

/**
 * =======================================================================
 * Q2. Take value from user and print
 * <p>
 * Note:
 * After taking int value terminal didn't take next line value,
 * because when we enter a number then press Enter, input.nextInt() consumes only the number, not the "end of line".
 * When input.nextLine() executes, it consumes the "end of line" still in the buffer from the first input.
 */
class O2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // This line you have to add (It consumes the \n character)
        System.out.print("Enter Your School: ");
        String school = input.nextLine();
        System.out.println("Name: " + name + ", Age: " + age + ", School: " + school);
    }
}

/**
 * =======================================================================
 * Q1. Simple Java Program
 */
class O1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

public class Part_One {
    public static void main(String[] args) {
        System.out.println("Welcome to this 100 programme solution Repo");
    }
}

