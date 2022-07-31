/* 21CE041 Sneha Jadeja
Aim-The problem is to write a program that will grade multiple-choice tests. Assume there are
eight students and ten questions, and the answers are stored in a two-dimensional array. Each
row records a student’s answers to the questions, as shown in the following array.
Key to the Questions:0 1 2 3 4 5 6 7 8 9
Key D B D C C D A E A D
DYour program grades the test and displays the result. It compares each student’s answers 
with the key, counts the number of correct answers, and displays it.*/
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
