import java.util.Scanner;
import java.util.ArrayList;

public class RunContas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>(10);

        int opcao;

        do {
            System.out.println("Digite uma das opçõs: ");
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Conta ou Poupança");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Render Juros");
            System.out.println("4 - Consultar Número e Nome da Agência");
            System.out.println("5 - Alterar Número e Nome da Agência");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o tipo");
                    System.out.println(" 1 - Conta \n 2 - Conta Poupança");
                    int tipoConta = entrada.nextInt();
                    System.out.print("Digite o numero da conta: ");
                    int numeroConta = entrada.nextInt();
                    System.out.print("Digite o numero da agencia: ");
                    int numeroAgencia = entrada.nextInt();
                    System.out.print("Digite o nome da agencia: ");
                    String nomeAgencia = entrada.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = entrada.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCliente = entrada.nextLine();
                    System.out.print("Digite o saldo da conta: ");
                    Double saldo = entrada.nextDouble();
                    entrada.nextLine();

                    if(tipoConta==1){
                        Conta c1 = new Conta(numeroConta, numeroAgencia, nomeAgencia, nomeCliente, cpfCliente,saldo);
                        contas.add(c1);
                        System.out.println("Suas conta foi cadastrada com seucesso!");
                    }
                    else if(tipoConta==2){
                        System.out.print("Digite a taxa de juros: ");
                        Double juros = entrada.nextDouble();
                        Poupanca p1 = new Poupanca(numeroConta, numeroAgencia, nomeAgencia, nomeCliente, cpfCliente,saldo,juros);
                        contas.add(p1);
                        System.out.println("Sua conta foi criada com secesso!");
                    }
                    break;
                case 2:
                    System.out.print("Digie o CPF do cliente: ");
                    String cpfDeposito = entrada.nextLine();
                    for(Conta conta:contas){
                        if(conta.getCpfCliente().equals(cpfDeposito)){
                            System.out.print("Digite o valor para depositar: ");
                            Double deposito = entrada.nextDouble();
                            conta.deposito(deposito);
                        }
                        else{
                            System.out.println("Cliente nao encontrado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfJuros = entrada.nextLine();
                    for(Conta conta:contas){
                        if(conta.getCpfCliente().equals(cpfJuros)&&conta instanceof Poupanca){
                            System.out.println("Digite a taxa de juros: ");
                            Double juros = entrada.nextDouble();
                            ((Poupanca) conta).renderJuros(juros);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o CPF do cliente: ");
                    String cpfConsulta = entrada.nextLine();
                    for(Conta conta:contas){
                        if(conta.getCpfCliente().equals(cpfConsulta)){
                            System.out.println("Numero a agencia: "+conta.getNumeroAgencia());
                            System.out.println("Nome da agencia: "+conta.getNomeAgencia());
                        }
                        else{
                            System.out.println("Cliente nao escontrado");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = entrada.nextLine();
                    for(Conta conta:contas){
                        if(conta.getNomeCliente().equals(nome)){
                            System.out.print("Digite o numero da agencia: ");
                            int novoNumero = entrada.nextInt();
                            System.out.print("Digite o novo nome da agencia: ");
                            String novoNome = entrada.nextLine();
                            conta.setNumeroAgencia(novoNumero);
                            conta.setNomeAgencia(novoNome);
                            System.out.println("Numero e nome da agencia alterados");
                        }
                        else{
                            System.out.println("Cliente nao encontrado");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
            }
        } while (opcao !=0);
        entrada.close();
        
    }
    
}
