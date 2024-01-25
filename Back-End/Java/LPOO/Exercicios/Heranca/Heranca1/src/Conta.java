
public class Conta {

	private int numero;
	private double saldo;
	private String nomeCliente;
	
	public Conta(int numero, double saldo, String nomeCliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}
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
