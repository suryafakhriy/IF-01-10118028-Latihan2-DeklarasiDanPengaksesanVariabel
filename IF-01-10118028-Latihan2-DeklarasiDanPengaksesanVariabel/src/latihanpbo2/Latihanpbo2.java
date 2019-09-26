/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo2;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-1 2018
   NIM       : 10118028
   DESKRIPSI : Deklarasi dan pengaksesan variabel
 */
public class Latihanpbo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi Variabel
        int nilaiInt;
        final double PHI =3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan Hasil
        System.out.println("");
        System.out.println("Isi Variabel Nilai = " +nilaiInt);
        System.out.println("Isi Variabel PHI = " +PHI);
        System.out.println("Isi Variabel Logika = " +nilaiLogika);
        System.out.println("Isi Variabel Karakter = " +nilaiKarakter);
    }
    
}
