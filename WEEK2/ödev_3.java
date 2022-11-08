/*
Adım 1:Başla
Adım 2:Maddenin kütlesini gir
Adım 3:Maddenin hızını gir
Adım 4:Maddenin yerden yüksekliğini gir
Adım 5:Maddenin potansiyel enerjisini hesapla 
Adım 6:Maddenin kinetik enerjisini hesapla
Adım 7:Dur
 */

import java.io.PrintStream;
import java.util.Scanner;

 

 
public class ödev_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System .in);
        System.out.println("lütfen maddenin kütlesini gir");
        int m = input.nextInt();
        System.out.println("Lütfen maddenin hızını gir");
        int V =input.nextInt();
        System.out.println("Lütfen maddenin yerden yüksekliğini gir");
        int h =input.nextInt();
        int g = 10;
        int potansiyelenerji = m *g*h;
        int kinetikenerji = ( m * V * V )/2;
        
        System.out.println("Çarpım:" + potansiyelenerji + "Çarpım:" + kinetikenerji );                
                
                
                
                
                
        
        
        
    
    }
    
}
