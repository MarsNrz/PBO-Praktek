/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_4_pbo_kasus1;

/**
 *
 * @author Marshya N
 */
public class Inventori {
    barang[] barangs;

    void initBarang() {
        barangs = new barang[2];
        barangs[0] = new barang("001", "Baju", 10);
        barangs[1] = new barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();

        // Menggunakan setter untuk mengubah stok barang
        barangs[0].setStok(barangs[0].getStok() + 20);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
