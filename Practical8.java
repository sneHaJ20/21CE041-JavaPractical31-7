package Practical1;

public class Practical8 {
    public static void main(String[] args) {
        String[] AnsKey = { "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };
        String[][] Student = { { "A", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "D", "B", "A", "B", "C", "A", "E", "E", "A", "D" },
                { "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
                { "C", "B", "A", "E", "D", "C", "E", "E", "A", "D" },
                { "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "E", "C", "C", "D", "E", "E", "A", "D" },
                { "B", "B", "A", "C", "C", "D", "E", "E", "A", "D" },
                { "E", "B", "E", "C", "C", "D", "E", "E", "A", "D" } };
        int count = 0;
        int ans = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                if (AnsKey[i] == Student[j][i]) {
                    count++;
                }
            }

            System.out.print("Student" + ans + ":");
            ans = ans + 1;
            System.out.println(count);
            count = 0;
        }

    }
}
