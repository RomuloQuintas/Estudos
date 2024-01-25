//importação do Scanner e do ArrayList

import java.util.ArrayList;
import java.util.Scanner;


//classe main
public class Teste {
	public static void main(String[] args) {
		//criacao do ArrayList do tipo Conta(mesmo da super-classe) com o nome lista
		ArrayList<Conta> lista = new ArrayList<Conta>();
		//criacao do scanner sc
		Scanner entrada = new Scanner(System.in);

		int numero;
		Double saldo;
		String nome;
		Double juros;
		int opc=0;

		do {
			System.out.println("Digite uma das opções: ");
			System.out.println(" 1 - Cadastrar conta");
			System.out.println(" 2 - Consultar saldo");
			System.out.println(" 3 - Consultar rendimento");
			System.out.println(" 0 - Sair");
			opc = entrada.nextInt();

			switch(opc){
				case 1:
					int opc2 =0;
					System.out.println("Digite qual o tipo de conta");
					System.out.println(" 1 - Conta Corrente");
					System.out.println(" 2 - Conta Poupança");
					opc2 =entrada.nextInt();
					switch(opc2){
						case 1:
							System.out.println("Digite o nuemro da conta: ");
							numero = entrada.nextInt();
							c1.setNumero(numero);
							System.out.println("Digite o saldo da conta: ");
							saldo = entrada.nextDouble();
							c1.setSaldo(saldo);
							System.out.println("Digite o nome do cliente: ");
							nome = entrada.nextLine();

							
							break;
						case 2:
							System.out.println("Digite o nuemro da conta: ");
							numero = entrada.nextInt();
							System.out.println("Digite o saldo da conta: ");
							saldo = entrada.nextDouble();
							System.out.println("Digite o nome do cliente: ");
							nome = entrada.nextLine();
							System.out.println("Digite o juros da conta: ");
							juros = entrada.nextDouble();
							Poupanca p1 = new Poupanca(numero, saldo, nome, juros);
							lista.add(p1);
					}
					break;
				case 2:
					System.out.println("Digite o nemme ");
			}
		} while (opc!=0);	
	}
}


