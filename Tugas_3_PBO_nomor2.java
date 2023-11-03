/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_3_pbo;

/**
 *
 * @author Marshya N
 */

import java.util.Scanner;
public class Tugas_3_PBO_nomor2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayString;
        int[] arrayNum;
        arrayString = new String[3];
        arrayNum = new int[3];
        
        for (int i = 0; i < 3; i++){
            arrayString[i] = scanner.next(); // Input string
            arrayNum[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 3; i++){
            System.out.printf("%-15s %03d %n", arrayString[i], arrayNum[i]);
        }
        scanner.close();
    }
}
    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] array;
//        array = new String[3];
//        int n = scanner.nextInt();
//        
//        
//        for (int i = 0; i < 3; i++){
//            String k = scanner.nextLine(); // Input number
//            array[i] = k;
//        }
//        
//        for (int i = 0; i < 3; i++){
//            int value = Integer.parseInt( n.replaceAll("[^0-9]", ""));
//            System.out.printf("%-15s%03d%n", array[i], value);
//        }
//
//        scanner.close();
//    }
//}


