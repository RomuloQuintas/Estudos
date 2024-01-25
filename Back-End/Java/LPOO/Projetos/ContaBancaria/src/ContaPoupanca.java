public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        this.setNumConta(getNumConta());
        this.setCpf(getCpf());
        this.setTaxa(getTaxa());
        this.setSaldo(getSaldo());
        this.setBanco(getBanco());
    }
    
    @Override
    public void saque(double v) {
        setSaldo(getSaldo()-v);
        System.out.println("[CP] [Saque] saldo: "+getSaldo());
    }

    @Override
    public void atualizar() {
        setSaldo(getSaldo()+getTaxa());
        System.out.println("[CP] [Atualizacao] saldo: "+getSaldo());
    }

    @Override
    public void depositar(double v) {
        setSaldo(getSaldo()+v);
        System.out.println("[CP] [Deposito] saldo: "+getSaldo());
    }
    
}
