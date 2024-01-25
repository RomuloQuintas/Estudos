package Q1;

public class ContaEspecial extends ContaBanco{
    Double limite;
    
    public ContaEspecial(String nome,int num_conta,Double saldo,Double limite){
        super(nome,num_conta,saldo);
        this.limite = limite;
    }
    @Override
    public void sacar(){
        Double v;
        System.out.println("Digite o valor do saque: ");
        v = entrada.nextDouble();
        if(getSaldo()-v>=0-getLimite());
    }
    public Double getLimite(){
        return this.limite;
    }
    public void setLimite(Double limite){
        this.limite = limite;
    }
}
