//declaracao da super-classe
public class Conta{
    //declarao dos atributos da classe
    //todos privados mantendo o emcapsulamento
    private int numeroConta;
    private int numeroAgencia;
    private String nomeAgencia;
    private String nomeCliente;
    private String cpfCliente;
    private Double saldo;

    //metodo especiais
    //metodo construtor que recebe obrigatoriamento todos as variaveis e atribui aos atributos
    public Conta(int numeroConta, int numeroAgencia, String nomeAgencia, String nomeCliente, String cpfCliente, double saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeAgencia = nomeAgencia;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }
    //metoos getters e setters de todos os atributos
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return this.cpfCliente;
    }

    public void setCpfCliente(String  cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //
    public void sacar(Double valor){
        if(this.getSaldo()>=valor){
            this.setSaldo(getSaldo()-valor);
            System.out.println("Saque efetuado novo saldo de "+this.getSaldo());
        }
        else{
            System.out.println("Saldo insuficiente para saque!");
        }
    }
    public void deposito(Double valor){
        this.setSaldo(valor);
        System.out.println("Deposito depositado com sucessor novo saldo de "+this.getSaldo());
    }
    public void exibirInformacoes(){
        System.out.println("Numero da conta: "+getNumeroConta());
        System.out.println("Numero da agencia"+getNumeroAgencia());
        System.out.println("Nome da agencia: "+getNomeAgencia());
        System.out.println("Nome cliente: "+getNomeCliente());
        System.out.println("CPF do cliente"+getCpfCliente());
        System.out.println("Saldo da conta: "+getSaldo());
    }
}   