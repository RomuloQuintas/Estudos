package Q1;

import java.util.Scanner;

public class RunFuncionario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        int opc =0;
        do {
            System.out.println("digite uma das opções: ");
            System.out.println(" 1 - Cadastrar novo funcionario");
            System.out.println(" 2 - Exibir funcionarios de alra renda");
            System.out.println(" 0 - sair");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    f1.cadFuncio();
            }
        } while (opc!=0);
    }
    }
    
}
