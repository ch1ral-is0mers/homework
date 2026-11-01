//WIX1002
//Lab 1
//Tang Jizhi
//25007562

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Lab_1 {

    public static void main(String[] args) {
        // Run each exercise one after another; there is no menu.
        showProfile();
        displayShapes();
        debuggerPractice();

        // Open the Q4 chart window after the console exercises.
        showSalesChart();
    }
    private static void showProfile() {
        System.out.println("================================");
        System.out.println("       MY PERSONAL PROFILE");
        System.out.println("================================");
        System.out.println("Full Name     : Your Name");
        System.out.println("Matric Number : Your Matric Number");
        System.out.println("Address       : Your Address");
        System.out.println("Email         : your@email.com");
        System.out.println("Contact       : 012-3456789");
        System.out.println("Course        : WIX1002");
        System.out.println("University    : Universiti Malaya");
        System.out.println("================================");
        System.out.println();
    }
    private static void displayShapes() {
        System.out.println("RECTANGLE");
        String[] rectangle = {
            "........",
            ".      .",
            ".      .",
            ".      .",
            ".      .",
            "........"
        };
        printShape(rectangle);

        System.out.println("\nOVAL");
        String[] oval = {
            "   ...",
            " .     .",
            ".       .",
            ".       .",
            ".       .",
            " .     .",
            "   ..."
        };
        printShape(oval);

        System.out.println("\nPLUS SIGN");
        String[] plus = {
            "    .",
            "    .",
            "    .",
            "...........",
            "    .",
            "    .",
            "    ."
        };
        printShape(plus);

        System.out.println("\nDIAMOND");
        String[] diamond = {
            "     .",
            "    . .",
            "   .   .",
            "  .     .",
            " .       .",
            ".         .",
            " .       .",
            "  .     .",
            "   .   .",
            "    . .",
            "     ."
        };
        printShape(diamond);
        System.out.println();
    }

    private static void printShape(String[] shape) {
        for (String line : shape) {
            System.out.println(line);
        }
    }
    private static void showSalesChart() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("L1Q4 - Total Sales of Product A");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(new SalesChartPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static class SalesChartPanel extends JPanel {

        private final String[] months = {
            "January", "February", "March",
            "April", "May", "June"
        };

        private final int[] sales = {
            2500, 1600, 2000, 2700, 3200, 800
        };

        SalesChartPanel() {
            setPreferredSize(new Dimension(820, 520));
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
            );

            int left = 85;
            int right = 785;
            int top = 95;
            int bottom = 420;
            int chartHeight = bottom - top;
            int maxValue = 3500;

            g2.setColor(Color.BLACK);
            g2.setFont(new Font("Arial", Font.BOLD, 22));
            g2.drawString("Total Sales of Product A", 250, 42);

            g2.setFont(new Font("Arial", Font.PLAIN, 13));
            g2.drawString("Sales Amount", 12, 78);

            g2.drawLine(left, top, left, bottom);
            g2.drawLine(left, bottom, right, bottom);

            for (int value = 0; value <= 3500; value += 500) {
                int y = bottom - (value * chartHeight / maxValue);

                g2.setColor(new Color(220, 220, 220));
                g2.drawLine(left, y, right, y);

                g2.setColor(Color.BLACK);
                g2.drawString(String.valueOf(value), 42, y + 5);
            }

            int barWidth = 65;
            int gap = 38;
            int startX = 112;

            for (int i = 0; i < sales.length; i++) {
                int x = startX + i * (barWidth + gap);
                int barHeight = sales[i] * chartHeight / maxValue;
                int y = bottom - barHeight;

                g2.setColor(new Color(65, 115, 190));
                g2.fillRect(x, y, barWidth, barHeight);

                g2.setColor(Color.BLACK);
                g2.setFont(new Font("Arial", Font.PLAIN, 12));
                g2.drawString(String.valueOf(sales[i]), x + 15, y - 8);
                g2.drawString(months[i], x - 5, bottom + 22);
            }

            g2.drawString("Month", 410, 485);
            g2.dispose();
        }
    }
    private static void debuggerPractice() {
        System.out.println("DEBUGGER PRACTICE");

        // Set a breakpoint on this line when practising in VS Code.
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = a / b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Division = " + division);
        System.out.println();
    }
}
