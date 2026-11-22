//WIX1002
//Tutorial 5
//Tang Jizhi
//25007562

import java.util.Random;

public class Tutorial_5 {

    public static void main(String[] args) {
        //Q1(a)
        double[] floatingNumbers = new double[12];

        //Q1(b)
        char[] grades = {'A', 'B', 'C', 'D', 'E'};

        //Q1(c)
        String[] studentNames = new String[100];

        //Q1(d)
        int[][] table = new int[6][2];

        //Q1(e)
        int[][] matrix = {
            {6, 9},
            {2, 5},
            {4, 6}
        };

        //Q1(f)
        matrix[1][1] = 4;
        matrix[2][0] = 3;
        matrix[2][1] = 7;

        //Q1(g)
        String[] contact = {"Alice", "Bob", "Charlie"};
        for (String value : contact) {
            System.out.println(value);
        }

        {
            //Q2(a)
            String[] code = {"AAA", "AAB", "AAC", "AAD"};
        }

        {
            //Q2(b)
            int[] num = new int[10];
            int sum = 0;
            for (int k = 0; k < num.length; k++) {
                sum += num[k];
            }
        }

        {
            //Q2(c)
            int[][] t = new int[3][];
            t[1] = new int[3];
            t[1][2] = 5;
        }

        {
            //Q2(d)
            int i = 4;
            int[] score = new int[5];
            score[1] = 78;
            score[i] = 100;
        }

        {
            //Q3
            int[] marks = new int[5];
            int i = 0, j = 1;
            marks[i] = 12;
            marks[j] = marks[i] + 19;
            marks[j - 1] = marks[j] * marks[j];
            marks[j * 3] = marks[i + 1];
            marks[++j] = marks[i] % 5;
            marks[2 * j] = marks[j - 1];

            System.out.print("marks:");
            for (int value : marks) {
                System.out.print(" " + value);
            }
            System.out.println();
        }

        {
            //Q4
            String[] sentence = {
                "the quick brown fox",
                "jumps over the lazy dog",
                "The end"
            };

            int count = 0;
            for (String line : sentence) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals("the")) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of \"the\": " + count);

            //Q5
            for (int i = sentence.length - 1; i >= 0; i--) {
                for (int j = sentence[i].length() - 1; j >= 0; j--) {
                    System.out.print(sentence[i].charAt(j));
                }
                System.out.println();
            }
        }

        {
            //Q6
            Random random = new Random();
            int number = random.nextInt(256);
            int[] bits = new int[8];
            int value = number;

            for (int i = bits.length - 1; i >= 0; i--) {
                bits[i] = value % 2;
                value /= 2;
            }

            System.out.print("Number: " + number + ", Binary: ");
            for (int bit : bits) {
                System.out.print(bit);
            }
            System.out.println();
        }
    }
}
