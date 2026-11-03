//WIX1002
//Lab 4
//Tang Jizhi
//25007562


import java.util.Scanner;
import java.util.Random;

public class Lab_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        //Q1
        {
            System.out.print("Enter an Integer: ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.print("The factors are: ");

                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        System.out.print(i);

                        if (i != num) {
                            System.out.print(", ");
                        }
                    }
                }

                System.out.println();
            }
        }

        //Q2
        {
            System.out.print("Enter n: ");
            int n = input.nextInt();

            long sum = 0;
            long currentSum = 0;

            for (int i = 1; i <= n; i++) {
                currentSum += i;
                sum += currentSum;
            }

            System.out.println("The sum is: " + sum);
        }

        //Q3
        {
            double score;
            double sum = 0;
            double sumSquare = 0;
            double min = Double.MAX_VALUE;
            double max = -Double.MAX_VALUE;
            int count = 0;

            do {
                System.out.print("Enter a score [negative score to quit]: ");
                score = input.nextDouble();

                if (score >= 0) {
                    sum += score;
                    sumSquare += score * score;

                    if (score < min) {
                        min = score;
                    }

                    if (score > max) {
                        max = score;
                    }

                    count++;
                }

            } while (score >= 0);

            if (count == 0) {
                System.out.println("No scores entered.");
            } else {
                double average = sum / count;

                System.out.println("Minimum Score: " + min);
                System.out.println("Maximum Score: " + max);
                System.out.printf("Average Score: %.2f%n", average);

                if (count >= 2) {
                    double variance =
                        (sumSquare - (sum * sum / count)) / (count - 1);

                    variance = Math.max(0, variance);

                    double standardDeviation = Math.sqrt(variance);

                    System.out.printf(
                        "Standard Deviation: %.2f%n",
                        standardDeviation
                    );
                } else {
                    System.out.println("Standard Deviation: Undefined");
                }
            }
        }

        //Q4
        {
            System.out.print("Enter year: ");
            int year = input.nextInt();

            System.out.print("Enter the first day of the year (0=Sunday, 6=Saturday): ");
            int firstDay = input.nextInt();

            if (firstDay < 0 || firstDay > 6) {
                System.out.println("Invalid first day.");
            } else {
                int[] daysInMonth = {
                    31, 28, 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31
                };

                boolean leapYear =
                    (year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0);

                if (leapYear) {
                    daysInMonth[1] = 29;
                }

                int mayFirstDay = firstDay;

                for (int i = 0; i < 4; i++) {
                    mayFirstDay += daysInMonth[i];
                }

                mayFirstDay %= 7;

                int augustFirstDay = firstDay;

                for (int i = 0; i < 7; i++) {
                    augustFirstDay += daysInMonth[i];
                }

                augustFirstDay %= 7;

                System.out.println("\n       May " + year);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

                for (int i = 0; i < mayFirstDay; i++) {
                    System.out.print("    ");
                }

                for (int day = 1; day <= 31; day++) {
                    System.out.printf("%3d ", day);

                    if ((day + mayFirstDay) % 7 == 0) {
                        System.out.println();
                    }
                }

                System.out.println("\n");

                System.out.println("       August " + year);
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

                for (int i = 0; i < augustFirstDay; i++) {
                    System.out.print("    ");
                }

                for (int day = 1; day <= 31; day++) {
                    System.out.printf("%3d ", day);

                    if ((day + augustFirstDay) % 7 == 0) {
                        System.out.println();
                    }
                }

                System.out.println("\n");
            }
        }

        //Q5
        {
            int player1 = 0;
            int player2 = 0;
            boolean player1Turn = true;

            while (player1 <= 100 && player2 <= 100) {
                int dice = random.nextInt(6) + 1;

                if (player1Turn) {
                    System.out.println("\nPlayer 1's turn");
                    System.out.println("Dice: " + dice);

                    player1 += dice;

                    System.out.println("Player 1 score: " + player1);
                    System.out.println("Player 2 score: " + player2);

                    if (player1 > 100) {
                        break;
                    }

                    if (dice != 6) {
                        player1Turn = false;
                    }

                } else {
                    System.out.println("\nPlayer 2's turn");
                    System.out.println("Dice: " + dice);

                    player2 += dice;

                    System.out.println("Player 1 score: " + player1);
                    System.out.println("Player 2 score: " + player2);

                    if (player2 > 100) {
                        break;
                    }

                    if (dice != 6) {
                        player1Turn = true;
                    }
                }
            }

            if (player1 > 100) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        }

        //Q6
        {
            int number = random.nextInt(Integer.MAX_VALUE);

            System.out.println("Random number: " + number);

            int temp = number;
            int count = 0;

            if (temp == 0) {
                count = 1;
            } else {
                while (temp > 0) {
                    temp /= 10;
                    count++;
                }
            }

            System.out.println("Number of digits: " + count);
        }

        //Q7
        {
            System.out.print("Enter principal amount: ");
            double principal = input.nextDouble();

            System.out.print("Enter interest rate in %: ");
            double annualRate = input.nextDouble();

            System.out.print("Enter total number of month(s): ");
            int months = input.nextInt();

            if (principal <= 0 || annualRate < 0 || months <= 0) {
                System.out.println("Invalid input.");
            } else {
                double monthlyRate = annualRate / (12 * 100);

                double monthlyPayment;

                if (monthlyRate == 0) {
                    monthlyPayment = principal / months;
                } else {
                    monthlyPayment =
                        (principal * monthlyRate) /
                        (1 - Math.pow(1 + monthlyRate, -months));
                }

                double balance = principal;
                double totalInterest = 0;

                System.out.printf(
                    "%-8s %-17s %-14s %-14s %-17s %-14s%n",
                    "Month",
                    "Monthly Payment",
                    "Principal",
                    "Interest",
                    "Unpaid Balance",
                    "Total Interest"
                );

                for (int month = 1; month <= months; month++) {
                    double interest = balance * monthlyRate;

                    double principalPaid = monthlyPayment - interest;

                    if (month == months) {
                        principalPaid = balance;
                    }

                    double payment = principalPaid + interest;

                    balance -= principalPaid;
                    totalInterest += interest;

                    if (Math.abs(balance) < 0.005) {
                        balance = 0;
                    }

                    System.out.printf(
                        "%-8d %-17.2f %-14.2f %-14.2f %-17.2f %-14.2f%n",
                        month,
                        payment,
                        principalPaid,
                        interest,
                        balance,
                        totalInterest
                    );
                }
            }
        }

        //Q8
        {
            int n = random.nextInt(101);

            System.out.println("Random n: " + n);
            System.out.println("The first " + n + " prime numbers are:");

            int count = 0;
            int number = 2;

            while (count < n) {
                boolean isPrime = true;

                for (int i = 2; i <= number / i; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(number + " ");
                    count++;
                }

                number++;
            }

            System.out.println();
        }

        input.close();
    }
}