package com.example.maven_github_demo;

import java.util.Scanner;

public class App {

    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = calculateArea(radius);

        System.out.println("Area of the circle = " + area);

        sc.close();
    }
}