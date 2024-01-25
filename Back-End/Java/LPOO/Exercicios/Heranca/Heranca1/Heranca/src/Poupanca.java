//sub-classe extendida da super-classe Conta
public class Poupanca extends Conta {
	
	//possui apenas um atributo 
	private Double juros;

	//metodos personalisados

	//esse metodos soma o saldo com o rendimento final atraves dos juros 
	public void render() {
		//primeiro pega saldo e mutiplica pelos juros em seguida divide por 100,
		//restando apenas o valor do rendimento e assim soma com o saldo 
		double novo = this.getSaldo() + (this.getSaldo()*this.juros)/100;
		//E assim o valor da variavel novo que é o novo saldo é passado para o saldo
		this.setSaldo(novo);
	}

	//metodos especiais 

	//metodo construtor que recebe obrigatoriamente o nome, saldo, nome do cliente e juros.
	public Poupanca(int numero, double saldo, String nomeCliente, Double juros) {
		//super refencia a super-classe e seus atributos podendo utilizalos mesmo privados
		super(numero, saldo, nomeCliente);
		//this refencia o valor da variavel juros e atribui ao atributo juros da sub-classe
		this.juros = juros;
	}

	public double getSaldo() {
		return super.getSaldo()+1;
	}


	//getters e setters de juros
	public double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
}
