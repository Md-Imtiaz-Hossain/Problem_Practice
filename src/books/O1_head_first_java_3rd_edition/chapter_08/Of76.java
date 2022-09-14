package books.O1_head_first_java_3rd_edition.chapter_08;

public class Of76 extends Clown {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clown();
        i[2] = new Of76();

        for (int s = 0 ; s < 3 ; s++){
            System.out.println(i[s].iMethod() + " " + i[s].getClass());
        }
    }
}

interface Nose{
    public int iMethod();
}

abstract class Picasso implements Nose{
    public int iMethod(){
        return 7;
    }
}


class Clown extends Picasso{
    static class Acts extends Picasso{
        public int iMethod(){
            return 5;
        }
    }
}

/**
 * A class that’s not abstract is called a concrete class. In the Animal
 * inheritance tree, if we make Animal, Canine, and Feline abstract, that leaves
 * Hippo, Wolf, Dog, Tiger, Lion, and Cat as the concrete subclasses.
 */