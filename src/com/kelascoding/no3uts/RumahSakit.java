package com.kelascoding.no3uts;

import java.util.Scanner;

public class RumahSakit {


    public static void main(String[] args) {
        String namaRs;
        String alamatRs;
        String namaPasien,penyakit;
        String ktp;
        int nokamar;
        String namadokter;
        String spesialis;

        RumahSakit rs = new RumahSakit();
        Pasien ps = new Pasien();
        Dokter dk = new Dokter();
        Scanner str=new Scanner(System.in);

        System.out.println("Masukkan Nama Rumah Sakit   : ");
        namaRs = str.nextLine();
        System.out.println("Masukkan Alamat Rumah Sakit : ");
        alamatRs = str.nextLine();
        System.out.print("Masukkan Nomer KTP  Pasien          : ");
        ktp = str.nextLine();
        System.out.println("Masukkan Nama Pasien : ");
        namaPasien = str.nextLine();
        System.out.println("Masukkan Penyakit   : ");
        penyakit = str.nextLine();
        System.out.println("Masukkan No Kamar  : ");
        nokamar = str.nextInt();
        System.out.println("Masukkan Dokter Yang Menangangi         : ");
        namadokter = str.next();
        System.out.println("Masukkan Speasiliasi Dokter        : ");
        spesialis = str.next();


        ps.setKtp(ktp);
        ps.setNama(namaPasien);
        ps.setNoKamar(nokamar);
        ps.setPenyakit(penyakit);
        dk.setNamadokter(namadokter);
        dk.setSpesialis(spesialis);

        // Tampilkan datanya
        System.out.println("+------------------------------------------+");
        System.out.println("|          Program Rumah Sakit        |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Nama Rumah Sakit: " +namaRs);
        System.out.println("| Alamat Rumah Sakit : " + alamatRs);
        System.out.println("| Nomor KTP Pasien : " + ps.getKtp());
        System.out.println("| Nama Pasien : " +     ps.getNama());
        System.out.println("| Penyakit Pasien : " + ps.getPenyakit());
        System.out.println("| No Kamar Pasien : " + ps.getNoKamar());
        System.out.println("| Dokter Yang Menangani  " + namadokter);
        System.out.println("| Spesialis Dokter : " + spesialis);
        System.out.println("+------------------------------------------+");

    }

    public RumahSakit(){

        System.out.println("|         Program Rumah Sakit         |");
    }
}
