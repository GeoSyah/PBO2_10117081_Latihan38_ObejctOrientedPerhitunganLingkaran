/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan38_perhitunganlingkaran;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Kelas ini berisi rumus-rumus lingkaran
 */
public class Lingkaran {
    public double luas;
    public double keliling;
    public double jariJari;
    
    public double luasLingkaran(double jariJari) {
        luas = Math.PI * jariJari * jariJari;
        return luas;
    }

    public double kelilingLingkaran(double jariJari) {
        keliling = 2 * Math.PI * jariJari;
        return keliling;
    } 
    
    public double jariJariLingkaran(double diameter) {
        jariJari = diameter / 2;
        return jariJari;
    }

}
