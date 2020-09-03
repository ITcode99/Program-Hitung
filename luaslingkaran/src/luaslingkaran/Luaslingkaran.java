/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaslingkaran;

/**
 *
 * @author Adi Arput
 */
public class Luaslingkaran {
    public static void main(String[] args) {
        double diameter,jari_jari,phi,luas;
        diameter = 14;
        jari_jari = diameter/2;
        phi = 3.14;
        
        luas = phi *(jari_jari*jari_jari);
        
        System.out.println("Program ITCODE");
        System.out.println("mencari Luas Lingkaran");
        System.out.println("diameter = "+diameter);
        System.out.println("jari_jari = "+jari_jari);
        System.out.println("phi = "+phi);
        System.out.println("luaslingkaran = "+luas);
    }
    
}
