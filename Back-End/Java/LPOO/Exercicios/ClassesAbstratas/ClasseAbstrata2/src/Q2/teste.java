package Q2;
import java.util.Scanner;
import java.util.ArrayList;

public class teste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Homem> homens = new ArrayList<>();
        ArrayList<Mulher> mulheres = new ArrayList<>();

        int opc;

        do {
            System.out.println("Dige uma das opcoes: ");
            System.out.println(" 1 - Cadastrar homem");
            System.out.println(" 2 - Cadastrar Mulher");
            System.out.println(" 3 - Consultar IMC");
            System.out.println(" 4 - Listar homens");
            System.out.println(" 5 - Listar mulheres");
            System.out.println(" 6 - Listar todos os IMCs dos homens");
            System.out.println(" 7 - Listar todos os IMCs");
            System.out.println(" 0 - Sair");

            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a data de nascimento: ");
                    String dataNascimento = sc.nextLine();
                    System.out.print("Digite o peso: ");
                    Double peso = sc.nextDouble();
                    System.out.println("Digite a altura: ");
                    double altura = sc.nextDouble();

                    Homem h1 = new Homem(nome, dataNascimento, peso, altura);
                    homens.add(h1);

                    System.out.println("Homem criado com sucesso");
                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    String nome2 = sc.nextLine();
                    System.out.print("Digite a data de nascimento: ");
                    String dataNascimento2 = sc.nextLine();
                    System.out.print("Digite o peso: ");
                    Double peso2 = sc.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura2 = sc.nextDouble();

                    Mulher m1 = new Mulher(nome2, dataNascimento2, peso2, altura2);
                    mulheres.add(m1);

                    System.out.println("Homem criado com sucesso");
                    break;
                case 3:
                    System.out.print("A pessao para consulta é: \n 1 - Homem\n 2 - Mulher");
                    int HouM = sc.nextInt();
                    System.out.print("Digite o nome para consulta: ");
                    String nomeCosulta = sc.nextLine();
                    if(HouM == 1){
                        for(Homem homem:homens){
                            if(homem.getNome()==nomeCosulta){
                                System.out.print("O IMC de "+nomeCosulta+": "+homem.calculaIMC());
                            }
                        }
                    }else if(HouM==2){
                        for(Mulher mulher:mulheres){
                            if(mulher.getNome()==nomeCosulta){
                                System.out.print("O IMC de "+nomeCosulta+": "+mulher.calculaIMC());
                            }
                        }
                    }else{
                        System.out.println("Erro!");
                    }
                    break;
                case 4:
                    System.out.println("Lista de todos os homens: ");
                    for(Homem homen : homens){
                        System.out.println(homen.getNome());
                    }
                    break;
                case 5:
                    System.out.println("Lista de todas as mulheres: ");
                    for(Mulher mulher : mulheres){
                        System.out.println(mulher.getNome());
                    }
                    break;
                case 6:
                    System.out.println("Lista de todos os IMCs dos homens: ");
                    for(Homem homen : homens){
                        System.out.println(homen.getNome()+" IMC DE: "+homen.calculaIMC()); 
                    }
                    break;
                case 7:
                    
                    
                        

            }

        } while (opc!=0);
    }
}