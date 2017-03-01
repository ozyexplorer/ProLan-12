/*Nama : Barrur Rhozi
Kelas : PROLAN 12
NIM : 10115310
*/

//Program InputOutput

import java.util.Scanner;

public class InputOutput4 {

    public static void main(String[] args) {
        String nama;
        char jenisKelamin;
        int tinggiBadan;
        boolean menikah;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda :");
        nama = input.nextLine();
        
        System.out.print("Masukkan Jenis Kelamin :");
        jenisKelamin = input.next().charAt(0);
        
        System.out.print("Masukkan Tinggi Badan :");
        tinggiBadan = input.nextInt();
        
        System.out.print("Masukkan Status Menikah :");
        menikah = input.nextBoolean();
        
        System.out.println("\n\n");
        
        System.out.println("Nama Anda       : "+nama);
        System.out.println("Jenis Kelamin   : "+jenisKelamin);
        System.out.println("Tinggi Badan    : "+tinggiBadan);
        System.out.println("Status Menikah  : "+menikah);

    }
    
}
