import java.util.Scanner;

public class Murid extends Sekolah{
    Scanner input1 = new Scanner(System.in);

    public Murid() {
        this.bannerMurid();
        System.out.print("Masukkan Nama                : ");
        this.NamaMurid = input1.nextLine();
        System.out.print("Masukkan NIM                 : ");
        nim = input1.nextInt();
        System.out.print("Masukkan Jenis Kelamin (P/L) : ");
        JenisKelamin = input1.next().charAt(0);
        System.out.print("Masukkan Umur                : ");
        umur = input1.nextInt();
        System.out.print("Masukkan Alamat              : ");
        Alamat = input1.nextLine();
        Alamat = input1.nextLine();
        this.bannerMurid1();
        super.TampilMurid(); 
    }
    
    public void bannerMurid()
        {
            System.out.println("=============================================");
            System.out.println("                INPUT MURID                  ");
            System.out.println("=============================================");
        }
    
//       
        
        public void bannerMurid1()
        {
            System.out.println("=============================================");
            System.out.println("               OUTPUT MURID                  ");
            System.out.println("=============================================");
        }
}
