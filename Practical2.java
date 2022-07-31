// 21CE041_SnehaJadeja
//Aim-  Given a string, return a string made of the first 2 chars (if present), 
//however include first  char  only  if  it  is  'o' and  include  the  second  only  if  it
//is  'z', so  "ozymandias" yields "oz",startOz("ozymandias") → "oz"startOz("bzoo") → "z"startOz("oxx") → "o"
package Practical1;

import java.util.Scanner;

public class Practical2 {
    static String convert(String s) {
        char[] str1 = s.toCharArray();
        char[] str2 = new char[2];
        int i = 0;
        if (str1[0] == 'o') {
            str2[i] = str1[0];
            i++;
        }
        if (str1[1] == 'z') {
            str2[i] = str1[1];
        }

        String str = String.valueOf(str2);
        return str;
    }

    public static void main(String[] args) {

        String h;
        Scanner sc = new Scanner(System.in);
        h = sc.next();

        System.out.print(convert(h));

    }
}
