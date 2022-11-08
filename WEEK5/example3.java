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
public class example3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input=new Scanner(System.in);
        int finall;
        int vize  ;
        
        
        do {
            System.out.println("Lütfen vize notunu giriniz");
          
            vize =input.nextInt();
            System.out.println("Lütfen final notunuzu giriniz");
            finall=input.nextInt();
            
        } while (vize<0||vize>100||finall<0||finall>100 );
      
           double ort= (double)vize*4/10+finall*6/10;
                    
        
       if (80<=ort &&ort <=100) 
       {
                System.out.println("Ortalamanız:"+ort+"ve harf notunuz A");
       }
       else if (60<=ort&& ort<=79) 
       {
           System.out.println(" Ortalamanız:"+ort+"ve harf notunuz B");
            
        }
       else if (50<=ort&&ort<=59)  
       {
            System.out.println("  Ortalamanız:"+ort+"ve harf notunuz C");
        }
        else 
       {
           System.out.println("  Ortalamanız:"+ort+"ve harf notunuz D"); 
            
        }

 
}
      
    }
    
