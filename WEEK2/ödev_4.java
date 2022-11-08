/*
Adım 1:Başla
Adım 2:Lütfen iletkenin direncini gir
Adım 3:Lütfen iletkenin akımını gir
Adım 4:İletkenin uçları arasındaki gerilimi hesapla
Adım 5:Dur

*/

import java.util.Scanner;
public class ödev_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Lütfen iletkenin direncini gir");
     double R = input.nextDouble();
     System.out.println("Lütfen iletkenin akımını gir");
     double i = input.nextDouble();
     double gerilim =  i * R;
             
             
             System.out.println( "Çarpım:" + gerilim);
            
    }
    
}
