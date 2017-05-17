/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author USER
 */
public class DataGuru {
    
    EnkapsulasiGuru dataGuru = new EnkapsulasiGuru();
    public void DataGuru()
    {
        System.out.println("============DATA GURU ANDA============");
        System.out.println("Nama Guru       : "+dataGuru.getNamaGuru());
        System.out.println("NIP             : "+dataGuru.getNipGuru());
        System.out.println("Guru Kelas      : "+dataGuru.getGuruKelas());
        System.out.println("Umur            : "+dataGuru.getUmurGuru());
        System.out.println("Alamat          : "+dataGuru.getAlamatGuru());
        System.out.println("");
        System.out.println("======================================");
        
    }
    
}
