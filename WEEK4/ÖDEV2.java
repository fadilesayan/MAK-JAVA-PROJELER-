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

public class ÖDEV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz");
        int N = input.nextInt();
        int S = 1;
        while (S<=N) {
            if (N%S==0) {
                System.out.println("N'yi tam bölen sayılar:"+S);
                
            }
            S=S+1;
        }
          
            
    }
    
}
