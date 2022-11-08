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

public class homework6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Lütfen bir sayısı giriniz");
       int n =input.nextInt();
       int TOPLAM=0;
       int S=1;
        while (S<=n) {
            TOPLAM=TOPLAM +S;
            S=S+2;
       
        }
               System.out.println("Toplam"+TOPLAM);

       

       
    }
    
}
