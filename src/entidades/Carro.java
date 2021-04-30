package entidades;

public class Carro extends Veiculo{
	
	private int portas;
	private double motor;
	
	public Carro(String placa, String modelo, String marca, int ano, double preco, int portas, double motor) {
		super(placa, modelo, marca, ano, preco);
		this.portas = portas;
		this.motor = motor;
	}

	public int getPortas() {
		return portas;
	}

	public double getMotor() {
		return motor;
	}
	
	@Override
	public String printVeiculo () {
		StringBuilder sb = new StringBuilder();
		sb.append("CARRO: \n");
		sb.append("Placa: " + super.getPlaca()+ "\n");
		sb.append("R$ " + String.format("%.2f", super.getPreco())+ "\n");
		sb.append("Modelo: "+ super.getModelo()+ "\n");
		sb.append("Marca: "+ super.getMarca()+ "\n");
		sb.append("Ano: " + super.getAno()+ "\n");
		sb.append("Portas: "+ portas+ "\n");
		sb.append("Motor: "+ motor+ "\n");
		return sb.toString();
	}
	
}
