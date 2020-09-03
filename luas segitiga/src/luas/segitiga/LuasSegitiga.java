/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.segitiga;

/**
 *
 * @author Adi Arput
 */
public class LuasSegitiga {
    public double alas;
    public double tinggi;
    public double luas(){
        return 0.5 * alas * tinggi;
    }
    public static void main(String[] args) {
        LuasSegitiga  s; 
        s = new LuasSegitiga ();
        s.alas=15;
        s.tinggi=21;
        System.out.println("Program ITCODE");
        System.out.println("Mencari Luas Segitiga");
        System.out.println("alas : "+s.alas);
        System.out.println("tinggi : "+s.tinggi);
        System.out.println("luas : "+s.luas());
    }
    
}
