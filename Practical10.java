/* 21ce041 Sneha Jadeja
Aim- Implement Caesar Cipher.*/
package Practical1;

import java.util.Scanner;

public class Practical10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int length = str1.length();

        char[] sh = str1.toCharArray();

        System.out.print("Enter number to be shifted");
        int pos = sc.nextInt();
        for (int i = 0; i < length; i++) {

            sh[i] = (char) (sh[i] + (pos));

        }
        System.out.println("The cipher code after shifting the desired positions is");
        for (int i = 0; i < length; i++) {

            System.out.print(sh[i]);
        }

    }

}
