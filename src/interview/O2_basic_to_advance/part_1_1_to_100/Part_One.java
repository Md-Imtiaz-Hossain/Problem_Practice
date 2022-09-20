package interview.O2_basic_to_advance.part_1_1_to_100;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Q29. Working with Substring
 *
 * i. All substring
 * ii. Substring with range
 * iii. Last substring check
 * iv. String Palindrome or not
 */

class O29_Substring {
    public static void main(String[] args) {
        //--------------------------------   Find all substring
        String string = "Imtiaz";
        String sub;
        for (int c = 0; c < string.length(); c++) {
            for (int i = 1; i <= string.length() - c; i++) {
                sub = string.substring(c, c + i);
                System.out.println(sub);
            }
        }
        System.out.println("\n");


        //-------------------------------   Find substring with range
        String string2 = "Khan";
        System.out.println(string2);
        System.out.println(string2.substring(1));
        System.out.println(string2.substring(2, 3));
        System.out.println("\n");

        //------------------------------    Surname check or find out which last name is Sing
        String listOfName[] = {"Praveen Kumar", "Virat Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli", "Rohit Sharma", "Sandeep Singh", "Milkha Singh"};
        String surName = "Singh";

        for (int j = 0; j < listOfName.length; j++) {
            String subStr = listOfName[j].substring(listOfName[j].length() - surName.length());
            if (subStr.equals(surName)) {
                System.out.println(listOfName[j]);
            }
        }
        System.out.println("\n");


        // -------------------------------   String Palindrome or not
        String originalString = "madam";
        String reverseString = "";

        for (int i = originalString.length()-1 ; i >= 0 ; i--){
            reverseString = reverseString + originalString.charAt(i);
        }
        if (originalString.equals(reverseString)){
            System.out.println("palindrome");
        }else
            System.out.println("Not palindrome");


    }
}

/**
 * Q27. Armstrong or Not
 * An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
 * It is also known as pluperfect, or Plus Perfect, or Narcissistic number. It is an EIS sequence A005188. Let’s understand it through an example.
 * Armstrong Number Example
 * 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153 (Armstrong Number)
 * 125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 * <p>
 * 125:
 * 1st Iteration: reminder = 5, sum = 125, number = 12
 * 1st Iteration: reminder = 2, sum = 125+8=133, number = 1
 * 1st Iteration: reminder = 1, sum = 133+1=134, number = 0 ; while function not execute
 */
class O27 {
    public static void main(String args[]) {
        int number = 153;
        int temp = number;
        int sum = 0;

        // function to calculate the sum of individual digits
        while (number > 0) {
            int reminder = number % 10;
            sum = (sum) + (reminder * reminder * reminder);
            number = number / 10;
        }

        // condition to check whether the value of P equals to user input or not.
        if (temp == sum) {
            System.out.println("Yes. It is Armstrong Number.");
        } else {
            System.out.println(
                    "No. It is not an Armstrong Number");
        }
    }
}

/**
 * Q26. Prime or not
 * A prime number is a number that is divisible by only two numbers: 1 and itself.
 * So, if any number is divisible by any other number, it is not a prime number.
 */
class O26 {
    public static void main(String[] args) {

        int num = 10;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}

/**
 * Q25. Multiplication table
 */
class O25 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + c + " = " + i * c);
        }
        System.out.println();
    }
}

/**
 * Q 24. Enhanced for loop
 * <p>
 * Normal Loop // Enhanced for loop
 * present from JDK1 // present from JDK5
 * we can increase the counter as per our wish //  But enhanced for loop will always increase by one.
 * we can iterate on any container object // We can only iterate on which implement the iterable interface.
 * we can iterate in both decrement or increment order // But we can iterate only in increment order.
 * we can replace elements at any specific index // we don’t have access to the index, so we cannot replace elements at any specific index.
 * we can print array elements either in the original order or in reverse order //  we can print array element only in the original order, not in reverse order
 */
class O24 {
    public static void main(String[] args) {

        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int t : primes) {
            System.out.println(t);
        }
        System.out.println();

        String languages[] = {"C", "C++", "Java", "Python", "Ruby"};
        for (String sample : languages) {
            System.out.println(sample);
        }

    }
}

/**
 * Q23. Working with ASCII Table
 */
class O23 {
    public static void main(String[] args) {
        char character;

        // print a to z
        for (character = 'a'; character <= 'z'; character++) {
            System.out.print(character + " ");
        }
        System.out.println();

        // print a's decimal value to z's decimal value
        for (character = 'a'; character <= 'z'; character++) {
            int i = character;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (character = 'A'; character <= 'Z'; character++) {
            System.out.print(character + " ");
        }
        System.out.println();

        for (character = 'A'; character <= 'Z'; character++) {
            int i = character;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 0; i <= 127; i++) {
            char c = (char) i;
            System.out.println(i + " --> " + c);
        }
    }
}


/**
 * Q21 22: Break and continue statement
 * <p>
 * The break statement is used to terminate the loop immediately. Break keyword is used to indicate break statements in java programming.
 * The continue statement is used to skip the current iteration of the loop. Continue keyword is used to indicate continue statement in java programming.
 * <p>
 * Output:
 * 0 1 2 3 4
 * 0 1 2 3 4 6 7 8 9
 */
class O21_O22 {
    public static void main(String[] args) {
        // Break
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}


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
        int sum = 0;
        while (number != 0) {
            int reminder = number % 10;
            sum = sum * 10 + reminder;
            number = number / 10;
        }
        System.out.println(sum);

        // Using recursion
        reverse(145);
        System.out.println(reverseNumber);
    }

    static int reverseNumber = 0; // stores reversed number

    static void reverse(int n) {
        if (n <= 0)
            return;
        int reminder = n % 10;
        reverseNumber = (reverseNumber * 10) + reminder;
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

