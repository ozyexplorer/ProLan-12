
package genericclass;


public class Guru <T>{
    private T NIP;
    
    public Guru(T NIP)
    {
      this.NIP = NIP;  
    }
 
    public void setNIP(T NIP)
    {
        this.NIP = NIP;
    }
    
    public T getNIP()
    {
        return NIP;
    }
    
    public void getType()
    {
        System.out.println("Tipe awalnya : "+ NIP.getClass().getName());
    }
    
    
    
}
