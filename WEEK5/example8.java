
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author computer
 */

public class example8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen satır sayısı giriniz");
        int satır=input.nextInt();
        
        for (int i = 0; i <satır; i++) 
        {
            for (int j = 0; j<=i; j++) 
            {
                System.out.print("  * ");
                
            }
            System.out.println();
        }
  
        
        
        
        
    }
   
    
}

