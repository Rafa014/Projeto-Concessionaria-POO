package entidades;

public class Veiculo {

	private String placa;
	private String modelo;
	private String marca;
	private int ano;
	private double preco;
	
	public Veiculo () {
		
	}
	
	public Veiculo(String placa, String modelo, String marca, int ano, double preco) {
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.preco = preco;
	}
	
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	public int getAno() {
		return ano;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String printVeiculo () {
		StringBuilder sb = new StringBuilder();
		sb.append("Placa: " + placa+ "\n");
		sb.append("R$ " + String.format("%.2f", preco)+ "\n");
		sb.append("Modelo: " + modelo+ "\n");
		sb.append("Marca: " + marca+ "\n");
		sb.append("Ano: " + ano+ "\n");
		return sb.toString();
	}
}
