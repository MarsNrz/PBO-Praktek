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
public class Tugas_2_PBO_nomor5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Calculate the sum of the lengths of A and B
        int sumOfLengths = A.length() + B.length();

        // Determine if A is lexicographically larger than B
        String lexicographicallyComparison = A.compareTo(B) > 0 ? "Yes" : "No";

        // Capitalize the first letter in A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the results
        System.out.println(sumOfLengths);
        System.out.println(lexicographicallyComparison);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}

