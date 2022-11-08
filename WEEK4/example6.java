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
public class example6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n=input.nextInt();
        boolean asalmi=true;//varsayım
                
        for (int i = 2; i < n; i++) {
            if(n%i==0) {
                asalmi=false;
                
            }
            
        }
        if (asalmi==true &&n!=1) {
            System.out.println("Sayı asaldır");
        }
        else {
            System.out.println("Sayı asal değildir");
        }        }
        
        
        
        
        
        
    }
    

