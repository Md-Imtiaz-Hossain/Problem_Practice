package books.O1_head_first_java_3rd_edition.chapter_03;

public class DogOfArray {

    String name;
    public static void main(String[] args) {

        DogOfArray d1 = new DogOfArray();
        d1.bark();
        d1.name="Bart";


        DogOfArray[] dogs = new DogOfArray[3];
        dogs[0] = new DogOfArray();
        dogs[1] = new DogOfArray();
        dogs[2] = d1;

        dogs[0].name = "Tommy";
        dogs[1].name = "Tiger";

        System.out.println(dogs[1].name);

        int x = 0;
        while (x < dogs.length){
            dogs[x].bark();
            x++;
        }
    }

    public void bark(){
        System.out.println(name + " Says ruff ! ");
    }

    public void eat(){

    }
    public void chaseCat(){

    }

}

