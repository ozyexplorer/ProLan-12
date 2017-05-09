
package belajarjava;


public class BarrurRhozi extends Mahasiswa {

    @Override
    protected void kuliah() {
        System.out.println("Target kuliah 4 tahun lulus");
    }

    @Override
    protected void lulus() {
        System.out.println("Pengen lulus ya harus belajar yang rajin");
    }

    @Override
    protected void tidakLulus() {
        System.out.println("Tidak lulus lah kalo tidak belajar sama sekali");}

    @Override
    protected void dataDiri() {
        System.out.println("Nama saya : "+ nama);
        System.out.println("Nim saya  : "+ nim);
    }
    
}
