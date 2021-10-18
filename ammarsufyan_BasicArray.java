import java.util.Scanner;

public class ammarsufyan_BasicArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan panjang array: ");
		int n = input.nextInt();
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Masukkan array ke-" + (i+1) + " :");
			A[i] = input.nextInt();
		}
		
		System.out.println("=============================");
		
		for(int i = 0; i < n; i++) {
			System.out.println("Array ke-" + (i+1) + " :" + A[i]);
		}
		
	}
}