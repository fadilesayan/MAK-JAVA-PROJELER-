/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author computer
 */
import java.util.Scanner;
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Lütfen pozitif bir tam sayı giriniz:");
            sayi=input.nextInt();
            
        } while (sayi<0);
        System.out.println("Girilen sayi:"); 
    }
  
   
}

