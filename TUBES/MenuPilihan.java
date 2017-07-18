import java.util.Scanner;

public class MenuPilihan {
    int pilihan;
    Scanner masuk = new Scanner(System.in);

    public void menuPilihan()        
    {
        
        System.out.println("------------------------------------");
        System.out.println("            MENU PILIHAN            ");
        System.out.println("------------------------------------");
        System.out.println("                                    ");
        System.out.println("    1. Input Data Guru              ");
        System.out.println("    2. Input Data Murid             ");
        System.out.println("    3. Tampil Guru                  ");
        System.out.println("    4. Tampil Murid                 ");        
        System.out.println("    0. Keluar                       ");
        System.out.println("                                    ");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        
        System.out.print(" Masukkan pilihan anda : ");
        System.out.flush();
        pilihan = masuk.nextInt();
        switch(pilihan)
        {
            case 1 : inputGuru();
                     menuPilihan();
            break;
            case 2 : inputMurid();
                     menuPilihan();
            break;
            case 3 : tampilGuru();
            break;
            case 4 : tampilMurid();
            break;
            case 0 : keluar();
            break;
            default: System.out.println("Pilihan yang kamu pilih salah ");
            
        }
        
        
    }
    
    DataGuru guru = new DataGuru();
    
    public void inputGuru()
    {
        guru.inputGuru();
    }
    
    public void tampilGuru()
    {
        guru.outputGuru();
    }
    
    DataMurid input = new DataMurid();
    
    public void inputMurid()
    {
        input.inputMurid();
    }
    
    public void tampilMurid()
    {
        input.outputMurid();
    }
   
    public void keluar()
    {
        
    }
}
