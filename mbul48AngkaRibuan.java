import java.util.Locale;
import java.util.Scanner;

class mbul48AngkaRibuan {
  public static void main(String[] args) {
    Locale bahasa = new Locale("id");
    Scanner inp = new Scanner(System.in);
    int harga = inp.nextInt();
    
    System.out.printf(bahasa, "Rp%,d,-", harga);
    
  }
}
