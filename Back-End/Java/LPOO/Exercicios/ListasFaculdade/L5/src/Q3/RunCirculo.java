package Q3;

import java.util.Scanner;

public class RunCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        Circolo c1 = new Circolo();


        do {
            System.out.println("Digite uma das opções:");
            System.out.println(" 1 - Criar circulo");
            System.out.println(" 2 - Calcular área");
            System.out.println(" 3 - Calcular perímetro");
            System.out.println(" 0 - Sair\n");

            menu = entrada.nextInt();

            switch(menu){
                case 1:
                    c1.criarCirculo();
                    break;
                case 2:
                    c1.calArea();
                    break;
                case 3:
                    c1.calPeri();
                    break;
                case 0:
                    break;
            }

            
        } while (menu!=0);


            entrada.close();
    }
    
}
