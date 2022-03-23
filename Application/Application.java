/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import Data.Asus;
import Data.Acer;
/**
 *
 * @author A S U S
 */
public class Application {
    public static void main(String[] args) {
        Asus lp = new Asus("Asus X441B","Asus","AMD A9","4","Windows 10","4GB","SSD M.2","50");
        System.out.println(lp.tampil());
        
        System.out.println("");
        
        Acer lt = new Acer("Acer Aspire 3","Acer","Intel","4","Windows 11","4GB","HDD","20");
        System.out.println(lt.tampil());
    }
}
