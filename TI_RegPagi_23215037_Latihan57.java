/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan57.vehicle;

/**
 *
 * @author 
 * Nama : Arrijal Tanzil Maulana 
 * NIM : 23215037
 * Kelas : TI
 * Deskripsi Program : Program ini berisi tentang vehicle berupa bicycle dan
 *                     skateboard.
 */
public class TI_RegPagi_23215037_Latihan57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Bicycle bcl = new Bicycle();
        bcl.setBrand("Trek Bike");
        bcl.setModel("7.4FX");
        bcl.setGearCount(23);
        System.out.println("Brand : "+bcl.getBrand());
        System.out.println("Model : "+bcl.getModel());
        System.out.println("Jumlah Gear : "+bcl.getGearCount());
        System.out.println("");
        
        Skateboard sktb = new Skateboard();
        sktb.setBrand("Ally sktb");
        sktb.setModel("Rocket");
        sktb.setBoardLeght(54.5);
        System.out.println("Brand : "+sktb.getBrand());
        System.out.println("Model : "+sktb.getModel());
        System.out.println("Panjangnya Board : "+sktb.getBoardLeght());
    }
    
}
