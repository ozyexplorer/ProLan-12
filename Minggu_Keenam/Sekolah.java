class Sekolah {
    String NamaKepsek, NamaGuru, NamaMurid, Alamat;
    int nip, nim, umur;
    char JenisKelamin;
    
    
    public void TampilKepsek()
    {
        System.out.println("Nama KepSek         : "+NamaKepsek);
        System.out.println("NIP                 : "+nip);
        System.out.println("Jenis Kelamin (P/L) : "+JenisKelamin);
        System.out.println("Usia                : "+umur);
        System.out.println("Alamat              : "+Alamat);
    }
    
    public void TampilMurid()
    {
        System.out.println("Nama Murid          : "+NamaMurid);
        System.out.println("NIM                 : "+nim);
        System.out.println("Jenis Kelamin (P/L) : "+JenisKelamin);
        System.out.println("Usia                : "+umur);
        System.out.println("Alamat              : "+Alamat);
    }
    
    public void TampilGuru()
    {
        System.out.println("Nama Guru           : "+NamaGuru);
        System.out.println("NIP                 : "+nip);
        System.out.println("Jenis Kelamin (P/L) : "+JenisKelamin);
        System.out.println("Usia                : "+umur);
        System.out.println("Alamat              : "+Alamat);
    }
    
}
