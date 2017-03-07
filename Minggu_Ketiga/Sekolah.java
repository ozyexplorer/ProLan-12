class Sekolah {
	public static void main (String[]args){
		Siswa DataSiswa = new Siswa();
		Guru DataGuru = new Guru();
	


	//Data siswa
	DataSiswa.Nama = "Ramdan";
	DataSiswa.Kelas = "VI";
	DataSiswa.NIK = "990405950";
	DataSiswa.Alamat = "Pandeglang";


	//Data Guru
	DataGuru.Nama = "SAKRI";
	DataGuru.NIP = "102034940";
	DataGuru.Pengajar = "VI";
	DataGuru.Alamat = "Pandeglang";

	System.out.println("\n\n");
	//Output Data Siswa
	DataSiswa.data_siswa();
	System.out.println("Nama Murid	= "+DataSiswa.Nama);
	System.out.println("Kelas 		= "+DataSiswa.Kelas);
	System.out.println("NIK		= "+DataSiswa.NIK);
	System.out.println("Alamat		= "+DataSiswa.Alamat);

	System.out.println("\n\n");

	//Output Data Guru
	DataGuru.pesan_atas();
	System.out.println("Nama Guru	= "+DataGuru.Nama);
	System.out.println("Guru Kelas	= "+DataGuru.Pengajar);
	System.out.println("NIP		= "+DataGuru.NIP);
	System.out.println("Alamat		= "+DataGuru.Alamat);

	}


}