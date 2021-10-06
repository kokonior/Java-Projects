import java.util.Scanner;
public class kalkulatorCLI {
    
    public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int bil1, bil2, pil ,hasil = 0;
         System.out.println("PROGRAM JAVA KALKULATOR SEDERHANA");
         System.out.println("1. Perkalian");
         System.out.println("2. Pembagian");
         System.out.println("3. Penjumlahan");
         System.out.println("4. Pengurangan");
         System.out.println("----------------------------");
         System.out.print("Bilangan 1 : ");
         bil1=input.nextInt();
         System.out.print("Bilangan 2 : ");
         bil2=input.nextInt();
         System.out.print("Pilihan Operasi: ");
         pil=input.nextInt();
         
         switch (pil){
             case 1 : hasil=bil1*bil2;break;
             case 2 : hasil=bil1/bil2;break;
             case 3 : hasil=bil1+bil2;break;
             case 4 : hasil=bil1-bil2;break;
             default : System.out.println("Salah memasukan pilihan");
         }
         
          System.out.println("Hasil :"+hasil);
    }
}

//Translated In English with Some Modification


import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
          
         System.out.println("Enter First Number: ");

         double a = sc.nextDouble();

         System.out.println("Enter Second Number: ");
         double b = sc.nextDouble();
         
         System.out.print("choose one: \n 1. For Addition\n 2. For Substraction\n 3. For Multiplication\n 4. For Division\n 5. For Modulation \n : ");
         int n = sc.nextInt();
         
        
        // ***1ST METHOD ***
        
        //  if (n==1) {
        //      System.out.println("Addition: "+a+b);
             
        //  }else if(n==2) {
        //      System.out.println("Substraction: "+ (a-b));
             
        //  }else if(n==3){
        //      System.out.println("Multiplication: "+a*b);
   
        //  }else if(n==4){
        //      System.out.println("Division: "+a/b);

        //  }else if(n==5){
        //      System.out.println("Modulation: "+a%b);

        //  } else
        //      System.out.println("   Plz Choose Right Option");
        
        
        
        // ***2ND METHOD****

        switch (n) {
            case 1:  
                   System.out.println("Addition: "+(a+b));
                
             break;
            case 2: 
                   System.out.println("Substraction: "+(a-b)); 
             break;
            
            case 3: 
                   System.out.println("Multiplication: "+(a*b)); 
             break;
             
            case 4: 
                   System.out.println("Division: "+(a/b));
             break;       
        
            default:
                   System.out.println("Plz Choose Right Option");
                break;
        }

            
            
        }
         


    }

    

