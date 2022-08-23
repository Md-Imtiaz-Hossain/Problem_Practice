public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;
        int swap = x;
        x = y;
        y = swap;
        System.out.println(x + " " + y);

        int p = 23;
        int q = 33;
        p = (p * q) / (q = p);
        System.out.println(p + " " + q);

    }
}