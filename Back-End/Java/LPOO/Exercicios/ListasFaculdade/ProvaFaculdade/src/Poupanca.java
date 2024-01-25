public class Poupanca extends Conta{
    private Double juros;

    public Poupanca(int numeroConta, int numeroAgencia, String nomeAgencia, String nomeCliente, String cpfCliente, double saldo, double juros){
        super(numeroConta, numeroAgencia, nomeAgencia, nomeCliente, cpfCliente, saldo);
        this.juros = juros;
    }
    public Double getJuros(){
        return this.juros;
    }
    public void setJuros(Double juros){
        this.juros = juros;
    }
    public void renderJuros(Double juros){
        Double novoSaldo = getSaldo()*(juros/100);
        this.setSaldo(novoSaldo);
        System.out.println("Juros rendidos novo saldo de "+getSaldo());
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Taxa de juros de "+getJuros());
    }
}
