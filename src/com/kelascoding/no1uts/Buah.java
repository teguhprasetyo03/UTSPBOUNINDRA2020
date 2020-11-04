package com.kelascoding.no1uts;

import java.util.Scanner;

public class Buah {
    String nama;
    int no_telp, pil;

    public Buah(String nama) {
        this.nama = nama;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jeruk jeruk1 = new Jeruk();
        Mangga mangga1 = new Mangga();

        System.out.println("=====SELAMAT DATANG DI TOKO BUAH HOTARU=====");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan Nama Pelanggan : ");
        String nama = scan.nextLine();
        Buah b = new Buah(nama);
        jeruk1.setbuah(b);
        mangga1.setbuah(b);


        System.out.print("Masukkan No Telp : ");
        int no_telp = scan.nextInt();

        System.out.println("Jenis buah yang ingin di beli : ");
        System.out.println("1. Jeruk");
        System.out.println("2. Mangga");
        System.out.print("Pilihan : ");
        int pil = scan.nextInt();

        if (pil == 1) {

            jeruk1.tampil_pilih_jenis_buah();

        } else if (pil == 2) {

            mangga1.tampil_pilih_jenis_buah1();

        } else {
            System.out.println("");
        }
    }
}
