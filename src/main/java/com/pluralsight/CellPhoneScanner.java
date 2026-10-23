package com.pluralsight;

import java.util.Scanner;
public class CellPhoneScanner {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

        System.out.print("Enter Owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter Serial Number: ");
        int serialNumber = scanner.nextInt();

        System.out.println("--Phone 1--");
        System.out.println("Owner: " + owner);
        System.out.println("Serial Number: " + serialNumber);
        //
    }
}
