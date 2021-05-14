package aula04;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		int quant;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe um número: ");
		quant= ler.nextInt();
		ler.close();
		int numeros[] = new int[quant];
		
		for(int i=0; i<quant;i++) {
			numeros[i]=i+1;
			System.out.println("posição "+i+" numero:"+numeros[i]);
		}
	}
}
