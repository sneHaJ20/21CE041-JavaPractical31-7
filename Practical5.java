package Practical1;

import java.util.Scanner;

public class Practical5 {
    static int match(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < t.length(); j++) {

                if (s.length() >= t.length()) {
                    if (i < t.length() - 1) {
                        if (str1[i] == str2[j] && str1[i + 1] == str2[j + 1]) {
                            ans++;
                        }
                    }
                } else {
                    if (j < s.length() - 1) {
                        if (str1[i] == str2[j] && str1[i + 1] == str2[j + 1]) {
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        int l = match(a, b);
        System.out.println(l);

    }
}
