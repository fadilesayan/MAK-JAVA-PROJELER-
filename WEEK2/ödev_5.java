/*
Adım 1:Başla
Adım 2:Kişinin kütlesini gir
Adım 3:Kişinin boyunu gir
Adım 4:Kütle boy endeksini hesapla
Adım 5:Dur
 */


 import java.util.Scanner;
 
 
public class ödev_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen kişinin kütlesini gir");
        double m =  input.nextDouble();
        System.out.println("Lütfen kişinin boyunu gir");
        double h = input.nextDouble();
        double kütleboyendeksi = m/(h*h);
        
        
        
        System.out.println ("Kütleboyendeksi" +kütleboyendeksi );
       
        
        
        
      
} }



