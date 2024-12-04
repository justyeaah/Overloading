/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author user
 */
public class MatematikaCanggihBerkasi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();

        math.Pertambahan(12.5, 28.7, 14.2);
        System.out.println("Hasil pertambahan double 3 parameter : " + math.getHasil());
        
        math.Pertambahan(23, 34);
        System.out.println("Hasil pertambahan Int 2 parameter : " + math.getHasil());
        
        math.Pertambahan(12, 28, 14);
        System.out.println("Hasil pertambahan Int 3 parameter : " + math.getHasil());
        
        math.Pertambahan(3.4, 4.9);
        System.out.println("Hasil pertambahan double 2 parameter : " + math.getHasil());
        
        System.out.println("===============================================================");
//===================================================================================================        
        math.Pengurangan(12.5, 28.7, 14.2);
        System.out.println("Hasil pengurangan double 3 parameter : " + math.getHasil());
        
        math.Pengurangan(23, 34);
        System.out.println("Hasil pengurangan Int 2 parameter : " + math.getHasil());
        
        math.Pengurangan(12, 28, 14);
        System.out.println("Hasil pengurangan Int 3 parameter : " + math.getHasil());
        
        math.Pengurangan(3.4, 4.9);
        System.out.println("Hasil pengurangan double 2 parameter : " + math.getHasil());
        
        System.out.println("==============================================================");
//===================================================================================================        
        math.Perkalian(12.5, 28.7, 14.2);
        System.out.println("Hasil perkalian double 3 parameter : " + math.getHasil());
        
        math.Perkalian(23, 34);
        System.out.println("Hasil perkalian Int 2 parameter : " + math.getHasil());
        
        math.Perkalian(12, 28, 14);
        System.out.println("Hasil perkalian Int 3 parameter : " + math.getHasil());
        
        math.Perkalian(3.4, 4.9);
        System.out.println("Hasil perkalian double 2 parameter : " + math.getHasil());
        
        System.out.println("=============================================================");
//===================================================================================================        
        math.Pembagian(12.5, 28.7, 14.2);
        System.out.println("Hasil pembagian double 3 parameter : " + math.getHasil());
        
        math.Pembagian(23, 34);
        System.out.println("Hasil pembagian Int 2 parameter : " + math.getHasil());
        
        math.Pembagian(12, 28, 14);
        System.out.println("Hasil pembagian Int 3 parameter : " + math.getHasil());
        
        math.Pembagian(3.4, 4.9);
        System.out.println("Hasil pembagian double 2 parameter : " + math.getHasil());
        
        System.out.println("=============================================================");        
//===================================================================================================        
        math.Modulus(12.5, 28.7, 14.2);
        System.out.println("Hasil modulus double 3 parameter : " + math.getHasil());
        
        math.Modulus(23, 34);
        System.out.println("Hasil modulus Int 2 parameter : " + math.getHasil());
        
        math.Modulus(12, 28, 14);
        System.out.println("Hasil modulus Int 3 parameter : " + math.getHasil());
        
        math.Modulus(3.4, 4.9);
        System.out.println("Hasil modulus double 2 parameter : " + math.getHasil());
        
        System.out.println("=============================================================");        
    }
    
}
