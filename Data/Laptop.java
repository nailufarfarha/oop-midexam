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
import java.util.Scanner;
public class Laptop {
    Scanner input = new Scanner(System.in);
    
    public Laptop(){
        this.setName();
        this.setBrand();
        this.setProcessor();
        this.setCore();
        this.setSO();
        this.setRAM();
        this.setStorage();
        this.setStok();
    }
    
    public Laptop(String name,String brand,String processor,String core,String SO, String RAM, String storage, String stok){
        this.name=name;
        this.brand=brand;
        this.processor=processor;
        this.core=core;
        this.SO=SO;
        this.RAM=RAM;
        this.storage=storage;
        this.stok=stok;     
    }
    
    String name,brand,processor,SO,storage,core,stok,RAM,ket;

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.print("Nama\t\t: ");
        this.name = input.nextLine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        System.out.print("Brand\t\t: ");
        this.brand = input.nextLine();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor() {
        System.out.print("Nama Processor\t: ");
        this.processor = input.nextLine();
    }

    public String getCore() {
        return core;
    }

    public void setCore() {
        System.out.print("Jumlah Core\t: ");
        this.core = input.nextLine();
    }

    public String getSO() {
        return SO;
    }

    public void setSO() {
        System.out.print("Sistem Operasi\t: ");
        this.SO = input.nextLine();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage() {
        System.out.print("Jenis Storage\t: ");
        this.storage = input.nextLine();
    }

    public String getStok() {
        return stok;
    }

    public void setStok() {
        System.out.print("Stok\t\t: ");
        this.stok = input.nextLine();
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM() {
        System.out.print("Ukuran RAM(GB)\t: ");
        this.RAM = input.nextLine();
    }
    
    public void Storefront(){
        switch (storage) {
            case "SSD M.2":
                ket = "Best";
                break;
            case "SSD SATA":
                ket = "Good";
                break;
            default:
                ket = "Middle";
                break;
        }
    }
}
