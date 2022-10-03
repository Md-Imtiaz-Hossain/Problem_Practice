package interview.O2_basic_to_advance.part_2_101_to_200;


import java.util.Arrays;

class O101_PrimeInArray{
    public static void main(String[] args) {

        int[] originalArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
                17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33,
                34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

        for (int i = 0 ; i < originalArray.length ; i++){
            System.out.println(Arrays.toString(Arrays.stream(firstNPrimes(originalArray[i])).toArray()));
        }
    }
    public static int[] firstNPrimes(int n) {
        int[] primes = new int[n];
        int ncounter = 0;
        int isPrime = 2;
        while (ncounter < n) {
            boolean prime = true;
            for (int j = 2; j < isPrime; j++) {
                if (isPrime % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[ncounter] = isPrime;
                ncounter++;
            }
            isPrime++;
        }
        return primes;
    }
}

public class All_101_to_200 {
    public static void main(String[] args) {
        System.out.println("Welcome 101 to 200 problem solution");
    }
}
