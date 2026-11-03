//WIX1002
//Tutorial 4
//Tang Jizhi
//25007562

import java.util.Scanner;
import java.util.Random;

public class Tutorial_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Q1
        {
            //a
            int n = 1;

            while ((n + 1) * (n + 1) * (n + 1) < 2000) {
                n++;
            }

            System.out.println("Largest integer n: " + n);

            //b
            for (int i = 1; i <= 12; i++) {
                System.out.println(i * i);
            }

            //c
            int[][] matrix = new int[4][5];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    matrix[i][j] = random.nextInt(101);
                    System.out.printf("%4d", matrix[i][j]);
                }
                System.out.println();
            }

            //d
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("Sum: " + sum);

            //e
            double seriesSum = 0;

            for (int i = 1; i <= 25; i++) {
                seriesSum += (double) i / (26 - i);
            }

            System.out.printf("Series sum: %.2f%n", seriesSum);
        }

        //Q2
        {
            //a
            int sum = 0;

            for (int x = 10; x > 0; x--) {
                sum += x;
            }

            System.out.println("Sum: " + sum);

            //b
            int x = 0;
            int y = 0;

            do {
                x += 2;
                y += x;
                System.out.println(x + " and " + y);
            } while (x < 100);

            //c
            for (int i = 1, j = 20; i < j; i++, j -= 2) {
                System.out.println(i + " " + j);
            }

            //d
            int i = 1;

            while (i <= 10) {
                if (i == 10) {
                    System.out.println("Program End");
                }
                i++;
            }
        }

        //Q3
        {
            int first = 1;
            int second = 1;

            System.out.print(first + " " + second);

            for (int i = 3; i <= 10; i++) {
                int next = first + second;
                System.out.print(" " + next);

                first = second;
                second = next;
            }

            System.out.println();
        }

        //Q4
        {
            input.nextLine();

            System.out.print("Enter a string: ");
            String str = input.nextLine();

            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

            System.out.println();
        }

        input.close();
    }
}
