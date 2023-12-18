/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_4_pbo_kasus1;

/**
 *
 * @author Marshya N
 */
public class barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Tambahkan metode getter untuk atribut stok
    public int getStok() {
        return stok;
    }

    // Tambahkan metode setter untuk atribut stok
    public void setStok(int newStok) {
        stok = newStok;
    }
}
