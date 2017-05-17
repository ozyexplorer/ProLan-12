/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

import java.util.Scanner;

public class DataMurid {
    
    Scanner inputMurid = new Scanner(System.in);
    EnkapsulasiMurid murid = new EnkapsulasiMurid();
    public void InputMurid()
    {
        System.out.println("==============INPUT MURID==============");
        System.out.print("Nama            : ");
        String nama = inputMurid.nextLine();
        murid.setNamaMurid(nama);
        
        System.out.print("NIS             : ");
        String nis = inputMurid.nextLine();
        murid.setNisMurid(nis);
        
        System.out.print("Kelas           : ");
        int kelas = inputMurid.nextInt();
        murid.setKelasMurid(kelas);
        
        System.out.print("Umur            : ");
        int umur = inputMurid.nextInt();
        murid.setUmurMurid(umur);
        
        System.out.print("Alamat          : ");
        String alamat = inputMurid.nextLine();
        murid.setAlamatMurid(alamat);
        System.out.println("");
        System.out.println("=======================================");
    }
    
    public void OutputMurid()
    {
        System.out.println("=============OUTPUT MURID==============");
        System.out.println("Nama anda       : "+murid.getNamaMurid());
        System.out.println("NIS anda        : "+murid.getNisMurid());
        System.out.println("Kelas anda      : "+murid.getKelasMurid());
        System.out.println("Umur anda       : "+murid.getUmurMurid());
        System.out.println("Alamat anda     : "+murid.getAlamatMurid());
    }
}
