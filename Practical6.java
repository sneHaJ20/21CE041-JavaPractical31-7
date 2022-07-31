package Practical1;

import java.util.Scanner;

public class Practical6 {
    static String NewString(String s, char a) {
        char[] str1 = s.toCharArray();
        char[] str2 = new char[s.length()];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (str1[i] != a) {
                str2[ans] = str1[i];
                ans++;
            }
        }
        String str = String.valueOf(str2);
        return str;

    }

    public static void main(String[] args) {
        String s;
        char h;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        h = sc.next().charAt(0);
        System.out.println(NewString(s, h));
    }
}
