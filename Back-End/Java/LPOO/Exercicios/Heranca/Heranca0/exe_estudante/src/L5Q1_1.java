import java.util.Scanner;

public class L5Q1_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String n;
        int m;
        String e;

        int opc = 6;

        while(opc!=0){
            System.out.println("Digite umas das opções: ");
            System.out.println(" 1 - Criar estudante: ");
            System.out.println(" 2 - Calcular media");
            System.out.println(" 3 - Obter matricular");
            System.out.println(" 4 - Obert enderço");
            System.out.println(" 5 - Sair");
            
            opc = entrada.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Digite o nome do estudando: ");
                    n = entrada.next();
                    System.out.println("Digite a matricula do aluno: ");
                    m = entrada.nextInt();
                    System.out.println("Digite o endereço do estudante: ");
                    e = entrada.next();

                    System.out.println("Digite as 4 notas do estudante: ");
                    
                    float[] notas = new float[4];
                    for(int c = 0;c<3;c++){
                        System.out.println("Digite a "+(c+1)+"º nota: ");
                        notas[c] = entrada.nextFloat();
                    }

                    Estudante estudante = new Estudante(n, m, e);
            }
        entrada.close();
        }
        
    }

}