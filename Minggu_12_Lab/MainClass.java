package dataSekolah;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        
        Scanner inputMurid = new Scanner(System.in);
        
        DataGuru guruData = new DataGuru();
        DataMurid muridData = new DataMurid();
        
        muridData.InputMurid();
        System.out.println("");
        System.out.println("");
        guruData.DataGuru();
        muridData.OutputMurid();
        
    
    }

    
}

