import java.util.Scanner;

public class Opcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r1 = new Retangulo();


        int opc;

        do {
            System.out.println("Digite uma das opcoes:\n");
            System.out.println(" 1 - Digite valor de b e h ");
            System.out.println(" 2 - Calcular area ");
            System.out.println(" 3 - Calcular perimetro: ");
            System.out.println(" 0 - Sair \n");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o valor de b: ");
                    r1.setB(sc.nextDouble());
                    System.out.print("Digite o valor de h: ");
                    r1.setH(sc.nextDouble());
                    System.out.println("Valores de b e h digitados.");
                    
                    break;
                case 2:
                    System.out.println("[Retangulo] Area: "+r1.calArea()); 
                    break;
                case 3:
                    System.out.println("[Retangulo] Perimetro: "+r1.calPerimetro());
                    break;
                
            }

        } while (opc!=0);
        sc.close();
    }
}
