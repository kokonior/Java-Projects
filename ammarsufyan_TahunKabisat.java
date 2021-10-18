import java.util.Scanner;

public class ammarsufyan_TahunKabisat {
	public static void main(String[] args) {
		int tahun;
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan tahun : ");
		tahun = in.nextInt();
		if (tahun % 4 == 0) {
			System.out.print(tahun + " Merupakan Tahun Kabisat\n");
		} else {
			System.out.print(tahun + " Bukan Tahun Kabisat\n");
		}
	}
}
