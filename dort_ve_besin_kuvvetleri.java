package dort_ve_besin_kuvvetleri;

import java.util.Scanner;

public class dort_ve_besin_kuvvetleri {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayı girin: ");
		int sayi = scan.nextInt();
		
		System.out.println("4'ün kuvvetleri: ");


		for (int i = 4; i <= sayi; i *= 4) {

			System.out.print(i + " ");
		}
		
		System.out.println("\n" + "5'in kuvvetleri: ");

		for (int x = 5; x <= sayi; x *= 5) {

			System.out.print(x + " ");
		}
	}

}
