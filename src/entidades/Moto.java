package entidades;

public class Moto extends Veiculo{
	
	private int cilindradas;

	public Moto () {
		
	}
	
	public Moto(String placa, String modelo, String marca, int ano, double preco, int cilindradas) {
		super(placa, modelo, marca, ano, preco);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}	
	
	@Override
	public String printVeiculo () {
		StringBuilder sb = new StringBuilder();
		sb.append("MOTO: \n");
		sb.append("Placa: " + super.getPlaca() + "\n");
		sb.append("R$ " + String.format("%.2f", super.getPreco())+ "\n");
		sb.append("Modelo: "+ super.getModelo()+ "\n");
		sb.append("Marca: "+ super.getMarca()+ "\n");
		sb.append("Ano: " + super.getAno()+ "\n");
		sb.append("Cilindradas: "+ cilindradas+ "\n");
		return sb.toString();
	}
}
