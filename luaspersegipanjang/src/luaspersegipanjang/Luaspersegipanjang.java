/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaspersegipanjang;

/**
 *
 * @author Adi Arput
 */
public class Luaspersegipanjang {
    public double panjang;
    public double lebar;
    public double luas(){
        return panjang * lebar;
    }
    public static void main(String[] args){
        Luaspersegipanjang  p; 
        p = new Luaspersegipanjang ();
        p.panjang=20;
        p.lebar=10;
        System.out.println("Program ITCODE");
        System.out.println("Mencari Luas persegi panjang");
        System.out.println("alas : "+p.panjang);
        System.out.println("tinggi : "+p.lebar);
        System.out.println("luas : "+p.luas());
    }
    
}
