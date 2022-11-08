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
public class example5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Lütfen bir pozitif sayısı giriniz");
    int N=input.nextInt();
    int toplam=0;
   
        
    
     while (N>0) {
     int kalan=N%10;
             
    toplam+=+kalan;
             N=N/10;
        }
        System.out.println("Basamaklar toplamı:"+toplam);
     
     
     
    }
    
    
}
