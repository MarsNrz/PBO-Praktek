/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_2_pbo;

/**
 *
 * @author Marshya N
 */

import java.util.Scanner;

public class Tugas_2_PBO_nomor1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        String[] array;
        array = new String[t];
        
        for (int i = 0; i < t; i++){
            String n = scanner.next(); // Input number
            array[i] = n;
        }

        for (int i = 0; i < t; i++) {
            try {
                long n = Long.parseLong(array[i]);
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } 
            catch(NumberFormatException ex){System.out.println(array[i] + "can't be fit anywhere.");} 
        }

        scanner.close();
    }
}