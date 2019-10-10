/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan27;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program hurup besar kecil
 */
public class Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        String kalimat = input.nextLine();
        System.out.println("------Hasil format------ ");
        System.out.println("Hurup Besar : " + kalimat.toUpperCase() );
        System.out.println("Hurup Kecil : " + kalimat.toLowerCase() );
    }
    
}
