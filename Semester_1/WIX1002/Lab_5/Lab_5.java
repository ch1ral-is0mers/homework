//WIX1002
//Lab 5
//Tang Jizhi
//25007562

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Q1
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        int highest = 0;
        int lowest = 100;
        int total = 0;

        System.out.println("Student scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = random.nextInt(101);
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            total += scores[i];
        }

        double average = (double) total / n;
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f%n", average);

        //Q2
        int[] numbers = new int[10];
        int count = 0;

        while (count < numbers.length) {
            int value = random.nextInt(21);
            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (numbers[i] == value) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                numbers[count] = value;
                count++;
            }
        }

        System.out.println("10 non-duplicate random integers:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        //Q3
        System.out.print("Enter number of employees: ");
        int employeeCount = sc.nextInt();
        int[][] workHours = new int[employeeCount][7];

        for (int i = 0; i < employeeCount; i++) {
            int employeeTotal = 0;
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < 7; j++) {
                workHours[i][j] = random.nextInt(8) + 1;
                employeeTotal += workHours[i][j];
                System.out.print(workHours[i][j] + " ");
            }
            System.out.println("Total hours: " + employeeTotal);
        }

        //Q4
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        int[][] rotated = new int[3][3];

        System.out.println("3 by 3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                rotated[j][2 - i] = matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

        //Q5
        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(101);
        }

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int value : randomNumbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        Arrays.sort(randomNumbers);
        for (int i = 0; i < randomNumbers.length / 2; i++) {
            int temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[randomNumbers.length - 1 - i];
            randomNumbers[randomNumbers.length - 1 - i] = temp;
        }

        System.out.println("Array in descending order");
        for (int value : randomNumbers) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();

        int linearLoops = 0;
        int linearIndex = -1;
        for (int i = 0; i < randomNumbers.length; i++) {
            linearLoops++;
            if (randomNumbers[i] == target) {
                linearIndex = i;
                break;
            }
        }

        if (linearIndex >= 0) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Linear Search - " + linearLoops + " loop(s)");

        int binaryLoops = 0;
        int binaryIndex = -1;
        int low = 0;
        int high = randomNumbers.length - 1;

        while (low <= high) {
            binaryLoops++;
            int mid = (low + high) / 2;

            if (randomNumbers[mid] == target) {
                binaryIndex = mid;
                break;
            } else if (randomNumbers[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (binaryIndex >= 0) {
            System.out.println(target + " found");
        } else {
            System.out.println(target + " not found");
        }
        System.out.println("Binary Search - " + binaryLoops + " loop(s)");

        //Q6
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = sc.nextInt();
        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            pascal[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        System.out.println("The Pascal Triangle with " + rows + " row(s)");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
