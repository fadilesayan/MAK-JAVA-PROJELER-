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
public class ödev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int N =input.nextInt();
        int çift_toplam=0;
        int tek_toplam=0;
        int toplam=0;
        int S=1;
        
        while (S<=N) {
            if (S%2==0) {
             çift_toplam=çift_toplam+S;
                
            }
            else  {
                tek_toplam=tek_toplam+S;
                
                
            }
            toplam=toplam+S;
            S=S+1;
            
        
            
        
        
        
    }
        
            System.out.println("çift:"+çift_toplam);
            System.out.println("tek:"+tek_toplam);
            System.out.println("toplam:"+toplam);
    
}}
