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
public class LaptopApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        
        laptop.getName();
        laptop.getBrand();
        laptop.getProcessor();
        laptop.getCore();
        laptop.getSO();
        laptop.getRAM();
        laptop.getStorage();
        laptop.getStok();
        
        System.out.println("\nLAPTOP");
        System.out.println("Nama\t\t\t: "+laptop.getName());
        System.out.println("Brand\t\t\t: "+laptop.getBrand());
        System.out.println("Nama Processor\t\t: "+laptop.getProcessor());
        System.out.println("Jumlah core pada Processor : "+laptop.getCore());
        System.out.println("Sistem Operasi\t\t: "+laptop.getSO());
        System.out.println("Ukuran RAM dalam GB\t: "+laptop.getRAM());
        System.out.println("Jenis Storage\t\t: "+laptop.getStorage());
        System.out.println("Stok Tersedia\t\t: "+laptop.getStok());
    }
}
