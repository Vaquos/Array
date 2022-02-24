package com.Array;
import java.util.Scanner;

public class rata_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] data = new int[100];
        int n;
        float a = 0;
        double total;

        System.out.println("===========================================");
        System.out.print("Masukan Jumlah Elemen Array yang Diinginkan = ");
        n = input.nextInt();
        System.out.println("===========================================");
        System.out.println("Array Berjumlah " +n);
        for (int i = 0; i < n ; i++) {
            System.out.print("Masukan Data Ke- " + i + " = ");
            data[i] = input.nextInt();
        }
        for ( int b: data ) {
            a = a + b;
        }

        System.out.println("===========================================");
        System.out.println("Total Data adalah " +a);
        total = (a / n);
        System.out.println("rata rata adalah " +total);
    }
}
