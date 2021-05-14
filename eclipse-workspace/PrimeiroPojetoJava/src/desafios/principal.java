package desafios;
import java.io.IOException;
import java.util.Scanner;

public class principal {

	public static void main(String args[]) throws IOException{
		String path = "C:/Users/Kamijou/Desktop/texto1.txt";
		int escolha;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Escolha uma das opções a seguir:");
			System.out.println("1- Cadastrar o Nome e o Telefone;");
			System.out.println("2- Ver os registros cadastrados;");
			System.out.println("Digite qualquer outro valor para Sair;");
			escolha = scan.nextInt();
			switch(escolha) {
				case 1:
					//"ocorreu um erro aqui por causa de que eu fechava o scan do arquivo desafio.java"
					//"por isso quando voltava aqui ficava dizendo que eu tinha fechado o scan daqui também"
					//"De qualquer jeito, o programa agora funcioona normalmente."
					desafio.escritor(path);
					System.out.println("Deseja fazer outra operação?");
					break;
				case 2:
					desafio.leitor(path);
					System.out.println("Deseja fazer outra operação?");
					break;
				default:
					scan.close();
					System.out.println("Tenha um Bom Dia.");
					break;
				
			}
		}while(escolha>0 && escolha<3);
	}

}
