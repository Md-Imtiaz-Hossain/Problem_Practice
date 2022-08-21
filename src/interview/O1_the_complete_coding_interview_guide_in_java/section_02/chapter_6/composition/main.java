package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.composition;

public class main {
    public static void main(String[] args) {

        Car car = new Car("Imtiaz's Car");
        System.out.println(car.getName() +  " and Its Horsepower: " + car.getHorsepower() + ", car type: " + car.getEngine().getType());

    }
}

// Book: The Complete Coding Interview Guide in Java, Page:  83 (108 / 788)
