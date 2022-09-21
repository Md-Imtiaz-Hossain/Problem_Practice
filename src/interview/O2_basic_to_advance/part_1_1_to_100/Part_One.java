package interview.O2_basic_to_advance.part_1_1_to_100;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Q99. Factorial Using recursion
 */
class O99_Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int i) {
        if (i == 1) return 1;
        else return (i * factorial(i - 1));
    }
}

/**
 * Q98. 2D Array
 */
class O98_TwoDArray {
    public static void main(String[] args) {
        int[][] intArray = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Initialized Two dimensional array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/**
 * Q97. One D Array
 */
class O97_OneDArray {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " " + arr[i]);
        }
    }
}

/**
 * Q62. Bubble sort
 */
class O62_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}

/**
 * Q61. Binary Search
 * <p>
 * Array must be sorted
 */
class O61_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {500, 10, 20, 30, 40, 50};
        Arrays.sort(arr);
        for (int s : arr) {
            System.out.print(s + " ");
        }
        int key = 30;
        int last = arr.length - 1;
        System.out.println();
        binarySearch(arr, 0, last, key);
    }

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}

/**
 * Q60
 */
class O60_LinearSearch {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 50, 70, 90};
        int key = 50;
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

/**
 * Q59. How to open notepad
 */
class O59_Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

/**
 * Q57. Garbage collection
 * Q58. Ip address
 * <p>
 * Java garbage collection is the process by which Java programs perform automatic memory management.
 * Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short.
 * When Java programs run on the JVM, objects are created on the heap, which is a portion of memory
 * dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector
 * finds these unused objects and deletes them to free up memory.
 */
class O57_GarbageCollection_IPAddress {
    public static void main(String[] args) throws UnknownHostException {

        Runtime rs = Runtime.getRuntime();
        System.out.println("Free memory in JVM before Garbage Collection = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection =  " + rs.freeMemory());
        System.out.println();

        // Get IP address
        System.out.println(InetAddress.getLocalHost());
        System.out.println(Inet4Address.getLocalHost());
        System.out.println(Inet6Address.getLocalHost());
    }
}

/**
 * Q56. Random number
 * <p>
 * Random number default value is (0.0 to 1.0)
 */
class O56_RandomNumber {
    public static void main(String[] args) {


        // Default random and multiply with 5, and cast into int
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random() * 5));
        }
        System.out.println();


        DecimalFormat df = new DecimalFormat("##.##");
        Random random = new Random();
        // Random number generate with 1 to 50
        for (int i = 0; i < 10; i++) {
            System.out.println(df.format(random.nextInt(50)));
        }


        // Infinite time generate random number
//        random.ints(0, 49)
//                .forEach((i) -> {
//                    System.out.println(i + 1);
//                });
    }
}

/**
 * Q53 54 55. Working with date time
 */
class O53_54_55_DateTime {
    public static void main(String[] args) {

        // import java.time.LocalDateTime;
        //import java.time.format.DateTimeFormatter;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(dtf.format(now));

        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
        System.out.println();


        // import java.util.Date;
        //import java.text.SimpleDateFormat;
        Date date = new Date();
        System.out.println("Date formate chnage by Technolamror ");

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy : " + strDate);

        formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
        strDate = formatter.format(date);
        System.out.println("Date Format with dd MMMM yyyy zzzz : " + strDate);

        formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        strDate = formatter.format(date);
        System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : " + strDate);
    }
}

/**
 * Q52. Interface (100% abstraction)
 */
class O52_Interface implements shape {
    public static void main(String[] args) {
        O52_Interface i = new O52_Interface();
        i.draw();
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

interface shape {
    void draw();
}

/**
 * Q49. Exception handling
 * Q50. Throw exception
 * Q51. finally block
 * <p>
 * Final VS Finally VS Finalize:
 * final is the keyword and access modifier which is used to apply restrictions on a class, method or variable.
 * Once declared, final variable becomes constant and cannot be modified. final method cannot be overridden by subclass. final class cannot be inherited.
 * <p>
 * finally is the block in Java Exception Handling to execute the important code whether the exception occurs or not.
 * Finally, block is always related to the try and catch block in exception handling. finally block cleans up all the resources used in try block
 * <p>
 * finalize method performs the cleaning activities with respect to the object before its destruction.
 * Finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
 * finalize method is executed just before the object is destroyed.
 */
class O49_50_51_Exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // Exception handling
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Division by zero");
        } finally {
            System.out.println("Finally Block always execute."); // Finally block
        }

