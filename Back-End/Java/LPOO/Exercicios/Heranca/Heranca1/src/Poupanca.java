
public class Poupanca extends Conta {
	
	private int juros;

	public Poupanca(int numero, double saldo, String nomeCliente, int juros) {
		super(numero, saldo, nomeCliente);
		this.juros = juros;
	}

	public int getJuros() {
		return juros;
	}

	public void setJuros(int juros) {
		this.juros = juros;
	}
	
	public void render() {
		double novo = this.getSaldo() + (this.getSaldo()*this.juros)/100;
		this.setSaldo(novo);
	}
	
	public double getSaldo() {
		return super.getSaldo()+1;
	}

}
