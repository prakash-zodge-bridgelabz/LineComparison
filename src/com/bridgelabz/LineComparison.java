package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparison UC_1 = new LineComparison();
        UC_1.UC_1_LineLengthCalculator();

        LineComparison UC_2 = new LineComparison();
        UC_2.UC_2_CheckEqualityOfTwoLines();
    }
    public void UC_1_LineLengthCalculator(){
        Scanner sc = new Scanner(System.in);
        // Input for the first point
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        // Input for the second point
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();
        // Calculate the length of the line
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        // Display the result
        System.out.println("The length of the line is: " + length);
    }
    public void UC_2_CheckEqualityOfTwoLines(){
        Scanner sc = new Scanner(System.in);
        // Input for the first point
        System.out.println("Enter first line details : ");
        System.out.print("Enter x1: ");
        double firstLine_x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double firstLine_y1 = sc.nextDouble();
        // Input for the second point
        System.out.print("Enter x2: ");
        double firstLine_x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double firstLine_y2 = sc.nextDouble();
        // Calculate the length of the first line
        double firstLineDeltaX = firstLine_x2 - firstLine_x1;
        double firstLineDeltaY = firstLine_y2 - firstLine_y1;
        double firstLineLength = Math.sqrt(firstLineDeltaX * firstLineDeltaX + firstLineDeltaY * firstLineDeltaY);
        System.out.println("The length of the line is: " + firstLineLength);
        System.out.println("---------------------------------");
        // Second Line inputs
        System.out.println("Enter second line details : ");
        System.out.print("Enter x1: ");
        double secondLine_x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double secondLine_y1 = sc.nextDouble();
        // Input for the second point
        System.out.print("Enter x2: ");
        double secondLine_x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double secondLine_y2 = sc.nextDouble();
        // Calculate the length of the first line
        double secondLineDeltaX = secondLine_x2 - secondLine_x1;
        double secondLineDeltaY = secondLine_y2 - secondLine_y1;
        double secondLineLength = Math.sqrt(secondLineDeltaX * secondLineDeltaX + secondLineDeltaY * secondLineDeltaY);
        // Display the result
        System.out.println("The length of the line is: " + secondLineLength);
        if(firstLineLength == secondLineLength) {
            System.out.println("Both lines have equal length");
        }
        else
        {
            System.out.println("Lines are not equal");
        }
    }
}
