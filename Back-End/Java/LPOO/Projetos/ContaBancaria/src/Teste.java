import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        int opc;

        do {
            System.out.println(" 1 - Cadastrar Conta corrente");
            System.out.println(" 2 - Cadastrar conta poupanca");
            System.out.println(" 3 - Atalizar conta corrente");
            System.out.println(" 4 - Atualizar conta poupanca");
            System.out.println(" 5 - Saque conta corrente");
            System.out.println(" 6 - Saque conta poupanca");
            System.out.println(" 7 - Verificar saldo conta corrente");
            System.out.println(" 8 - Verificar saldo conta poupanca");
            System.out.println(" 0 - Sair");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o Digite o numero da conta: ");
                    cc1.setNumConta(sc.nextInt());
                    System.out.print("Digite o cpf: ");
                    cc1.setCpf(sc.nextInt());
                    System.out.print("Digite a taxa: ");
                    cc1.setTaxa(sc.nextDouble());
                    System.out.print("Digite o saldo: ");
                    cc1.setSaldo(sc.nextDouble());
                    System.out.print("Digite o banco: ");
                    cc1.setBanco(sc.next());
                    System.out.println("Conta corrente adicionada com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o Digite o numero da conta: ");
                    cp1.setNumConta(sc.nextInt());
                    System.out.print("Digite o cpf: ");
                    cp1.setCpf(sc.nextInt());
                    System.out.print("Digite a taxa: ");
                    cp1.setTaxa(sc.nextDouble());
                    System.out.print("Digite o saldo: ");
                    cp1.setSaldo(sc.nextDouble());
                    System.out.print("Digite o banco: ");
                    cp1.setBanco(sc.next());
                    System.out.println("Conta poupanca adicionada com sucesso.");
                    break;
                case 3:
                    cc1.atualizar();
                    break;
                case 4:
                    cp1.atualizar();
                    break;
                case 5:
                    System.out.print("Digite o valor do saque: ");
                    double v = sc.nextDouble();
                    cc1.saque(v);
                    break;
                case 6:
                    System.out.print("Digite o valor para saque: ");
                    double v1 = sc.nextDouble();
                    cp1.saque(v1);
                    break;
                case 7:
                    System.out.println("[CC] Saldo: "+cc1.getSaldo());
                    break;
                case 8:
                    System.out.println("[CP] Saldo: "+cp1.getSaldo());
                    break;
            }
        } while (opc!=0);
        sc.close();
    }
}
