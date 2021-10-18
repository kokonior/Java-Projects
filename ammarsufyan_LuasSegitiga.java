import java.util.Scanner;

public class ammarsufyan_LuasSegitiga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float alas, tinggi;
		
		System.out.print("Masukkan alas	: ");
		alas = input.nextFloat();
		System.out.print("Masukkan tinggi	: ");
		tinggi = input.nextFloat();
		
		hitungLuasSegitiga(alas, tinggi);
	}
	
	static void hitungLuasSegitiga(float alas, float tinggi) {
		float luas = (alas*tinggi)/2;
		System.out.println("Luasnya adalah	: " + luas);
	}
}