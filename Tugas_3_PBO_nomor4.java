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
public class Tugas_3_PBO_nomor4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input jumlah penjualan bulan ini
        int jumlahPenjualan = input.nextInt();

        // Gaji pokok agen
        int gajiPokok = 500000;

        // Harga setiap item
        int hargaItem = 50000;

        // Hitung bonus penjualan
        double bonusPenjualan;
        double denda = 0;
        if (jumlahPenjualan >= 40) {
            if (jumlahPenjualan > 80) {
                bonusPenjualan = 0.35 * jumlahPenjualan * hargaItem;
            } else {
                bonusPenjualan = 0.25 * jumlahPenjualan * hargaItem;
            }
        } else if (jumlahPenjualan >= 15) {
            bonusPenjualan = 0.10 * jumlahPenjualan * hargaItem;
        } else {
            bonusPenjualan = 0;
            denda = 0.15 * (15 - jumlahPenjualan) * hargaItem;
        }


        // Hitung total gaji
        double totalGaji = gajiPokok + bonusPenjualan - denda;

        // Cetak total gaji
        System.out.println("Total gaji: " + (int)totalGaji);

        input.close();
    }
}


