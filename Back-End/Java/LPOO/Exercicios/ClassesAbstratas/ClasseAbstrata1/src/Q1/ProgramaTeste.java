package Q1;
//importa o metodo Scanner
import java.util.Scanner;

//cria a classe main
public class ProgramaTeste {
    public static void main(String[] args) {
        //prepara o Scanner com o nome de entrada
        Scanner entrada = new Scanner(System.in);
        //cria um array de Quadrilateros de tamanho 10
        Quadrilatero[] array = new Quadrilatero[10];
        //define o indece que será usado para percorrer o array
        int index = 0;
        //opc será a opcao que o usuario ira digitar
        int opc;

        //inicio do do while
        do {
            //da as opcoes ao usuario
            System.out.println("=========================================================================");
            System.out.println(" 1 - Cadastrar Retangulo");
            System.out.println(" 2 - Cadastrar Circulo");
            System.out.println(" 3 - Cadastrar Quadrado");
            System.out.println(" 4 - Mostrar o valor de todas as areas");
            System.out.println(" 5 - Mostrar o valor de todos os perimetros \n=========================================================================");
            System.out.print("Digite uma das opcoes: ");

            //e armazena na variavel opc
            opc = entrada.nextInt();

            //verificacoes do opc e assim executando os metodos
            switch(opc){
                case 1:
                    System.out.print("Digite o valor do lado: ");
                    float lado = entrada.nextFloat();
                    System.out.print("Digite a altura: ");
                    float altura = entrada.nextFloat();
                    //pede ao usuario o valor do lado e da altura e armazena das variaveis
                    //Cria o objeto do tipo retangulo r1 como parametro o lado e a altura
                    Retangulo r1 = new Retangulo(lado, altura);
                    //adiciona o objeto criado r1 no array na posicao definida pelo index(indece)
                    array[index] = r1;
                    //soma +1 ao index assim na proxima vez que for adicionar sera no proximo indece dentro do array
                    index++;
                    System.out.println("Retangulo criado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o valor do raio: ");
                    float raio = entrada.nextFloat();
                    //pede ao usuario o valor do raio e atribui a variavel
                    Circulo c1 = new Circulo(raio);
                    //cria o obeto do tipo Circulo como caparametro o raio
                    //adiciona ao array o objeto criado c1 no indece livre dentro do array
                    array[index] = c1;
                    //assim soma +1 para o index e passa para o proximo indece livre
                    index++;
                    System.out.println("Circulo criado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o valor do lado: ");
                    float lado1 = entrada.nextFloat();
                    //pede ao usuario o valor do lado 
                    Quadrado q1 = new Quadrado(lado1);
                    //e cria o objeto Quadrado como parametro o lado
                    //adiciona o objeto no array no indece livre
                    array[index] = q1;
                    //soma +1 ao index
                    index++;
                    System.out.println("Quadrado criado com sucesso!");
                    break;
                case 4:
                    System.out.println("====== AREAS ======");
                    //for que percorre cada figura(elemento) do tipo Quadrilatero que estao dentro do array(colecao)
                    for(Quadrilatero figura: array){
                        //e assim efetura o chamado do metodo de cada figura criada dentro do array, e fazendo o calculo e printando
                        System.out.println("Area de é: "+figura.calcularArea());
                    }
                    break;
                case 5:
                    System.out.println("====== Perimetros ======");
                    //for que percorre cada figura(elemento) do tipo Quadrilatero que estao dentro do array(colecao)
                    for(Quadrilatero figura: array){
                        //e assim efetura o chamado do metodo de cada figura criada dentro do array, e fazendo o calculo e printando
                        System.out.println("Perimero de é: "+figura.calcularPerimetro());
                    }
                    break;
            }
        } while (opc!=0);
        entrada.close();
    }
}
