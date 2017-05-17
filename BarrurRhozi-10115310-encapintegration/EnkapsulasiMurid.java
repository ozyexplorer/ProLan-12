/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author USER
 */
public class EnkapsulasiMurid extends EnkapsulasiGuru {
    private int kelas;
    private String nis;
    
    public String getNamaMurid()
    {
        return nama;
    }
    
    public void setNamaMurid(String nama)
    {
        this.nama = nama;
    }
    
    public String getNisMurid()
    {
        return nis;
    }
    
    public void setNisMurid(String nis)
    {
        this.nis = nis;
    }
    
    public int getKelasMurid()
    {
        return kelas;
    }
    
    public void setKelasMurid(int kelas)
    {
        this.kelas = kelas;
    }
    
    public int getUmurMurid()
    {
        return umur;
    }
    
    public void setUmurMurid(int umur)
    {
        this.umur = umur;
    }
    
    public String getAlamatMurid()
    {
        return alamat;
    }
    
    public void setAlamatMurid(String alamat)
    {
        this.alamat = alamat;
    }
    
}
