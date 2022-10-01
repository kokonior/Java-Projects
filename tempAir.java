import java.util.Scanner;

public class TempAir {
    public static void main(String[] args){
        /* contoh pemakaian IF tiga kasus : wujud air */

        /*Kamus*/
        int T;

        /*Program*/
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Temperatur (der. C) = ");

        //scanner untuk masukan temperatur air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //masukan temperatur air dengan tipe int

        //proses pengecekan dengan if
        if (T < 0){
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println ("Wujud air cair " + T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
