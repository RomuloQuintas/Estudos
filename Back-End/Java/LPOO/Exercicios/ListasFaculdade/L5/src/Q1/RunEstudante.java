package Q1;
import java.util.Scanner;

public class RunEstudante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Estudante e1 = new Estudante();
        
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
                    e1.criarEstudante();
                    break;
                case 2:
                    e1.calMedia();
                    break;
                case 3:
                    e1.obterMatri();
                    break;
                case 4:
                    e1.obterEnde();
                    
            }

        }
        entrada.close();
        
    }

}