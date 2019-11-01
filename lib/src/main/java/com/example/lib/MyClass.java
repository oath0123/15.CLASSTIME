package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Time:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if((num1>=7&&num2<=30)||(num1<=17&&num2<=0))
            System.out.println("School Time");
        else
            System.out.println("After School");

    }
}
