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

import java.util.*;
public class Tugas_3_PBO_nomor7 {
    public static void main(String[] args) {
        //One Dimension Arrays
        int[] firstArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        
        //Two DImentional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
        
        //Three DImentional Arrays
        int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
        
        for(int[][] twoDimensionalArray:threeDimensionalArray){
            System.out.print("{");
            for(int[] row:twoDimensionalArray){
                System.out.print(Arrays.toString(row));
            }
            System.out.println("}");
        }
    }
}

