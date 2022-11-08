/*
Adım 1:Üçgene ait bir kenar uzunluğu gir;a
Adım 2:Kenara ait yükseklik gir;h
Adım 3:Üçgenin alanını hesapla;a*h/2
Adım 4:Dur
 */



import java.util.Scanner;




public class ödev_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Lütfen bir kenar uzunluğu gir");
        int a = input.nextInt();
        System.out.println("Lütfen kenara ait yükseklik gir");
        int h = input.nextInt();
        int alan  = a * h /2;
        System.out.println("Çarpım:" + alan );
                
       }
    
}
