import java.util.Scanner;

public class KepalaSekolah extends Sekolah {
    Scanner input = new Scanner(System.in);

                 
        
        public void bannerKepsek()
        {
            System.out.println("=============================================");
            System.out.println("                INPUT KEPSEK                 ");
            System.out.println("=============================================");
        }
        public void InputKepsek() {
            
        }
        //construct
        public KepalaSekolah()
        {   
            this.bannerKepsek();
            System.out.print("Masukkan Nama                : ");
            NamaKepsek = input.nextLine();
            System.out.print("Masukkan NIP                 : ");
            nip = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin (P/L) : ");
            JenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan Umur                : ");
            umur = input.nextInt();
            System.out.print("Masukkan Alamat              : ");
            Alamat = input.nextLine();
            Alamat = input.nextLine();
            this.bannerKepsek1();
            super.TampilKepsek();
        }
        
        public void bannerKepsek1()
        {
            System.out.println("=============================================");
            System.out.println("               OUTPUT KEPSEK                 ");
            System.out.println("=============================================");
        }
    
}
