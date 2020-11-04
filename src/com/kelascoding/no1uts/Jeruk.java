package com.kelascoding.no1uts;

import java.util.Scanner;

class Jeruk {
    int pil;
    int harga,jml_beli;
    String buah;
    Buah b;
    void setbuah(Buah b){
        this.b=b;
    }
    void tampil_pilih_jenis_buah(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Jenis Buah Jeruk");
        System.out.println("-----------------------------");
        System.out.println("1. Jeruk Nipis           Rp 5.000");
        System.out.println("2. Jeruk Manis           Rp 10.000");
        System.out.println("3. Jeruk Bali           Rp 50.000");
        System.out.println("9. check out");
        System.out.print("pilihan anda :");
        int pil = scan.nextInt();

        if (pil==1){
            buah="Jeruk Nipis";
            harga=5000;
            System.out.print("banyaknya buah yang dibeli : ");
            jml_beli = scan.nextInt();
            System.out.println("berhasil di tambahkan");

        }else if(pil==2){
            buah="Jeruk Manis";
            harga=10000;
            System.out.print("banyaknya buah yang dibeli : ");
            jml_beli = scan.nextInt();
            System.out.println("berhasil di tambahkan");
        }else if(pil==3){
            buah="Jeruk Bali";
            harga=50000;
            System.out.print("banyaknya buah yang dibeli : ");
            jml_beli = scan.nextInt();
            System.out.println("berhasil di tambahkan");
        }else{
            System.out.print("");
        }
        System.out.print("Pilihan anda : ");
        int pil2 = scan.nextInt();

        if(pil2==9){

            System.out.println("---------------------");
            System.out.println("===Struck Pemblian===");
            System.out.println("yang dibeli");
            System.out.println("Buah                  banyak buah");
            System.out.println("1."+buah+"            "+jml_beli+" Kg");
            double total=harga*jml_beli;
            System.out.println("Total yang harus dibayar : "+total);
            System.out.println("----------------------------------");
            System.out.println("Terima kasih Telah Berbelanja "+b.nama+" Jangan Lupa Datang Kembali");
        }
    }

    void tampil_total_harga(int harga){

    }
}

