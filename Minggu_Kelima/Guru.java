import java.util.Scanner;

class Guru extends Siswa
{

	Scanner input = new Scanner(System.in);
		String nama;
		int nip, gurukelas;
		byte umur;
		


		public void inputGuru()
		{
			System.out.print("Masukkan nama guru 	: ");
			nama = input.nextLine();
			System.out.print("Masukkan NIP 		: ");
			nip = input.nextInt();
			System.out.print("Masukkan Umur 		: ");
			umur = input.nextByte();
			System.out.print("Masukkan Guru Kelas 	: ");
			gurukelas = input.nextInt();
		}

		public void inputmurid()
		{
			System.out.print("Masukkan nama siswa	: ");
			nama = input1.nextLine();
			System.out.print("Masukkan nis 		: ");
			nis = input1.nextInt();
			System.out.print("Masukkan Umur 		: ");
			umur = input1.nextByte();
			System.out.print("Masukkan Kelas 	: ");
			kelas = input1.nextInt();
		}
}