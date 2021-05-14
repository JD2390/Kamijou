package aula05;

import java.io.*;

public class arquivo {
	public static void main(String[] args){
		InputStream entrada;
		try {
			entrada = new FileInputStream("C:/Users/Kamijou/Desktop/texto.txt");
			InputStreamReader leitor = new InputStreamReader(entrada);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			System.out.println(linha);
			
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Ocorrou um erro Inesperado");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Erro ao abrir o arquivo");
			e.printStackTrace();
		}
		
	}
	
}
