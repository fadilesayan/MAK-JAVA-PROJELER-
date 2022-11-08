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

public class homework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     System.out.println("Lütfen bir sayı giriniz");
     int sayi = input.nextInt();
        if (sayi>0) {
            System.out.println("pozitiftir");
        }
        else if (sayi<0) {
            
            System.out.println("negatiftir");
            
        }
        else if (sayi==0) {
            System.out.println("sıfırdır");
            
        }
     
    }
    
}
