package aula05;

import java.io.*;

public class escrever {
	public static void main(String[] args) throws Exception{
		OutputStream saida = new FileOutputStream("C:/Users/Kamijou/Desktop/texto.txt");
		OutputStreamWriter escritor = new OutputStreamWriter(saida);
		BufferedWriter buffer = new BufferedWriter(escritor);
		buffer.write("Escrevendo no Arquivo");
		
		//System.out.println(linha);
		
		buffer.close();
	}
}
