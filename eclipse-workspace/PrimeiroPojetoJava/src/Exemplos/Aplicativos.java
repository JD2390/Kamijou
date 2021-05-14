package Exemplos;

public class Aplicativos {
	private String nome;
	private double salario;
	private String setor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}	
	
	@Override
	public String toString() {
		return "Funcionario [nome: "+this.getNome()+ ", Salario: R$"+this.getSalario()+", Setor: "+this.getSetor()+".]";
	}
	
}
