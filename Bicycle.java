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
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
}
