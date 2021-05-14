package usuario;

import java.util.Scanner;

public class log {
	public static void main(String[] args) {
		user usuario = new user();
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Digite o Login: ");
		usuario.setNome(ler.nextLine());
		System.out.printf("Digite a Senha: ");
		usuario.setUm(ler.nextLine());
		
	}
}
