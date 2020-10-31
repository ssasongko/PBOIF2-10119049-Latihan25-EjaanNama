/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan25.ejaannama;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk mengeja nama
 */
public class PBOIF210119049Latihan25EjaanNama {
    public static Scanner scan = new Scanner(System.in);
    public static String nama;
    
    public static void setNama(){
        System.out.print("Masukkan nama depan untuk di eja : ");
        nama = scan.next();
    }      
    
    public static void getTampilHasil(){
        char[] ch = nama.toCharArray();
        
        System.out.printf("Ejaan untuk \"%s\" adalah : %n",nama);
        for(int i = 0; i < nama.length(); i++){
            System.out.printf("Huruf ke-%d : %c %n",i+1, ch[i]);
        }
    }    
    
    public static void main(String[] args) {
        setNama();
        getTampilHasil();
    }
    
}
