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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir b sayısı giriniz");
        int sayi=input.nextInt();
            
        
        for (int a = 1; a < 100; a++) 
        {
            
            if (a*a*a-a*a==sayi) 
            {
                 System.out.println(a);
                
            }
        }
        
     
    }
    
    
}
