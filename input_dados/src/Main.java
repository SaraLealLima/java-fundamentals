import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		x = scanner.nextLine();
		y = scanner.nextInt();
		z = scanner.nextDouble();
		a = scanner.next().charAt(0);
		
		System.out.println("Você digitou: " + x);
		System.out.println("Número digitado: " + y);
		System.out.println("Número double digitado: " + z);
		System.out.println("Caractere digitado: " + a);
		
		scanner.close();

	}

}
