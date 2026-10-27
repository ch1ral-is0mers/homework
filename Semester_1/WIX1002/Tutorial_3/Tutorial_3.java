//WIX1002
//Tutorial 3
//Tang Jizhi
//25007562

public class Tutorial3 {
    public static void main(String[] args) {
        //Q1
        if (3 * 8 == 27) {
            System.out.println("3*8 equals 27");
        } else {
            System.out.println("3*8 does not equal 27");
        }

        int num = 7;
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

        char ch = 'B';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a capital letter");
        }

        String s1 = "hello";
        String s2 = "World";
        if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(s1);
            System.out.println(s2);
        } else {
            System.out.println(s2);
            System.out.println(s1);
        }

        int dayNum = 2;
        switch(dayNum) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Invalid input");
        }

        //Q2
        int num1 = 5, num2 = 5;
        if (num1 == num2)
            System.out.println("Number 1 is equal to number 2.");

        int x2 = 5, y2 = 3, z2 = 1;
        if (x2 > y2 && y2 > z2)
            System.out.println("x is the largest number");

        String strA = "test", strB = "test";
        if (strA.equals(strB))
            System.out.println("They are equal strings.");
        else
            System.out.println("They are not equal strings.");

        int a = 2, b = -1;
        if (a > 0 || b > 0)
            System.out.println("Either x or y is positive");

        //Q3
        int x = 9;
        int y = 10;

        if (x < 10)
        if (y > 10)
        System.out.println("*****");
        else
        System.out.println("#####");
        System.out.println("$$$$$");

        if (x < 10) {
        if (y < 10)
        System.out.println("*****");
        else{
        System.out.println("#####");
        System.out.println("$$$$$");
        }}

        if (x < 10) {
        if (y < 10)
        System.out.println("*****");
        System.out.println("#####");
        }
        else {
        System.out.println("$$$$$");
        }

        if (x > 10) {
        if (y > 10) {
        System.out.println("*****");
        System.out.println("#####"); }
        else
        System.out.println("$$$$$");
        }

        //Q4
        int n1 = 12, n2 = 25, n3 = 18;
        int max;
        if (n1 >= n2 && n1 >= n3) {
            max = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            max = n2;
        } else {
            max = n3;
        }
        System.out.println("The biggest number is: " + max);

        //Q5
        int year = 2024;
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}