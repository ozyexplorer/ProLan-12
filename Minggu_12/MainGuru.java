
package genericclass;


public class MainGuru {
    public static void main(String[] args) {
       Guru<Integer> guru = new Guru<Integer>(12345678);
       
       int hasil1 = guru.getNIP();
       
        System.out.println("NIP dengan tipe data Integer : "+hasil1);
        
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");
        
        Guru<String> guru2 = new Guru<String>("12345678");
        String hasil2 = guru2.getNIP();
        System.out.println("NIP dengan tipe data string: " + hasil2);
        
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("");
        
        Guru namaGuru = new Guru<String>("Drs. Juni Hendri");
        String nama = (String) namaGuru.getNIP();
        System.out.println("Nama Guru   : " + nama);
        
        Guru alamatGuru = new Guru<String>("Jl. Raya Sobang-Bojen Desa Pangkalan");
        String alamat = (String) alamatGuru.getNIP();
        System.out.println("Alamat Guru   : " + alamat);
        
    }
}
