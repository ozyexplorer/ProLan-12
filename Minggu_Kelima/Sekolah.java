class Sekolah extends Guru
{

	public void tampilguru()
	{
		System.out.println("Nama Guru 	: "+nama);
		System.out.println("NIP		: "+nip);
		System.out.println("Umur 		: "+umur);
		System.out.println("Guru Kelas 	: "+gurukelas);

	}
	public void tampilmurid()
	{
		System.out.println("Nama Siswa 	: "+nama);
		System.out.println("NIS		: "+nip);
		System.out.println("Umur 		: "+umur);
		System.out.println("Kelas 		: "+gurukelas);

	}


	public static void main(String args[])
	{
		Sekolah sd = new Sekolah();

		
		System.out.println();
		sd.inputGuru();
		System.out.println();
		System.out.println("==========================");
		System.out.println("	DATA GURU  	  ");
		System.out.println("==========================");
		sd.tampilguru();
		System.out.println();
		sd.inputmurid();
		System.out.println();
		System.out.println("==========================");
		System.out.println("	DATA SISWA  	  ");
		System.out.println("==========================");
		sd.tampilmurid();

	}
}