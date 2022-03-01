package com.Array;

import java.util.ArrayList;

public class Latihan4_ArrayList {
    public static void main(String[] args) {
        ArrayList stok_barang = new ArrayList();
        stok_barang.add("Sendal Jepit");
        stok_barang.add(200);
        stok_barang.add("Ukuran 41");
        stok_barang.add(2000);
        stok_barang.add(true);
        System.out.println(stok_barang);
        System.out.println("Stok Barang " + stok_barang.size() + " Item");
    }
}
