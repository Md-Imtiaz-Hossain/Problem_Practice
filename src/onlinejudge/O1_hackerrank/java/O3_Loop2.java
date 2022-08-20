package onlinejudge.O1_hackerrank.java;

import java.util.Scanner;

public class O3_Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(a+b+n);
        }
        in.close();
    }
}


// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true