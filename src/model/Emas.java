/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class Emas {
    private double berat;
    private int hargaEmas;

    public Emas() {
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total seberat 15,7 gram. Jika harga emas");
        System.out.println("per bulang oktober ini adalah Rp 570.000. Berapa");
        System.out.println("total bayar yang harus dikeluarkan oleh Hendi?");
    }
    
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
 
    public double totalHarga(){
        return getBerat() * getHargaEmas();
    }
    
}
