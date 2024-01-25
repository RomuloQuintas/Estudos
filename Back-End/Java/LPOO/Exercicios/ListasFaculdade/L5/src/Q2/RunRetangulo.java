package Q2;

import java.util.Scanner;

public class RunRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        int opc = 6;

        while(opc!=0) {
            System.out.println("\n 1 - Criar retangulo");
            System.out.println(" 2 - Calcular area");
            System.out.println(" 3 - Calcular perimetro");
            System.out.print(" 0 - Sair\n\nDigite a opção: ");
            opc = entrada.nextInt();

            switch(opc){
                case 1:
                    r1.criarRetan();
                    break;
                case 2:
                    r1.calArea();
                    break;
                case 3:
                    r1.calPeri();
                    break;
                case 0:
                    opc=0;
                    break;
            }
        }
        entrada.close();
    } 
}
