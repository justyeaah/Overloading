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
public class MatematikaCanggih extends Matematika {
    
    private double hasil;
    
    void Pertambahan(double a, double b, double c){
        hasil = a + b + c;
    }
    
    void Pertambahan(int a, int b){
        hasil = a + b;
    }
    
    void Pertambahan(int a, int b, int c){
        hasil = a + b + c;
    }
    
    void Pertambahan(double a, double b){
        hasil = a + b;
    }
//========================================================================================= 
    void Pengurangan(double a, double b, double c){
        hasil = a - b - c;
    }
    
    void Pengurangan(int a, int b){
        hasil = a - b;
    }
    
    void Pengurangan(int a, int b, int c){
        hasil = a - b - c;
    }
    
    void Pengurangan(double a, double b){
        hasil = a - b;
    }
//==========================================================================================
    void Perkalian(double a, double b, double c){
        hasil = a * b * c;
    }
    
    void Perkalian(int a, int b){
        hasil = a * b;
    }
    
    void Perkalian(int a, int b, int c){
        hasil = a * b * c;
    }
    
    void Perkalian(double a, double b){
        hasil = a * b;
    }
//============================================================================================    
    void Pembagian(double a, double b, double c){
        hasil = a / b / c;
    }
    
    void Pembagian(int a, int b){
        hasil = a / b;
    }
    
    void Pembagian(int a, int b, int c){
        hasil = a / b / c;
    }
    
    void Pembagian(double a, double b){
        hasil = a / b;
    }
//===========================================================================================        
    void Modulus(double a, double b, double c){
        hasil = a % b % c;
    }
    
    void Modulus(int a, int b){
        hasil = a % b;
    }
    
    void Modulus(int a, int b, int c){
        hasil = a % b % c;
    }
    
    void Modulus(double a, double b){
        hasil = a % b;
    }
    
//===========================================================================================
    double getHasil(){
        return hasil;
    }
}
