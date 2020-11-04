package com.kelascoding.no2uts;

public class Hotel {

    String nama="";
    String kamar="" ;
    double bayar=0;
    int jenis=0, lama =0, tarif =0;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKamar() {
        return kamar;
    }

    public void setKamar(String kamar) {
        this.kamar = kamar;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

}
