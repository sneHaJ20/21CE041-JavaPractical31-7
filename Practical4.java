//21CE041_SnehaJadeja
//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//array123([1, 1, 2, 3, 1]) → true   array123([1, 1, 2, 4, 1]) → false   array123([1, 1, 2, 1, 2, 3]) → true
package Practical1;

import java.util.Scanner;

public class Practical4 {

    static boolean convert(int[] sh, int s) {
        int ans = 0;
        for (int i = 0; i < s; i++) {
            if (sh[i] == 1 && sh[i + 1] == 2 && sh[i + 2] == 3) {
                ans = 1;
                break;
            }

        }
        if (ans == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        boolean k = convert(arr, a);
        System.out.print(k);
    }
}
