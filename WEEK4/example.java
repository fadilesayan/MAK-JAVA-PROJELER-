/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int N=input.nextInt();
        int çift=0;
        int tek=0;
        int S=1;
        while (S<=N ){
         if (S%2==0) {
           çift=çift+S;
         }
           else {
             
           tek=tek+S;
           
         }
         S=S+1;
                     
   
}
        System.out.println("çift toplam"+çift);
        System.out.println("tek toplam"+tek );
             
                
                
         }
           
            
                
            }
            
        
        
 
        
        
                
                
            
            

    
    
