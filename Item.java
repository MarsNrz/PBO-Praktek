/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_4_pbo_kasus2;

/**
 *
 * @author Marshya N
 */

public class Item {
    private String name;

    public Item() {
        name = "ipin";
    }

    public Item(String name) {
        this(); // Mengubah nilai name menggunakan parameter yang diterima
        System.out.println(this.name);
    }
}

