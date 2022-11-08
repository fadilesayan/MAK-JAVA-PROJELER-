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
public class ödev3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 7 den büyük bir sayı giriniz");
        int S=input.nextInt();
        for (int i = 0; i <=S/3; i++) 
        {
            for (int j = 0; j <=S/5; j++) 
            {
                if (3*i+5*j==S) 
                {
                System.out.println(i+j);
                    
                }
                
            }
            
            
        }
        
    }
    
}
