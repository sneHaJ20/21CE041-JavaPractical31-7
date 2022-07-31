package Practical1;

import java.util.Scanner;

public class Practical9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] suduko = new int[9][9];
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                suduko[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                count = count ^ suduko[i][j];
            }
        }
        if (count == 1)
            System.out.println("Yes it is possible");
        else
            System.out.println("No it is not possible");

    }
}
