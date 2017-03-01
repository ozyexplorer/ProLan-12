/*Nama : Barrur Rhozi
Kelas : PROLAN 12
NIM : 10115310
*/

//Program InputOutput

import java.util.Scanner;

public class InputOutput3{

    public static void main(String[] args) {
       String Nama, NIM, Alamat;
       
       Scanner identitas = new Scanner(System.in);
       
		System.out.print("Masukkan Nama anda 	:");
		Nama = identitas.nextLine();
		
		System.out.print("Masukkan NIM anda 	:");
		NIM = identitas.nextLine();
		
		System.out.print("Masukkan Alamat anda	:");
		Alamat = identitas.nextLine();
		
		System.out.println("\n");
		System.out.println("Nama Anda 	: " + Nama);
		System.out.println("NIM Anda 	: " + NIM);
		System.out.println("Alamat Anda	: " + Alamat);
	}
    
}