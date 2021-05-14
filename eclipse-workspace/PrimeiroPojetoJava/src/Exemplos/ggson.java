package Exemplos;
import com.google.gson.Gson;


public class ggson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		desen desen = new desen();
		desen.setNome("JOJO");
		desen.setSalario(1880);
		desen.setSetor("Britania");
		
		Gson gson = new Gson();
		System.out.print(gson.toJson(desen));

	}

}
