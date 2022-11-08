/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * 
 */
 import java.util.Scanner;
  
public class homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenar uzunluğunu gir");
        int A = input.nextInt();
        System.out.println("İkinci kenar uzunluğunu gir");
        int B = input.nextInt();
        System.out.println("üçüncü kenar uzunluğunu gir");
        int C = input.nextInt();
        
        if (A==B&&B==C) {
            System.out.println("Eşkenar üçgendir");
            
        }
        else if (A==B ||B==C|| C==A) {
            System.out.println("İkizkenar üçgendir");
            
        }
        else  {
            System.out.println("çesitkenar üçgendir");
            
        }
    
    }
    
}
