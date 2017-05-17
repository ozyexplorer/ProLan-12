/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

import java.util.Scanner;

public class EnkapsulasiUtama {

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

