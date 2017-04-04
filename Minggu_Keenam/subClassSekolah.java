public class subClassSekolah extends superClassDataSekolah {
    
    @Override
    public void welcome()
    {
        super.welcome();
        System.out.println("SDN PANGKALAN 5");
    }
    
    @Override
    public void alamatSekolah()
    {
        super.alamatSekolah();
        System.out.println("Jl. Raya Sobang Desa Pangkalan Kec.Sobang");
    }
    
    @Override
    public void Kontak()
    {
        super.Kontak();
        System.out.println("087772254404");
    }
}
