import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Product [] vect = new Product[N];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		sum = sum / vect.length;
		
		System.out.printf("Average price is: %.2f%n", sum);
		
		
		sc.close();

	}

}
