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
public class Tugas_3_PBO_nomor5 {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String plat = input.nextLine();
        String platMerge = plat.replaceAll("\\s", "");
        long n = Long.parseLong(platMerge);
        long result = (n - 999999)%5;
        
        if(result != 0){
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
