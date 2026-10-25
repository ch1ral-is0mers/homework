//WIX1002
//Tutorial 2
//Tang Jizhi
//25007562

import java.util.Scanner;

public class JavaExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q1
        System.out.print("Faculty of ");
        System.out.print("Computer Science and ");
        System.out.println("Information Technology.");
        System.out.println("Faculty of Computer Science\nand Information Technology.");

        //Q2
        System.out.println("\"SDN\" - Software-defined networking");

        //Q3
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\t is the horizontal tab character");
        System.out.println("Java is case sensitive!");

        //Q4
        double metricNumber;
        double pi;
        boolean M = false;
        long P = 8800000000L;
        char letter = 'U';
        final String PRO = "Java";

        System.out.println("M = " + M);
        System.out.println("P = " + P);
        System.out.println("letter = " + letter);
        System.out.println("PRO = " + PRO);

        //Q5
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);

        String chapter = "Summary";
        System.out.println(chapter);

        int num = 0;
        num++;
        int num1 = num;
        System.out.println("num1 = " + num1);

        double numDouble = 3000;
        System.out.printf("%4.2f\n", numDouble);

        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();

        //Q6
        System.out.print("Enter diameter: ");
        double diameter = sc.nextDouble();
        double circumference = Math.PI * diameter;
        System.out.printf("The circumference of the circle is : %.3f\n", circumference);

        //Q7
        System.out.print("Enter value in inch: ");
        double inch = sc.nextDouble();
        double meter = inch * 0.0254;
        System.out.printf("%.2f inches = %.2f meters\n", inch, meter);

        sc.close();
        keyboard.close();
    }
}
