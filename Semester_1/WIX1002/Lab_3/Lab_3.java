//WIX1002
//Lab 3
//Tang Jizhi
//25007562

import java.util.Scanner;
import java.util.Random;

public class Lab3_All {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //Q1
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operand: ");
        String opStr = input.next();
        char op = opStr.charAt(0);
        int result;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            case '%': result = num1 % num2; break;
            default:
                System.out.println("Invalid operand!");
                input.close();
                return;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + result);

        //Q2
        int num = rand.nextInt(6);
        String word;
        switch (num) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            default: word = "unknown";
        }
        System.out.println(num + " is " + word + ".");

        //Q3
        System.out.print("Enter sales volume: ");
        double sales = input.nextDouble();
        double commission;
        if (sales <= 100) {
            commission = sales * 0.05;
        } else if (sales <= 500) {
            commission = sales * 0.075;
        } else if (sales <= 1000) {
            commission = sales * 0.10;
        } else {
            commission = sales * 0.125;
        }
        System.out.printf("Total commission: %.2f\n", commission);

        //Q4
        int p1_1 = rand.nextInt(6) + 1;
        int p1_2 = rand.nextInt(6) + 1;
        int p1Total = p1_1 + p1_2;
        int p2_1 = rand.nextInt(6) + 1;
        int p2_2 = rand.nextInt(6) + 1;
        int p2Total = p2_1 + p2_2;
        System.out.println("Player 1 rolls: " + p1_1 + " + " + p1_2 + " = " + p1Total);
        System.out.println("Player 2 rolls: " + p2_1 + " + " + p2_2 + " = " + p2Total);
        if (p1Total > p2Total) {
            System.out.println("Player 1 wins!");
        } else if (p2Total > p1Total) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        //Q5
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double denominator = a * d - b * c;
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        //Q6
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter the coordinate point (x, y): ");
        double px = input.nextDouble();
        double py = input.nextDouble();
        double distanceSq = px * px + py * py;
        double radiusSq = radius * radius;
        if (distanceSq < radiusSq) {
            System.out.println("The point is inside the circle.");
        } else if (distanceSq > radiusSq) {
            System.out.println("The point is outside the circle.");
        } else {
            System.out.println("The point is on the circle.");
        }

        input.close();
    }
}