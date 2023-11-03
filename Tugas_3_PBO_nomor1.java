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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Tugas_3_PBO_nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(input);
        
        int count = 0;
        
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

        matcher.reset();
        
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


