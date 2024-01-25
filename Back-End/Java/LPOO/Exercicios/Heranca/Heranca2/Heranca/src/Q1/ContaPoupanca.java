package Q1;

public class ContaPoupanca extends ContaBanco{
    int diarend;
    public ContaPoupanca(String nome, int num_conta, Double saldo, int diarend){
        super(nome,num_conta,saldo);
        this.diarend = diarend;
    }
    public void calcularNovoSaldo(Double rendimento){
        this.setSaldo((getSaldo()*rendimento)/100);
        System.out.println("Novo saldo é de "+this.getSaldo());
    }

    public int getDiaRend(){
        return this.diarend;
    }
    public void setDiaRend(int diarend){
        this.diarend = diarend;
    }
}  
