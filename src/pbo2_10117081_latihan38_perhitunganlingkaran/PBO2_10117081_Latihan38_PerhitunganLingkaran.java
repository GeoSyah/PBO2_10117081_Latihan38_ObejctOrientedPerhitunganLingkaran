/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan38_perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program untuk menghitung, Luas, Keliling dan Jari-jari 
 *              Lingkaran
 */
public class PBO2_10117081_Latihan38_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
        double diameter;
        Scanner scn = new Scanner(System.in);
        Lingkaran circle = new Lingkaran();
        
        System.out.println("===== Perhitungan Lingkaran =====");
        
        do {
            System.out.print("Masukkan Nilai Diameter Lingkaran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        System.out.println("===== Hasil Perhitungan Lingkaran =====");
        diameter = Double.parseDouble(d); 
        System.out.printf("Jari-jari Lingkaran\t = %.0f cm %n",
                    circle.jariJariLingkaran(diameter));
        System.out.printf("Luas Lingkaran\t\t = %.2f cm %n",
                    circle.luasLingkaran(circle.jariJariLingkaran(diameter)));
        System.out.printf("Keliling Lingkaran\t = %.2f cm %n",
                    circle.kelilingLingkaran(circle.jariJariLingkaran(diameter)));
    
    }
  
}
