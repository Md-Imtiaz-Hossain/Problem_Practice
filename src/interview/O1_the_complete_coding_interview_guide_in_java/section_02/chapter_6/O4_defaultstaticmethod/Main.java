package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O4_defaultstaticmethod;

public class Main {

    public static void main(String[] args) {

        Vehicle.description();

        PetrolCar pc = new PetrolCar("Audi", 150);
        System.out.println("Petrol car consume: "
                + String.format("%.1f", pc.computeConsumption(250, 50, pc.getHorsePower()))
                + " l/100km");

        ElectricCar ec = new ElectricCar("Audi", 150);
        System.out.println("Electric car consume: "
                + String.format("%.1f", ec.computeConsumption(250, 50, ec.getHorsePower()))
                + " kW/h");
    }
}



// Book: The Complete Coding Interview Guide in Java, Page: 111 (136 / 788)

/**
 * Until Java 8, we could not have a non-abstract method in a Java interface. All methods
 * from an interface were implicitly public and abstract. However, starting with Java 8, we
 * have new types of methods that can be added to an interface. In practical terms, starting
 * with Java 8, we can add methods that have implementations directly in interfaces. This
 * can be done by using the default and static keywords. Te default keyword was
 * introduced in Java 8 for including in interfaces the methods known as default, defender,
 * or extension methods. Their main goal is to allow us to evolve the existing interfaces
 * while ensuring backward compatibility. JDK itself uses default methods to evolve Java
 * by adding new features without breaking the existing code. On the other hand, static
 * methods in interfaces are quite similar to the default methods, the only diﬀerence being that
 * we cannot override static methods in the classes that implement these interfaces. Since
 * static methods are not bound to an object, they can be called by using the interface
 * name preceded by a dot and the method name. Moreover, static methods can be called
 * within other default and static methods.
 */

