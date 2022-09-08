package interview.O2_basic_to_advance.part_1_1_to_100;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Q20. Print reverse number
 * <p>
 * Iteration:
 * 1. reminder = 5(145%10), result = 5(0*10+5), number = 14(145/10)
 * 2. reminder = 4(14%10), result = 54(5*10+4), number = 1(14/10)
 * 3. reminder = 1(1%10), result = 541(54*10+1), number = .1(1/10)
 */
class O20 {
    public static void main(String[] args) {
        int number = 145;
        int result = 0;
        while (number != 0) {
            int reminder = number % 10;
            result = result * 10 + reminder;
            number = number / 10;
        }
        System.out.println(result);

        // Using recursion
        reverse(145);
        System.out.println(reverseNumber);
    }

    static int reverseNumber = 0; // stores reversed number
    static void reverse(int n) {
        if (n <= 0)
            return;
        int rem = n % 10;
        reverseNumber = (reverseNumber * 10) + rem;
        reverse(n / 10);
    }


}

/**
 * Q19. Example of while and do while loop
 * <p>
 * While loop: when condition is fulfill then print out the result
 * Do while: Though condition in not fulfill loop run one time.
 */
class O19 {
    public static void main(String[] args) {

        // While loop
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            System.out.println("Input an integer :  ");
        }
        System.out.println("Out of loop");

        // Do while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i >= 10);


    }
}

class O18 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= rows - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}


class O17 {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        IntStream.range(0, row)
//                .forEach((i) -> IntStream.rangeClosed(0,row).forEach(j-> System.out.print(" * ")));
//        System.out.println();

    }
}

/**
 * Q16. Simple Loop using normal for loop and functional programming
 */
class O16 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        IntStream.rangeClosed(0, 10)
                .forEach((i) -> System.out.print(i + " "));

        System.out.println();
        IntStream.range(0, 10)
                .forEach((i) -> System.out.print(i + " "));
    }
}

/**
 * We can compare String in Java on the basis of content and reference.
 * <p>
 * 1)  equals() Method:
 * The String class equals() method compares the original content of the string. It compares values of string for equality.
 * <p>
 * 2)  compareTo() method::
 * The String class compareTo() method compares values lexicographically and returns an integer value that describes if
 * first string is less than,equal to or greater than second string. Suppose s1 and s2 are two String objects. If:
 * s1 == s2 : The method returns 0.
 * s1 > s2 : The method returns a positive value.
 * s1 < s2 : The method returns a negative value.
 * <p>
 * 2)  == operator:
 * The == operator compares references not values.
 * <p>
 * String interning: Basically doing String.intern() on a series of strings will ensure that all strings having same contents share same memory.
 * So if you have list of names where 'john' appears 1000 times, by interning you ensure only one 'john' is actually allocated memory.
 */
class O15 {
    public static void main(String[] args) {

        String first = "Imtiaz";
        String second = "Md Imtiaz Hossain";
        String third = "ImtiaZ";
        String fourth = new String("Imtiaz");
        String five = first;
        String six = new String("Imtiaz");
        String seven = "Imtiaz";


        // 1) By Using equals() Method --> value
        System.out.println(first.equals(third));
        System.out.println(first.equalsIgnoreCase(third));
        System.out.println();

        // 2) By Using compareTo() method --> value
        if (first.compareTo(second) > 0) {
            System.out.println("First string comes first");
        } else if (first.compareTo(second) < 0) {
            System.out.println("Second String comes first");
        } else {
            System.out.println("Strings are equal");
        }
        System.out.println();

        // 2) By Using == operator --> references
        System.out.println(first == five);
        System.out.println(six == fourth);
        System.out.println(first == seven);
        // why it returns true --> https://stackoverflow.com/questions/10578984/what-is-java-string-interning
        // https://en.wikipedia.org/wiki/String_interning#:~:text=In%20computer%20science%2C%20string%20interning,string%20is%20created%20or%20interned.
    }
}

/**
 * Q14. Factorial
 */
class O14 {
    public static void main(String[] args) {
        int number = 5;
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            if (number == 0) {
                System.out.println("Number is - " + number);
            } else {
                sum = sum * i;
            }
        }
        System.out.println(sum);
    }
}

/**
 * Odd and Even Number
 */
class O13 {
    public static void main(String[] args) {
        int number = 20;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

/**
 * Nested If else
 */
class O11_O12 {
    public static void main(String[] args) {
        int passMark = 40, marksObtained;
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter obtain Mark: ");
        marksObtained = sc.nextInt();

        if (marksObtained >= passMark) {
            if (marksObtained > 90)
                grade = 'A';
            else if (marksObtained > 75)
                grade = 'B';
            else if (marksObtained > 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("You passed the exam and your grade is " + grade);
        } else {
            System.out.println("Fail");
        }
    }
}

/**
 * Q10. If Else
 */
class O10 {
    public static void main(String[] args) {
        boolean learning = true;
        if (learning) {
            System.out.println("Java programmer");
        } else {
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

