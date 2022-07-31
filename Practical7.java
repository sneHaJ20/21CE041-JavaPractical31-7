//21ce041_SnehaJadeja
//Aim- Display numbers in a pyramid pattern.
/*                1
               1 2 1
             1 2 4 2 1
           1 2 4 8 4 2 1
         1 2 4 8 16 8 4 2 1
      1 2 4 8 16 32 16 8 4 2 1
    1 2 4 8 16 32 64 32 16 8 4 2 1
 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1 */
package Practical1;

public class Practical7 {
    public static void main(String[] args) {
        int num = 0;
        final String str1 = " ";
        for (int i = 0; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.printf("%4s", str1);
            }
            for (int c = 0; c <= i; c++) {
                num = (int) Math.pow(2, c);
                System.out.printf("%4d", num);
            }
            for (int c = i - 1; c >= 0; c--) {
                num = (int) Math.pow(2, c);
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
