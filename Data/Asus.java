/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author A S U S
 */
public class Asus extends Laptop {
    public Asus(String name, String brand, String processor,String core,String SO, 
            String RAM, String storage, String stok){
        super(name,brand,processor,core,SO,RAM,storage,stok);
        this.storage=storage;
    }
    
    String warna;
    
    public String warna(){
        return "Hitam";
    }
    

    public String tampil(){
        Storefront();
        return "Nama\t\t: "+name+"\nBrand\t\t: "+brand+"\nNama Processor\t: "+processor+
                "\nJumlah core\t: "+core+"\nSistem Operasi\t: "+SO+
                "\nUkuran RAM(GB)\t: "+RAM+"\nJenis Storage\t: "+storage+
                "\nStorefront Position : "+ket+"\nStok Tersedia\t: "+stok+"\nWarna\t\t: "+warna();
    }
}
