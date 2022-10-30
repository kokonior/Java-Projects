import java.util.Scanner;
public class kalkulasi_bmi {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int gender,hasil;
        float tinggi,bmi,berat,meter;
        double fix_bmi;

    System.out.println("Menghitung BMI");
    System.out.println("==============================");
    System.out.println("Pilih jenis kelamin: ");
    System.out.println("1. Laki laki");
    System.out.println("2. Perempuan");
    System.out.println("===============================");

    System.out.println("Masukan Jenis kelamin: ");
    gender = input.nextInt();
    System.out.println("Masukan Berat Badan: ");
    berat = input.nextFloat();
    System.out.println("Masukan Tinggi Badan: ");
    tinggi = input.nextFloat();
    meter = tinggi /100;

    bmi = (berat/(meter * meter));

    System.out.println("BMI : "+ bmi +" ");
    
    if (bmi < 18.5){
        System.out.println("Kurus");
    } else if (bmi <= 22.5) {
        System.out.println("Normal");
    } else if(bmi <25.9){
        System.out.println("Overweight");
    } else {
        System.out.println("Obesitas"); 
    }

    switch (gender) {
        case 1 : fix_bmi = ((tinggi - 100) - (0.10 * ( tinggi - 100 )));
    break;
        case 2 : fix_bmi = ((tinggi - 100 ) - (0.15 * ( tinggi -100 )));
    default : fix_bmi = 0;
    }; 

    hasil = (int) fix_bmi;
    System.out.println("Berat Badan Ideal Anda Menurut Broca " + hasil + " Kg");
    }
}
