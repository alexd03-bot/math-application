package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        //1. Salary
        int bobSalary = 25000, garySalary = 45000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + ".");

        //2. Variables
        double carPrice = 4000.99, truckPrice = 18000.99;
        double smallest = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + smallest + ".");

        //3. Area
        double area = 3.14 * (7.25 * 7.25);
        System.out.println(area);

        //4. Square root
        double root = Math.sqrt(5.0);
        System.out.println(root);

        //5.



        //6.
        double absolute = Math.abs(-3.8);
        System.out.println(absolute);

        //7.
        double random = Math.random();
        System.out.println(random);

        //8.

    }
}
