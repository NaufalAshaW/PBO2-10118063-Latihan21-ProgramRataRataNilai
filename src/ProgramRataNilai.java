/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class ProgramRataNilai {

    /**
     * @param args
     */
      public static void main(String[] args){
          
          Scanner scanner = new Scanner(System.in);
          
          System.out.print("Masukkan Banyaknya Mahasiswa : ");
          Integer jmlMhs = scanner.nextInt();
          Double nilai = 0.0;
          
          for(Integer i = 1; i <= jmlMhs; i++){
            System.out.print("Nilai Mahasiswa ke- "+ i + " :");
            nilai += scanner.nextDouble();
      }
          System.out.println();
          System.out.println("Maka, rata-rata Nilainya adalah " + (nilai/jmlMhs));
          
      
    }
}
