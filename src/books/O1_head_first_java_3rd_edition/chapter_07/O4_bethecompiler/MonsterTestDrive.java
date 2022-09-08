package books.O1_head_first_java_3rd_edition.chapter_07.O4_bethecompiler;

import java.util.Map;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();

        for (int i = 0 ; i < monsters.length ; i++){
            monsters[i].frighten(i);
        }

    }
}

class Monster{
    boolean frighten(int d){
        System.out.println("argh");
        return true;
    }
}

class Vampire extends Monster{
    boolean frighten(int d){
        System.out.println("a bite ? ");
        return false;
    }
}

class Dragon extends Monster{
    boolean frighten(int degree){
        System.out.println("breath fire");
        return true;
    }
}