        // Throw exception
        validate(3);
        validate(-3);

    }

    static void validate(int age) {
        if (age < 0)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote on Dynamic solution");
    }
}


/**
 * Q47 48. constructor and overloading
 */
class O47_48_Constructor_Overloading {

    private String name;

    void O45_Static_Instance_Method() {
        System.out.println("Constructor method called");
    }

    public O47_48_Constructor_Overloading(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        O47_48_Constructor_Overloading s = new O47_48_Constructor_Overloading("Imtiaz");
        System.out.println(s.getName());
        s.O45_Static_Instance_Method();

    }


}

/**
 * Q45. Static and instance method
 * Q46. Create multiple class
 */

class O45_Static_Instance_Method {
    public static void main(String[] args) {
        // No need to create object
        m1();

        // Need to create object
        O45_Static_Instance_Method s = new O45_Static_Instance_Method();
        s.m2();

        test t = new test();
    }

    static void m1() {
        System.out.println("Called from m1 static method");
    }

    void m2() {
        System.out.println("Called from m2 instance method");
    }
}

class test {
    test() {
        System.out.println("Called from new test class");
    }
}


/**
 * Q44. Static Block
 * The static keyword is a non-access modifier used for methods and attributes.
 * Static methods/attributes can be accessed without creating an object of a class.
 * <p>
 * When a member is declared static, it can be accessed before any objects of its class are created,
 * and without reference to any object. For example, in the below java program,
 * we are accessing static method m1() without creating any object of the Test class.
 * <p>
 * Static variables are created when the program starts and destroyed when the program stops.
 * Static variables can be accessed by calling with the class name ClassName.VariableName.
 * <p>
 * In Java, a static variable is a class variable (for whole class). So if we have static local variable (a variable with scope limited to function),
 * it violates the purpose of static. Hence, compiler does not allow static local variable.
 */
class O44_Static_Block {
    public static void main(String[] args) {
        m1();
    }

    // static method
    static void m1() {
        // static final int a = 10; // Not allow
        System.out.println("Called from m1 static method");
    }
}

/**
 * Q43. Length, Length(), concat
 * <p>
 * array.length: length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
 * <p>
 * string.length() : length() method is a final variable which is applicable for string objects.
 * The length() method returns the number of characters present in the string.
 */
class O43_StringLength {
    public static void main(String[] args) {

        // Here array is the array name of int type
        int[] array = new int[4];
        System.out.println("The size of the array is " + array.length);

        // Here str is a string object
        String str = "Geeks for Geeks";
        System.out.println("The size of the String is " + str.length());

        // String with concat
        System.out.println(str.concat(", Is for Fun"));
    }
}

/**
 * Q41. String Lowercase
 * Q42. Creating method
 */
class O41_42_String_Lowercase_Uppercase_WithMethod {
    public static void main(String[] args) {
        String s1 = "My name is Sajon. My name is Imtiaz. My name is Akash.";
        lowerCase(s1);
        upperCase(s1);

    }

    static void lowerCase(String s) {
        System.out.println(s.toLowerCase());
    }

    static void upperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}

/**
 * Q38 . String replace occurrence word and
 * Q39. split string
 * Q40. Remove space from string
 */
class O38_39_40_Replace_Split_Trim_String {
    public static void main(String[] args) {

        String s1 = "My name is Sajon. My name is Imtiaz. My name is Akash.";

        //replaces all occurrences of "is" to "was"
        String replaceString = s1.replaceAll("is", "was");
        System.out.println(replaceString);
        System.out.println();

        // String split and store into array
        String[] sArray = s1.split(" ");
        for (String s : sArray) {
            System.out.println(s);
        }
        System.out.println();

        // Remove space both end and start
        String stringSpace = " hello string ";
        System.out.println("-->" + stringSpace + "Technolamror");//without trim()
        System.out.println("-->" + stringSpace.trim() + "Technolamror");//with trim()

    }
}

/**
 * Q35 36 37. string compare, boolean value, indexing
 * More on Q15
 * Alphabetically comes first = +
 * Alphabetically comes second = -
 * Both are equal = 0
 * <p>
 * I = 73, i = 105, 73-105=-32, H = 72, I = 73, Hossain(72) - Imtiaz(73) = -1
 */
