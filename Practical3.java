/* 21ce041_SnehaJadeja
Aim- Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, 
so 17 % 10 is 7.lastDigit(7, 17) → truelastDigit(6, 17) → falselastDigit(3, 113) → true*/
package Practical1;

import java.util.Scanner;

public class Practical3 {
    static boolean convert(int s, int h) {
        int e, f;
        e = s % 10;
        f = h % 10;
        if (e == f)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        boolean c = convert(a, b);
        System.out.print(c);

    }
}
