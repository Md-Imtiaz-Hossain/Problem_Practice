package books.O1_head_first_java_3rd_edition.chapter_07.O3_codecandidate;

public class Mixed2 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
        System.out.println();

        c.m1();
        c.m2();
        c.m3();
        System.out.println();

        a.m1();
        b.m2();
        c.m3();
        System.out.println();

        a2.m1();
        a2.m2();
        a2.m3();


    }
}

class A{
    int ivar = 7;

    void m1(){
        System.out.println("A's m1, ");
    }

    void m2(){
        System.out.println("A's m2, ");
    }

    void m3(){
        System.out.println("A's m3, ");
    }

}

class B extends A{
    void m1(){
        System.out.println("b's m1, ");
    }
}

class C extends B{
    void m3(){
        System.out.println("C's m3, " + (ivar + 6));
    }
}





// head first java, page - 499 / 1597