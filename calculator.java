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
