/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_3_pbo;

import java.util.Scanner;

/**
 *
 * @author Marshya N
 */
public class Tugas_3_PBO_nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Baca input
        String inputStr = input.nextLine();
        String[] tokens = inputStr.split(" ");
        int A = Integer.parseInt(tokens[0]);
        String operator = tokens[1];
        int B = Integer.parseInt(tokens[2]);

        // Operasi matematika sesuai operator
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = A + B;
                break;
            case "-":
                hasil = A - B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B;
                break;
            case "%":
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        // Cetak hasil
        System.out.println(hasil);
    }
}
