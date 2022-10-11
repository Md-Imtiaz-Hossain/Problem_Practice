package books.O1_head_first_java_3rd_edition.chapter_12.O2_functionalinterrface;


@FunctionalInterface
interface Square {
    int calculate(int x);
}

class O1_Intro {
    public static void main(String args[]) {
        int a = 5;
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}


/**
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit. From Java 8 onwards,
 * lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default methods. Runnable, ActionListener,
 * Comparable are some examples of functional interfaces.
 * Functional Interface is additionally recognized as Single Abstract Method Interfaces.
 * In short, they are also known as SAM interfaces.
 * Functional interfaces in Java are the new feature that provides users with the approach of fundamental programming.
 *
 * @FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method.
 * In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message.
 * However, it is not mandatory to use this annotation.
 */