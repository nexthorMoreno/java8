package co.com.algorithms.hacker.rank.level.one;

import java.util.Scanner;

public class StdinOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        double d = scan.nextDouble();
        int i = scan.nextInt();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
