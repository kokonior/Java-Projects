import java.util.Scanner;

public class ammarsufyan_PolaSegitigaSamaKaki {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Silakan masukkan jumlah pola = ");
		n = in.nextInt();
		System.out.println(" ");

		System.out.println("Pola 1");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

		System.out.println("Pola 2");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = n; k >= (2*i-n); k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
