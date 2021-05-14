package desafios;

import java.io.*;
import java.util.Scanner;

import com.google.gson.Gson;

public class desafio {
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);
			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		//o codigo é pra saber se é pra colocar em uma nova linha
		FileWriter fw = new FileWriter(path, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String linha = "";
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o Nome: ");
		linha = in.nextLine();
		cliente json = new cliente(); 
		json.setNome(linha);
		System.out.println("Digite o Telefone: ");
		linha = in.nextLine();
		json.setTelefone(linha);
		Gson gson = new Gson();
		//escrever no arquivo.txt a linha no formato json.
		bw.write(gson.toJson(json));
		bw.newLine();
		bw.close();
		
	}
}
