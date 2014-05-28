package Trabalho2;

public class Pessoa {
	
	String nome;
	String telefone[];
	String endereco;
	
	public Pessoa(String nome, String endereco, String telefone[]) 
	{
		this.nome 				= nome;
		this.endereco 			= endereco;
		this.telefone 			= telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getTelefone() {
		return telefone;
	}
	public void setTelefone(int indice, String telefone) {
		this.telefone [indice] = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco  = endereco;
	}
	
	

}
