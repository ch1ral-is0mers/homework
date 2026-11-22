//WIX1002
//Tutorial 6
//Tang Jizhi
//25007562

import java.util.Random;

public class Tutorial_6 {

    // Q1(a)
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // Q1(b)
    public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        long root = Math.round(Math.sqrt(number));
        return root * root == number;
    }

    // Q1(c)
    public static long combination(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            return 0; // Invalid input
        }

        k = Math.min(k, n - k);
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - k + i) / i;
        }
        return result;
    }

    // Q1(d)
    // P(n) = n(3n - 1) / 2
    public static boolean isPentagonal(int number) {
        if (number <= 0) {
            return false;
        }

        long discriminant = 1L + 24L * number;
        long root = Math.round(Math.sqrt(discriminant));

        return root * root == discriminant && (1 + root) % 6 == 0;
    }

    // Q1(e)
    public static void countLettersAndDigits(String text) {
        int letterCount = 0;
        int digitCount = 0;

        if (text != null) {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    letterCount++;
                } else if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }
        }

        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of digits : " + digitCount);
    }

    // Q1(f)
    public static void generateTenRandomNumbers(int[] numbers) {
        if (numbers == null || numbers.length < 10) {
            throw new IllegalArgumentException("Array must have at least 10 elements.");
        }

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(101); // 0 to 100 inclusive
        }
    }

    // Q1(g)
    // results[0] = area, results[1] = circumference
    public static void circleMeasurements(double radius, double[] results) {
        if (results == null || results.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements.");
        }

        results[0] = Math.PI * radius * radius;
        results[1] = 2 * Math.PI * radius;
    }

    // Q1(h)
    public static int firstRepeatedRandomNumber() {
        Random random = new Random();
        boolean[] seen = new boolean[11];

        while (true) {
            int number = random.nextInt(11); // 0 to 10 inclusive
            if (seen[number]) {
                return number;
            }
            seen[number] = true;
        }
    }

    // Q2
    public static void displayDecreasing(int a, int b, int c) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        // Q1(a)
        System.out.println("Q1(a) Maximum: " + maxOfThree(3, 9, 5));

        // Q1(b)
        System.out.println("Q1(b) 49 is a square number: " + isSquare(49));
        System.out.println("Q1(b) 50 is a square number: " + isSquare(50));

        // Q1(c)
        System.out.println("Q1(c) C(5, 2) = " + combination(5, 2));

        // Q1(d)
        System.out.println("Q1(d) 12 is a pentagonal number: " + isPentagonal(12));
        System.out.println("Q1(d) 13 is a pentagonal number: " + isPentagonal(13));

        // Q1(e)
        System.out.println("Q1(e)");
        countLettersAndDigits("Java 17");

        // Q1(f)
        int[] randomNumbers = new int[10];
        generateTenRandomNumbers(randomNumbers);
        System.out.print("Q1(f) Random numbers:");
        for (int number : randomNumbers) {
            System.out.print(" " + number);
        }
        System.out.println();

        // Q1(g)
        double[] measurements = new double[2];
        circleMeasurements(5, measurements);
        System.out.printf("Q1(g) Area = %.2f, Circumference = %.2f%n",
                measurements[0], measurements[1]);

        // Q1(h)
        System.out.println("Q1(h) First repeated random number: "
                + firstRepeatedRandomNumber());

        // Q2
        System.out.print("Q2 Decreasing order: ");
        displayDecreasing(3, 9, 5);
    }
}
