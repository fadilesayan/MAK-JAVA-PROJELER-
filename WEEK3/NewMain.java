/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kullanıcıdan A al");
        int A = input.nextInt();
        System.out.println("Lütfen kullanıcıdan B al");
        int B = input.nextInt();
        System.out.println("Lütfen kullanıcıdan C al");
        int C = input.nextInt();
        if (A>B&& A>C) {
            System.out.println(A+"en büyüktür");
        }
        else if (B>A && B>C)
                { 
             System.out.println(B+"en büyüktür");
                }

         else if (C>A && C>B ) {
             System.out.println("en büyük"+C);
         }

             else {
             System.out.println("Büyüklük yoktur"); 
                }
        }
                    
}
        
        
        
        
    
    
