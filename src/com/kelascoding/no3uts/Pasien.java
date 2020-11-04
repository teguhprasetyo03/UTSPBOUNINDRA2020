package com.kelascoding.no3uts;

import java.util.Scanner;

public class Pasien extends RumahSakit{

    String nama,penyakit;
    int noKamar;
    String ktp;

    public int getNoKamar() {
        return noKamar;
    }

    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }


}
