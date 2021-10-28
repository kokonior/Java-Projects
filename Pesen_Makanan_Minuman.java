package menu_makanan_minuman;
import java.util.Scanner;
public class Menu_Makanan_Minuman {
    public static void main(String[] args) {
        //Tugas Nested Loop
        char Makanan;
        int Minuman;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Menu Makananan : \n 1.Lalapan Nila\n 2.Lalapan Bebek\n 3.Lalapan Ayam\n 4.Lalapan lele\n Pilih Makanan = ");
        Makanan = input.next().charAt(0);
        
        System.out.println("======================");
        
        System.out.print("Menu Minuman : \n 1.Air Mineral\n 2.Es Teh\n 3.Es Jeruk\n 4.Jeruk Hangat\n Pilih Minuman = ");
        Minuman = input.nextInt();
        
        System.out.println("======================");
        
        switch (Makanan) {
            case '1' :
                if (Minuman == 1){
                    System.out.println("Makanan = Lalapan Nila" );
                    System.out.println("Minuman = Air Mineral");
                } else if (Minuman == 2) {
                    System.out.println("Makanan = Lalapan Nila");
                    System.out.println("Minuman = Es Teh");
                } else if (Minuman == 3) {
                    System.out.println("Makanan = Lalapan Nila");
                    System.out.println("Minuman = Es Jeruk");
                } else if (Minuman == 4) {
                    System.out.println("Makanan = Lalapan Nila");
                    System.out.println("Minuman = Jeruk Hangat");
                } else {
                    System.out.println("Keluar Aplikasi");
                }
                break;
            case '2' :
                if (Minuman == 1){
                    System.out.println("Makanan = Lalapan Bebek");
                    System.out.println("Minuman = Air Mineral");
                } else if (Minuman == 2) {
                    System.out.println("Makanan = Lalapan Bebek");
                    System.out.println("Minuman = Es Teh");
                } else if (Minuman == 3) {
                    System.out.println("Makanan = Lalapan Bebek");
                    System.out.println("Minuman = Es Jeruk");
                } else if (Minuman == 4) {
                    System.out.println("Makanan = Lalapan Bebek");
                    System.out.println("Minuman = Jeruk Hangat");
                } else {
                    System.out.println("Keluar Aplikasi");
                }
                break;    
            case '3' :
                if (Minuman == 1){
                    System.out.println("Makanan = Lalapan Ayam");
                    System.out.println("Minuman = Air Mineral");
                } else if (Minuman == 2) {
                    System.out.println("Makanan = Lalapan Ayam");
                    System.out.println("Minuman = Es Teh");
                } else if (Minuman == 3) {
                    System.out.println("Makanan = Lalapan Ayam");
                    System.out.println("Minuman = Es Jeruk");
                } else if (Minuman == 4) {
                    System.out.println("Makanan = Lalapan Ayam");
                    System.out.println("Minuman = Jeruk Hangat");
                } else {
                    System.out.println("Keluar Aplikasi");
                }
                break;
            case '4' :
                if (Minuman == 1){
                    System.out.println("Makanan = Lalapan Lele");
                    System.out.println("Minuman = Air Mineral");
                } else if (Minuman == 2) {
                    System.out.println("Makanan = Lalapan Lele");
                    System.out.println("Minuman = Es Teh");
                } else if (Minuman == 3) {
                    System.out.println("Makanan = Lalapan Lele");
                    System.out.println("Minuman = Es Jeruk");
                } else if (Minuman == 4) {
                    System.out.println("Makanan = Lalapan Lele");
                    System.out.println("Minuman = Jeruk Hangat");
                } else {
                    System.out.println("Keluar Aplikasi");
                }
                break;    
        }
    }
    
}
