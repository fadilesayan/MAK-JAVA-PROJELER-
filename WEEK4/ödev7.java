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
public class ödev7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int S=input.nextInt();
        int b=0;
        int k=1;
        while (S>0) {
            
            k=S%10;
            b=b*10+k;
            S=S/10;
            
        }
        System.out.println(b);
    }
    
}
