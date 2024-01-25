public class ContaCorrente extends Conta{

    public ContaCorrente(){
        this.setNumConta(getNumConta());
        this.setCpf(getCpf());
        this.setTaxa(getTaxa());
        this.setSaldo(getSaldo());
        this.setBanco(getBanco());
    }

    @Override
    public void saque(double v) {
        setSaldo(getSaldo()-v-0.30);
        System.out.println("[CC] [Saque] + taxa de 0.30$ saldo: "+getSaldo());
    }

    @Override
    public void atualizar() {
        setSaldo(getSaldo()-getTaxa());
        System.out.println("[CC] [Atualizacao] saldo: "+getSaldo());
    }

    @Override
    public void depositar(double v) {
        setSaldo(getSaldo()+v);
        System.out.println("[CC] [Deposito] saldo: "+getSaldo());
    }


    
    
}
