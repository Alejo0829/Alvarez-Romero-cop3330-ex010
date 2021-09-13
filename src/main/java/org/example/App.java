package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 2021 Assignment 1 Solution
 * Copyright 2021 Rafael Alvarez-Romero
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the price of item 1: ");
        double item1price = sc.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int item1quantity = sc.nextInt();
        System.out.print( "Enter the price of item 2: ");
        double item2price = sc.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int item2quantity = sc.nextInt();
        System.out.print( "Enter the price of item 3: ");
        double item3price = sc.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int item3quantity = sc.nextInt();

        double total = (item1price * item1quantity) + (item2price * item2quantity) + (item3price * item3quantity);
        double totaltax = total * 0.055;
        double totalwithtax = totaltax + total;

        System.out.println("Subtotal: $"+ total);
        System.out.println("Tax: $"+ totaltax);
        System.out.println("Total: $"+totalwithtax);
    }
}
