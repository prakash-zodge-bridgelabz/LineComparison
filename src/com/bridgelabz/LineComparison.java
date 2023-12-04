package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparison UC_1 = new LineComparison();
        UC_1.UC_1_LineLengthCalculator();
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
}
