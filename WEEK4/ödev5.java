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
public class ödev5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Lütfen metre cinsinden bir değer giriniz ");
        double m=input.nextDouble();
        System.out.println("Lütfen bir secenek giriniz,n1=mm n2=cm n3=dm n4=km");
        double n =input.nextDouble();
        double b =1;
        if (n==1) {
            b=1000*m;
            System.out.println("mm:"+b);
            
        }
        else if (n==2) {
            b=100*m;
           
            System.out.println("cm:"+b);
        }
        else if (n==3) {
            b=10*m;
            System.out.println("dm:"+b);
            
        }
        else {
            b=(m)/1000;
            System.out.println("km:"+b);
            
            
        }
  
        
           
        }

    }
    

