package com.company;
import java.util.*;
public class pp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L1, L2, L3, triangle;
        System.out.println("Enter the first value of an angle:  ");
        L1 = sc.nextDouble();
        System.out.println("Enter the Second value of an angle:  ");
        L2 = sc.nextDouble();
        System.out.println("Enter the Third value of an angle:  ");
        L3 = sc.nextDouble();

        triangle = L1 + L2 + L3;

        if (triangle == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
