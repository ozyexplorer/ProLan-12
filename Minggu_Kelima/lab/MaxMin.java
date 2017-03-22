public class MaxMin {
    public int max, min;
    
    public int pilihanB(int[] nilai)
    {
        this.max = 0;    
        for(int i=0; i < nilai.length; i++ )
            {
		if (nilai[i] > this.max) 
                {
                    this.max = nilai[i];
                } 
            }
        return this.max;
    }
    
    public int pilihanA(int[] nilai)
    {
        this.min = 1000;    
        for(int i=0; i < nilai.length; i++ )
            {
		if (nilai[i] < this.min) 
                {
                    this.min = nilai[i];
                } 
            }
        return this.min;
    }
    
    
    
}
