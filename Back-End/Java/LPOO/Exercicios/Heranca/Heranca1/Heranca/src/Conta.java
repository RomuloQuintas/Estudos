//super classe
public class Conta {
	//declaração de atributos
	private int numero; //numero da conta
	private double saldo; //saldo da conta
	private String nomeCliente;	//nome do cliente
	
	//metodo especiais 

	//metodo construtor que obrigatoriamente recebe como parametro o número, saldo e nome do cliente.
	public Conta(int numero, double saldo, String nomeCliente) {
		//this refencia as variaveis dentro do chamado do construtor, e atribui o valor dessas variaveis 
		//aos atributos declarado nesta classe
		this.numero = numero;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}

	//Metodos getters e setters de numero, saldo e o nome do cliente
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
