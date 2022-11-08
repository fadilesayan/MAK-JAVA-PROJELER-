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
public class ödev6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayısı giriniz");
        int S= input.nextInt();
        while (S>0) {
            System.out.println(S%10);
            S/=10;
        }
        
        System.out.println("girdiğiniz sayının tersi:");
    }
    
}
