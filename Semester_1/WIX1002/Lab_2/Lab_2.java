//WIX1002
//Lab 2
//Tang Jizhi
//25007562

import java.util.Scanner;

//Q1
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        
        System.out.printf("%.2f Fahrenheit = %.2f Celsius", fahrenheit, celsius);
        sc.close();
    }
}

//Q2
public class CarLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Car price (P): ");
        double P = sc.nextDouble();
        System.out.print("Down payment (D): ");
        double D = sc.nextDouble();
        System.out.print("Annual interest rate % (R): ");
        double R = sc.nextDouble();
        System.out.print("Loan years (Y): ");
        double Y = sc.nextDouble();
        
        double principal = P - D;
        double monthlyPayment = principal * (1 + R * Y / 100) / (Y * 12);
        
        System.out.printf("Monthly Payment: %.2f", monthlyPayment);
        sc.close();
    }
}

//Q3
public class RandomStats {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int n1 = rand.nextInt(41) + 10;
        int n2 = rand.nextInt(41) + 10;
        int n3 = rand.nextInt(41) + 10;
        
        int sum = n1 + n2 + n3;
        double avg = sum / 3.0;
        
        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f", avg);
    }
}

//Q4
public class SecondsConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int total = sc.nextInt();
        
        int hours = total / 3600;
        int remain = total % 3600;
        int minutes = remain / 60;
        int seconds = remain % 60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds",
                total, hours, minutes, seconds);
        sc.close();
    }
}

//Q5
public class DigitSum {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10001); // 生成 0 ~ 10000 的整数
        
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("Random number: " + num);
        System.out.println("Sum of digits: " + sum);
    }
}

//Q6
public class HeatEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double massGram = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initF = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalF = sc.nextDouble();
        
        double massKg = massGram / 1000.0;
        double initC = (initF - 32) / 1.8;
        double finalC = (finalF - 32) / 1.8;
        
        double energy = massKg * (finalC - initC) * 4184;
        
        System.out.printf("The energy needed is %e", energy);
        sc.close();
    }
}
