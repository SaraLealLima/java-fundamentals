import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double valor = 10.28873;
		String nome = "Jeremias";
		byte idade = 24;
		double salario = 2600.54;
		
		System.out.println("Hello World");
		System.out.println(valor);
		
		Locale.setDefault(Locale.US); // o Locale informa seu programa para que seja formatado num padrão específico. Com o US as , se tornam .
		
		System.out.printf("%.2f\n", valor); // o "%.2f determina quantas casas decimais devem aparecer, o \n (ou %n) determina quebra de linha 
		System.out.printf("%.4f%n", valor);
		
		
		// REGRAS DO printf
		System.out.printf("O valor é %f%n", valor);
		System.out.printf("%s tem %d anos e recebe %.2f reais de salario %n", nome, idade, salario);
		
		// CASTING
		
		int a, b;
		a = 5;
		b = 2;
		double resultado = a / b;
		System.out.println(resultado);
		// Resultado mesmo sendo uma var do tipo double, aponta para um numero inteiro pq ambos a e b são do tipo int. 
		resultado = (double) a / b;
		System.out.println(resultado);
		// O casting (double) te ajuda a determinar que você quer receber um resultado double.
		

	}

}
