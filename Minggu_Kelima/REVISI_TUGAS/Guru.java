import java.util.Scanner;

public class Guru extends Sekolah{
    Scanner input2 = new Scanner(System.in);

    
    public void bannerGuru()
        {
            System.out.println("=============================================");
            System.out.println("                INPUT GURU                   ");
            System.out.println("=============================================");
        }
    
        public void InputGuru() 
        {
            
        }
        //construct
        public Guru()
        {
            this.bannerGuru();
            System.out.print("Masukkan Nama                : ");
            NamaGuru = input2.nextLine();
            System.out.print("Masukkan NIP                 : ");
            nip = input2.nextInt();
            System.out.print("Masukkan Jenis Kelamin (P/L) : ");
            JenisKelamin = input2.next().charAt(0);
            System.out.print("Masukkan Umur                : ");
            umur = input2.nextInt();
            System.out.print("Masukkan Alamat              : ");
            Alamat = input2.nextLine();
            Alamat = input2.nextLine();
            this.bannerGuru1();
            super.TampilGuru();
        }
        
        public void bannerGuru1()
        {
            System.out.println("=============================================");
            System.out.println("               OUTPUT GURU                   ");
            System.out.println("=============================================");
        }
}
