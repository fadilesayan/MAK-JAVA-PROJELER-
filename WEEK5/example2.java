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
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz   ");
            sayi=input.nextInt();
        } while (sayi<0||sayi>100);
        System.out.println("Girilen sayı:"+sayi);
        
        
    }
    
}
