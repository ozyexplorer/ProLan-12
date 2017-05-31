package dataSekolah;


public class DataGuru {
    
    InputGuru dataGuru = new InputGuru();
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
