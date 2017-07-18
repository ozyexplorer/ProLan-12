import java.util.Scanner;

public class DataGuru {
    
    Scanner inputGuru = new Scanner(System.in);
    InputGuru guru = new InputGuru();
    public void inputGuru()
    {
        System.out.println("==============INPUT GURU==============");
        System.out.print("Nama            : ");
        String nama = inputGuru.nextLine();
        guru.setNamaGuru(nama);
        
        System.out.print("NIP             : ");
        String nipGuru = inputGuru.nextLine();
        guru.setNipGuru(nipGuru);
        
        System.out.print("Guru Kelas      : ");
        int guruKelas = inputGuru.nextInt();
        guru.setKelasGuru(guruKelas);
        
        System.out.print("Umur            : ");
        int umur = inputGuru.nextInt();
        guru.setUmurGuru(umur);
        
        System.out.print("Alamat          : ");
        String alamat = inputGuru.nextLine();
        guru.setAlamatGuru(alamat);
        
        System.out.println("");
        System.out.println("=======================================");
    }
    
    public void outputGuru()
    {
        System.out.println("=============OUTPUT GURU==============");
        System.out.println("Nama        : "+guru.getNamaGuru());
        System.out.println("NIP         : "+guru.getNipGuru());
        System.out.println("Guru Kelas  : "+guru.getKelasGuru());
        System.out.println("Umur        : "+guru.getUmurGuru());
        System.out.println("Alamat      : "+guru.getAlamatGuru());
    }
}
