/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan3.Input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program ini merupakan cara input value
 */
public class PBO10K10119905Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     System.out.print("Masukan nama anda: ");
     Scanner scanner = new Scanner(System.in);
     
     String nama = scanner.next();
     System.out.println("Nama anda adalah "+nama);
    }
    
}
