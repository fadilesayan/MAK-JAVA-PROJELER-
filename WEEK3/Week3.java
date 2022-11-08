/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;


 
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System .out.println("Lütfen bir sayı gir");
        int sayi  = input.nextInt();
        if (sayi%2==0) {
            System.out.println("Çift");
            
            
        }
        
        
        else {
        System.out.println("Tek");
             }
        
                
   
        
        
        
    }
    
}
