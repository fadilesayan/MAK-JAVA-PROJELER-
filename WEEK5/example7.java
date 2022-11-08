/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class example7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz");
        int satır=input.nextInt();
        System.out.println("Lütfen sütün saysıs girniz");
        int sutun=input.nextInt();
        
        for (int i = 0; i < satır; i++)  
        {
            
            for (int j = 0; j < sutun; j++) 
            {
             System.out.print(" *  ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
    }
    
}
