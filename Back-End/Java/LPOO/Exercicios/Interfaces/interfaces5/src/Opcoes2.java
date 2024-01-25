import java.util.Scanner;

public class Opcoes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c1 = new Circulo();


        int opc;

        do {
            System.out.println("\nDigite uma das opcoes:\n");
            System.out.println(" 1 - Digite valor de pi e r ");
            System.out.println(" 2 - Calcular area ");
            System.out.println(" 3 - Calcular perimetro: ");
            System.out.println(" 0 - Sair \n");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o valor de pi: ");
                    c1.setPi(sc.nextDouble());
                    System.out.print("Digite o valor de r: ");
                    c1.setR(sc.nextDouble());
                    System.out.println("Valores de pi e r digitados.");
                    break;
                case 2:
                    System.out.println("\n[Circulo] Area: "+c1.calArea());
                    break;
                case 3:
                    System.out.println("\n[Circulo] Perimetro: "+c1.calPerimetro());
                    break;
                
            }

        } while (opc!=0);
        sc.close();
    }
}