class O35_36_37_StringCompare_Index_Boolean {
    public static void main(String[] args) {
        String one = "Imtiaz", two = "imtiaz", three = "Hossain", four = "Imtiaz";
        System.out.println(one.compareTo(two)); // == -32
        System.out.println(one.compareTo(three)); // == 1
        System.out.println(one.compareTo(four)); // == 0
        System.out.println(two.compareTo(three)); // == 33
        System.out.println(three.compareTo(four)); // == -1
        System.out.println();

        // Boolean value of occurance
        System.out.println(one.endsWith("z")); // t
        System.out.println(one.endsWith("Z")); // f
        System.out.println();

        // Find Index
        System.out.println(one.indexOf("t")); // 2
        System.out.println(one.indexOf("T")); // -1 because it is not present in the string
    }
}

/**
 * Q32. Matrix Sum and Sub
 */
class O32_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2, col = 2;

        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];

        int[][] sumOfMatrix = new int[row][col];
        int[][] subOfMatrix = new int[row][col];

        System.out.println("Enter first matrix element: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter second matrix element: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                secondMatrix[i][j] = input.nextInt();
            }
        }

        // Sum of 2 matrix and store it
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumOfMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j]; // Just change here
            }
        }

        System.out.println("Summation: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sumOfMatrix[i][j] + "\t");
            }
            System.out.println();
        }


        // Sub of 2 matrix and store it
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                subOfMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j]; // Just change here
            }
        }

        System.out.println("Subtraction: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(subOfMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

/**
 * Q31. Number palindrome or not and number reverse.
 */
class O31_NumberPalindrome_NumberReverse {
    public static void main(String[] args) {
        int i = 4546;
        String originalString = String.valueOf(i), reverseString = "";
        StringBuffer stringBuffer = new StringBuffer(originalString);
        reverseString = String.valueOf(stringBuffer.reverse());

        if (originalString.equals(reverseString)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        StringBuffer sb = new StringBuffer(String.valueOf(i));
        System.out.println(sb.reverse());

    }
}

/**
 * Q29_30. Working with Substring
 * <p>
 * i. All substring
 * ii. Substring with range
 * iii. Last substring check
 * iv. String Palindrome or not (Original String == Reverse String)
 * v. Integer Reverse
 * vi. Reverse String With StringBuffer
 */

class O29_O30_Substring_ReverseString {
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
        String listOfName[] = {"Virat Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli", "Rohit Sharma", "Sandeep Singh", "Milkha Singh"};
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

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + originalString.charAt(i);
        }
        if (originalString.equals(reverseString)) {
            System.out.println("palindrome");
        } else
            System.out.println("Not palindrome");
        System.out.println("\n");


        // --------------------------------  Integer Palindrome Or not
        int j = 548;
        String r = "", s = String.valueOf(j);
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        System.out.println(r);
        if (s.equals(r)) {
            System.out.println("P");
        } else {
            System.out.println("Not P");
        }
        System.out.println("\n");


        // ----------------------------------   StringBuffer is a class that we can easily reverse a string
        String sb = "StringBuffer";
        StringBuffer stringBuffer = new StringBuffer(sb);
        System.out.println(stringBuffer.reverse());
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
 * Q15. String compare with different way
 * <p>
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
class O15_StringCompare {
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
 *
 * Note:
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
 *
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
 *
 * Note:
 * 1. Public
 * It is an Access modifier, which specifies from where and who can access the method.
 * Making the main() method public makes it globally available. It is made public
 * so that JVM can invoke it from outside the class as it is not present in the current class.
 *
 * 2. Static
 * It is a keyword that is when associated with a method, making it a class-related method.
 * The main() method is static so that JVM can invoke it without instantiating the class.
 * This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.
 *
 * 3. Void
 * It is a keyword and is used to specify that a method doesn’t return anything. As the main() method doesn’t return anything,
 * its return type is void. As soon as the main() method terminates, the java program terminates too.
 * Hence, it doesn’t make any sense to return from the main() method as JVM can’t do anything with the return value of it.
 *
 * 4. main
 * It is the name of the Java main method. It is the identifier that the JVM looks for as the starting point of the java program. It’s not a keyword.
 *
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
 * Q2. Take value from user and print
 *
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

