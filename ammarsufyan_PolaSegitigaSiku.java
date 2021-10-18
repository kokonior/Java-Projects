import java.util.Scanner;

public class ammarsufyan_PolaSegitigaSiku {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;


		System.out.print("Silakan masukkan jumlah pola = ");
		n = in.nextInt();
		System.out.println(" ");

		System.out.println("Pola 1");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		System.out.println("Pola 2");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		System.out.println("Pola 3");
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = n; k >= i; k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		System.out.println("Pola 4");
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}

