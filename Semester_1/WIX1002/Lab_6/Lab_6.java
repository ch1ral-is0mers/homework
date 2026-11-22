//WIX1002
//Lab 6
//Tang Jizhi
//25007562

import java.util.Scanner;
import java.util.Random;

public class Tutorial_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Q1
        System.out.println("The first 20 triangular numbers:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(triangularNumber(i) + " ");
        }
        System.out.println();

        //Q2
        System.out.println("Triangle:");
        for (int i = 1; i <= 5; i++) {
            multiPrint(5 - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }

        System.out.println("Diamond:");
        for (int i = 1; i <= 5; i++) {
            multiPrint(5 - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            multiPrint(5 - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println();
        }

        //Q3
        int[] values = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        reverseArrayIntegers(values);
        System.out.println("The reversed integers:");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        //Q4
        System.out.println("GCD of (24, 8): " + gcd(24, 8));
        System.out.println("GCD of (200, 625): " + gcd(200, 625));

        //Q5
        int score = 0;
        while (true) {
            int number1 = random.nextInt(13);
            int number2 = random.nextInt(13);

            System.out.print("Enter negative number to quit. ");
            System.out.print(number1 + " x " + number2 + " = ");
            int answer = sc.nextInt();

            if (answer < 0) {
                break;
            }

            if (isCorrectMultiplication(number1, number2, answer)) {
                score++;
            }
        }
        System.out.println("Your Score is " + score);

        //Q6
        System.out.println("The first 20 palindromic prime:");
        int found = 0;
        int number = 2;
        while (found < 20) {
            if (isPalindromicPrime(number)) {
                System.out.print(number + " ");
                found++;
            }
            number++;
        }
        System.out.println();

        System.out.println("The first 20 emirp:");
        found = 0;
        number = 2;
        while (found < 20) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                found++;
            }
            number++;
        }
        System.out.println();

        sc.close();
    }

    public static int triangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    public static void reverseArrayIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int reversed = 0;

            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }

            array[i] = reversed;
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static boolean isCorrectMultiplication(int a, int b, int answer) {
        return answer == a * b;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindromicPrime(int number) {
        return isPrime(number) && number == reverseNumber(number);
    }

    public static boolean isEmirp(int number) {
        int reversed = reverseNumber(number);
        return isPrime(number) && reversed != number && isPrime(reversed);
    }
}
