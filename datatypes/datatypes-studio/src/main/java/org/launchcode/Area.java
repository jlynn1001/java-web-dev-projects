package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Please enter a number for radius of a circle.");
        System.out.println(Circle.getArea(radius.nextDouble()));
    }

}
