package Q1;

import java.util.Scanner;

public class Funcionario {
    Scanner entrada = new Scanner(System.in);
    String[] nomes;
    Double[] salarios;
    String[] func_sala_alta;

    public void salarioAlta(String[] nome,Double[] salarios){
        for(int i=0;i<salarios.length;i++){
            if(salarios[i]>5000){
                int index = 0;
                func_sala_alta[index] = nome[i];
                index++;
            }
        }
        System.out.println("Funcionarios com salarios de alta renda: ");
        for(String salario: func_sala_alta){
            System.out.print(salario+" ");
        }
    }
    public void cadFuncio(){
        int index = 0;
        System.out.print("Digite o nome do funcionario: ");
        nomes[index] = entrada.nextLine();
        System.out.print("Digite o salario de "+nomes[index]+": ");
        salarios[index] = entrada.nextDouble();
        index++;
        
    }
    public void menu(){


}
