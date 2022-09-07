package interview.O2_basic_to_advance.part_1;

import java.util.Scanner;

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


public class Part_Two {
    public static void main(String[] args) {
        System.out.println("Welcome to part two of problem solving. ");
    }
}
