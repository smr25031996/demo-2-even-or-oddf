package com.jap.oddeven;

import java.util.Scanner;

public class OddEvenImpl {
    public static void main(String[] args) {
        OddEven oddeven = number -> number%2==0 ? "Number is even" : "Number is odd";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println(oddeven.oddOrEven(num));

    }
}
