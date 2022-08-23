package interview.O1_the_complete_coding_interview_guide_in_java.section_02.chapter_6.O4_defaultstaticmethod;

public class PetrolCar implements Vehicle {

    private String name;
    private int horsePower;

    public PetrolCar(String name, int horsePower) {
        this.name = name;
        this.horsePower = horsePower;
    }       

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }        
    
    @Override
    public void speedUp() {
        System.out.println("Speed up the petrol car ...");
    }

    @Override
    public void slowDown() {
        System.out.println("Slow down the petrol car ...");
    }    
}
