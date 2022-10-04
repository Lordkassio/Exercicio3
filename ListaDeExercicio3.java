package ListaDeExerciciosPraPraticar;
import java.util.Scanner;

public class ListaDeExercicio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = entrada.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("O valor da soma é: " + soma);
		
		entrada.close();
	}

}
