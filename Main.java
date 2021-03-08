package com.lr2;

import java.util.Scanner;
import com.lr2.util.Comparator;
import com.lr2.util.Exclusionary;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean x;
        boolean y;

        System.out.println("Enter X: ");
        x = console.nextBoolean();
        System.out.println("Enter Y: ");
        y = console.nextBoolean();

        Exclusionary firstObj = new Exclusionary(x, y);
        System.out.println("The final value: " + firstObj.calc());
        System.out.println();

        System.out.println("Enter X: ");
        x = console.nextBoolean();
        System.out.println("Enter Y: ");
        y = console.nextBoolean();

        Comparator secondObj = new Comparator(x, y);
        System.out.println("The final value: " + secondObj.calc());
    }
}
