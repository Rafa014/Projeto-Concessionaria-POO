package entidades;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	
	public Cliente() {

	}

	public Cliente(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int valida_idade (int idade) {
		int valido = 1;
		if (idade < 18) {
			valido = 0;
		}
		return valido;
	}

}
