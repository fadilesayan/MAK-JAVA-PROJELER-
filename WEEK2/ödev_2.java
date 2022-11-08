/*
Adım 1:Başla
Adım 2:Kürenin yarıçapını gir;r
Adım 3:kürenin alanını hesapla;4πr^2
Adım 4:Kürenin hacmini hesapla;4/3πr^3
Adım 5:Dur
 */



import java.util.Scanner;
        


public class ödev_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Lütfen bir yarıçap gir");
     double r = input.nextDouble();
        System.out.println("lütfen π değerini gir");
        double π = input.nextDouble();
      double çarpım = 4 * π * r *r ;
      double hacim = (4 * π * r * r * r )/3;
        
 
               
   
   
       
       
       System.out.println("Alan:" + çarpım + "Kürenin Hacim:" + hacim  );
      
               
    }
    
}