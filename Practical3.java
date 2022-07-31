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
