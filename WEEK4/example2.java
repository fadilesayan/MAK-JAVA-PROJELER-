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
        System.out.println("Bir n saysıs giriniz");
        int N=input.nextInt();
        int S=1;
        int faktöriyel=1;
        while (S<=N) {
            faktöriyel=faktöriyel*S;
            S=S+1;
        }
        
        
        
        System.out.println("faktöriyel:"+faktöriyel);
        
        
        
        
        
        
    }
    
}
