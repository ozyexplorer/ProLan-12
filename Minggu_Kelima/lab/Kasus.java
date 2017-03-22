import java.util.Scanner;

public class Kasus {

   
    public static void main(String[] args) {
        MaxMin MinMax = new MaxMin();
               Scanner input = new Scanner(System.in);
//               BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
              
               int N,i, hitung = 1;
               char pil;
               System.out.print("Masukkan Jumlah Nilai : " );
               N = input.nextInt();
               int[] nilai = new int[N];
               
               for (i=0 ; i < N; i++) {
                   System.out.print("Angka Ke - "+hitung+" : ");
                   nilai[i] = input.nextInt();
                   hitung++;
               }
               
               System.out.print("Pilih A/B ? : ");
               pil = input.next().charAt(0);
               
               System.out.println("====================");
               System.out.println("     KETERANGAN     ");
               System.out.println("====================");

               System.out.println("N :"+N);
               System.out.println("Pil : "+pil);
               if(pil == 'A')
               {
                   System.out.println("Nilai Minimum : "+MinMax.pilihanA(nilai));
                   
               } 
               
               if(pil == 'B')
               {
                   System.out.println("Nilai Maximum : "+MinMax.pilihanB(nilai));
               } 
               
               System.out.println();
               
             
    }
    
}
