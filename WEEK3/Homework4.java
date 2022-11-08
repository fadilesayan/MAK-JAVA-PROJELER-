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
public class Homework4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen bir sayı giriniz");
      int sayi= input.nextInt();
        if (sayi==1) {
            System.out.println("Bugün günlerden pazartesi");
           
        }
        else if (sayi==2){
            System.out.println("Bugün günlerden salı");
            
        }
        else if (sayi==3) {
            System.out.println("Bugün günlerden çarşamba");
        }
        else   if (sayi==4) {
            System.out.println("Bugün günlerden perşembe");
            
        }
        else if (sayi==5) {
            System.out.println("Bugün günlerden cuma");            
        }
        else if (sayi==6) {
            System.out.println("Bugün günlerden cumartesi");       
        }
        else if (sayi==7) {
            System.out.println("Bugün günlerden pazar");
            
        }
        if (sayi>7) {
            System.out.println("Böyle bir gün yoktur");
            
        }
            
                    
            
        }
        
    }
    
 
