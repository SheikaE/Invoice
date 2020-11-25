package com.company;

import sun.tools.tree.IfStatement;
import sun.tools.tree.WhileStatement;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create an invoice for a store
        Scanner input = new Scanner(System.in);
        ArrayList<String> Products = new ArrayList<>();
        ArrayList<Double> Prices = new ArrayList<>();
        // Input products and prices
        Products.add("Bison Sweater");
        Prices.add(55.99);
        Products.add("Bison Tee");
        Prices.add(14.99);
        Products.add("Bison Hoodie");
        Prices.add(23.99);
        Products.add("Bison Bumpersticker");
        Prices.add(4.99);

        // Loop asking user what they want

        String answer = "";
        ArrayList<String> purchases = new ArrayList<String>();
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) change purchase 3) show purchases 4) finish transaction");
            answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.println("What do you wish to buy?");
                answer = input.nextLine();
                purchases.add(answer);
            }
            if (answer.equals("2")) {
                System.out.println("Change purchase: ");
                String secondoption = input.nextLine();
            }
            if (answer.equals("3")) {
                for (int i = 0; i < purchases.size(); i++) {
                    System.out.println(purchases.get(i));
                }
            }
        } while (!answer.equals("4")) ;
        double totalcost = 0.0;
        int j = 0;
        for (int i = 0; i < purchases.size(); i++)
        {
            do {
                // condition is check if the value in purchases at position i is equal to the value in products at position j

                { totalcost = totalcost + Prices.get(i);

                // increment totalcost with the ith value in the prices array
                }
                j++;
            } while (j < Products.size());
            System.out.println("Total Cost: " + totalcost);
}
    }
}

