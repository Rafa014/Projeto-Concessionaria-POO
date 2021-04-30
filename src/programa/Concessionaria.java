package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Carro;
import entidades.Cliente;
import entidades.Moto;
import entidades.Veiculo;


public class Concessionaria  {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		List<Veiculo> list = new ArrayList<>();
		int cadastro = 0;
		int opcao;
		do {
			manu();
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				//************************* COMPRA VEICULO *************************
				if (cadastro == 0) {			
					System.out.printf("\n-------------------------------------------\n");
					System.out.println("Nenhum veiculo disponivel!");
				} else {
					int c = 0;
					System.out.printf("-------------------------------------------\n\n");
					System.out.println("Cliente...");
					System.out.print("Nome: ");
					String nome = sc.nextLine();
					System.out.print("CPF: ");
					String cpf = sc.nextLine();
					System.out.print("Idade: ");
					int idade = sc.nextInt();	
					Cliente cliente = new Cliente(nome,cpf,idade);
					System.out.println("-------------------------------------------");
					System.out.println("VEICULOS");
					for (Veiculo v: list) {
						System.out.printf("Veiculo numero: %d\n",c+1);
						System.out.println(v.printVeiculo());
						c++;
					}
					System.out.print("Digite o numero do veiculo: ");
					int nVeiculo = sc.nextInt();
					System.out.printf("-------------------------------------------\n\n");
					c = 0;
					for (Veiculo v: list) {
						if (nVeiculo-1 == c) {
							System.out.println(cliente.getNome());
							System.out.println(cliente.getCpf());
							System.out.println(cliente.getIdade());
							System.out.println(v.printVeiculo());
							System.out.println("COMPRA REALIZADA COM SUCESSO! ");
						}
						c++;
					}
				}
				System.out.printf("-------------------------------------------\n\n");
				break;
			case 2:
				//************************* CADASTRAR VEICULO *****************************
				System.out.printf("\n-------------------------------------------\n");
				System.out.println("Digite o número de veiculos para cadastro: ");
				int nCarros = sc.nextInt();
				for (int i = 0; i < nCarros; i++) {
					System.out.printf("\n-------------------------------------------\n");
					System.out.printf("Veiculo %d:\n",i+1);
					System.out.println("Digite (c) -> Carro ou (m) -> Moto... ");
					char v = sc.next().charAt(0);
					sc.nextLine();
					System.out.print("Placa: ");
					String placa = sc.nextLine();
					System.out.print("Modelo: ");
					String modelo = sc.nextLine();
					System.out.print("Marca: ");
					String marca = sc.nextLine();
					System.out.print("Ano: ");
					int ano = sc.nextInt();
					System.out.print("Preço: ");
					double preco = sc.nextDouble();
					if (v == 'c') {
						System.out.print("Portas: ");
						int portas = sc.nextInt();
						System.out.print("Motor: ");
						double motor = sc.nextDouble();
						list.add(new Carro(placa,modelo,marca,ano,preco,portas,motor));
					} else {
						System.out.print("Cilindradas: ");
						int cilin = sc.nextInt();
						list.add(new Moto(placa,modelo,marca,ano,preco,cilin));
					}
					cadastro++;
				}
				break;
			case 3:
				//************************* LISTA VEICULOS *****************************
				System.out.printf("\n-------------------------------------------\n");
				System.out.println("VEICULOS");
				for (Veiculo v: list) {
					System.out.println(v.printVeiculo());
				}
				break;
			}
		}while (opcao != 0);
		
		sc.close();	
	}
	
	public static void manu () {
		System.out.println("** CONCESSIONARIA R & L. ltda**");
		System.out.println("1) Comprar Veiculo");
		System.out.println("2) Cadastra Veiculo");
		System.out.println("3) Listar Veiculos");
		System.out.println("0) Sair");
		System.out.print("Digite uma opção... ");
	}

}
