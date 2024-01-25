package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunContas {
    public static void main(String[] args) {
        ArrayList<ContaBanco> contas = new ArrayList<>(5);
    Scanner entrada2 = new Scanner(System.in);

    ContaBanco contaB = null;
    ContaBanco contaP = null;
    ContaBanco contaE = null;

    int opc=0;
    int opc2=0;
    String nome;
    int num_conta;
    Double saldo;
    int diarend;
    double limite;

    do {
        System.out.println("Digite uma das opçoes: ");
        System.out.println(" 1 - Cadastrar conta");
        System.out.println(" 2 - Sacar");
        System.out.println(" 3 - Depositar");
        System.out.println(" 4 - Mostrar novo saldo atravez do rendimento");
        System.out.println(" 5 - Mostrar todas as contas cadastradas");

        opc = entrada2.nextInt();

        switch(opc){
            case 1: 
                System.out.println(" 1 - Conta bancaria");
                System.out.println(" 2 - Conta Poupança");
                System.out.println(" 3 - Conta Especial");
                opc2 = entrada2.nextInt();
                switch (opc2) {
                    case 1:
                        System.out.println("Digite o nome do dono da conta: ");
                        nome = entrada2.next();
                        System.out.println("Digite o numero da conta: ");
                        num_conta = entrada2.nextInt();
                        System.out.println("Digite o saldo da conta: ");
                        saldo = entrada2.nextDouble();
                        contaB = new ContaBanco(nome, num_conta, saldo);
                        contas.add(contaB);
                        break;
                    case 2:
                        System.out.println("Digite o nome do dono da conta: ");
                        nome = entrada2.next();
                        System.out.println("Digite o numero da conta: ");
                        num_conta = entrada2.nextInt();
                        System.out.println("Digite o saldo da conta: ");
                        saldo = entrada2.nextDouble();
                        System.out.println("Digite o dia de rendimendo da conta: ");
                        diarend = entrada2.nextInt();
                        contaP = new ContaPoupanca(nome, num_conta, saldo, diarend);
                        contas.add(contaP);
                        break;
                    case 3:
                        System.out.println("Digite o nome do dono da conta: ");
                        nome = entrada2.next();
                        System.out.println("Digite o numero da conta: ");
                        num_conta = entrada2.nextInt();
                        System.out.println("Digite o saldo da conta: ");
                        saldo = entrada2.nextDouble();
                        System.out.println("Digite o limite da conta: ");
                        limite = entrada2.nextDouble();
                        contaE = new ContaEspecial(nome, num_conta, saldo, limite);
                        contas.add(contaE);
                        break;
                }
                break;
            case 2:
                System.out.println("Digite o numero da conta que efetuará o saque: ");
                num_conta = entrada2.nextInt();
                for(ContaBanco conta:contas){
                    if(num_conta == conta.getNum()){
                        conta.sacar();
                    }
                    else{
                        System.out.println("Conta nao encontrada.");
                    }
                }
            case 3:
                System.out.println("Digite o numero da conta que efetuará o deposito: ");
                num_conta = entrada2.nextInt();
                for(ContaBanco conta:contas){
                    if(num_conta == conta.getNum()){
                        conta.depositar();
                    }
                }
            case 4:
                
                
            
                
        }
        

    } while(opc!=0);

    }
    

}
