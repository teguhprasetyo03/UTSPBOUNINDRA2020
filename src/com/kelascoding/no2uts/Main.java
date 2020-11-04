package com.kelascoding.no2uts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String nama="",kamar="" ;
        double bayar=0;
        int jenis=0, lama =0, tarif =0;

        Hotel hotel = new Hotel();
        Scanner input = new Scanner(System.in);

        System.out.println("|           Hotel Melati         |");
        System.out.println("===========================================");

        System.out.print("Masukkan Nama Pengunjung : ");
        nama = input.next();

        System.out.println("TIPE KAMAR YANG TERSEDIA");
        System.out.println("1. Standar  Rp 400.000");
        System.out.println("2. Superior Rp 500.000");
        System.out.println("3. Standar  Rp 650.000");
        System.out.println("4. Superior Rp 750.000");
        System.out.println("Jenis Kamar yang dipesan : ");
        jenis = Integer.parseInt(input.next());

        System.out.println("Masukkan Lama Menginap : ");
        lama = Integer.parseInt(input.next());

        hotel.setNama(nama);
        hotel.setJenis(jenis);
        hotel.setLama(lama);
        hotel.setBayar(bayar);
        hotel.setTarif(tarif);

        // proses perhitungan

        if (jenis==1) {
            tarif =  400000;
            kamar = "Standar";
        } else if (jenis==2) {
            tarif = 500000;
            kamar = "Superior";
        } else if (jenis==3) {
            tarif =  500000;
            kamar = "Superior";
        }  else if (jenis==4) {
            tarif = 500000;
            kamar = "Superior";
        }

        // method menghitung total bayar
        bayar = tarif * lama;

                // Tampilkan datanya
                System.out.println("+------------------------------------------+");
                System.out.println("|          Hotel Melati           |");
                System.out.println("+------------------------------------------+");
                System.out.println("| Nama Pengunjung: " + hotel.getNama());
                System.out.println("| Tipe Kamar : " + kamar);
                System.out.println("| Tipe Harga Kamar  : " + tarif);
                System.out.println("| Lama Menginap : " + hotel.getLama() + " Hari");
                System.out.println("| Total Bayar : " + bayar);
                System.out.println("+------------------------------------------+");

        }
    }

