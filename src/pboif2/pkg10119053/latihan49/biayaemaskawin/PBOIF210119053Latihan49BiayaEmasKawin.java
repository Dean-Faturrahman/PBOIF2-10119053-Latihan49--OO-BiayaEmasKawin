/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan49.biayaemaskawin;

import model.Emas;
import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program biaya emas kawin
 */
public class PBOIF210119053Latihan49BiayaEmasKawin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Emas emas = new Emas();
        
        System.out.println("\n===Menghitung Harga Emas===");
        System.out.print("Masukkan berat emas = ");
        emas.setBerat(input.nextDouble());
        System.out.print("Masukkan harga emas per bulan ini = Rp.");
        emas.setHargaEmas(input.nextInt());
        System.out.printf("\nTotal Biaya = Rp.%,1.0f%n", emas.totalHarga());
    }
    
}
