/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_3_pbo;

/**
 *
 * @author Marshya N
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Tugas_3_PBO_nomor6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two large numbers as strings
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Create BigInteger objects from the input strings
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        // Calculate the sum and product of the two numbers
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);

        // Print the results without leading zeros
        System.out.println(sum.toString());
        System.out.println(product.toString());

        scanner.close();
    }
}

