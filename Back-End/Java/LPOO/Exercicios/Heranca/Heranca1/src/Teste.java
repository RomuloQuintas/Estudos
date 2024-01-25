import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		//criacao
		ArrayList<Conta> lista = new ArrayList<Conta>();
		Conta [] listaA = new Conta[4];
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double saldo;
		String nomeCliente;
		System.out.println("Digite o numero");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o saldo");
		saldo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome do cliente");
		nomeCliente = sc.nextLine();
		Conta c;
		c = new Conta(numero, saldo, nomeCliente);
		//adicao de elemento
		listaA[0]=c;
		lista.add(c);
		
		System.out.println("Digite o numero");
		numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o saldo");
		saldo = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o nome do cliente");
		nomeCliente = sc.nextLine();
		int juros;
		System.out.println("Digite o juros");
		juros = sc.nextInt();
		Poupanca p = new Poupanca(numero, saldo, nomeCliente, juros);
		lista.add(p);
		listaA[1]=p;
		
		//tamanho
	/*	listaA.length;//me o tamanho do array
		lista.size();*/
		//pega uma elemento
	/*	c = listaA[i];
		c = lista.get(i);*/
		
		for(int i=0;i<lista.size();i++) {
			Conta c1 = lista.get(i);
			Poupanca p1;//s = lista.get(i);
		//	c1.render();
	//		p1.render();
			if(c1 instanceof Poupanca) {
				p1 = (Poupanca) lista.get(i);
				p1.render();
			}
			
		}
		
		
		
	}

}
