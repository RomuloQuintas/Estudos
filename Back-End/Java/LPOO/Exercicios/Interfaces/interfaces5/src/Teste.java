import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Circulo> arrayC = new ArrayList<>();
        ArrayList<Retangulo> arrayR = new ArrayList<>();
 
        int opc;

        do {
            System.out.println("\n 1 - Adicionar circulo");
            System.out.println(" 2 - Adicionar retangulo");
            System.out.println(" 3 - Calcular media das areas");
            System.out.println(" 4 - Calcular media dos perimetros");
            System.out.println(" 0 - Sair\n");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite o valor de pi: ");
                    double pi = sc.nextDouble();
                    System.out.print("Digite o valor de r: ");
                    double r = sc.nextDouble();
                    Circulo c1 = new Circulo();
                    c1.setPi(pi);
                    c1.setR(r);
                    arrayC.add(c1);
                    System.out.println("Circulo adicionado.");
                    break;
                case 2:
                    System.out.print("Digite o valor de b: ");
                    double b = sc.nextDouble();
                    System.out.print("Digite o valor de h: ");
                    double h = sc.nextDouble();
                    Retangulo r1 = new Retangulo();
                    r1.setB(b);
                    r1.setH(h);
                    arrayR.add(r1);
                    System.out.println("Retangulo adicionado.");
                    break;
                case 3:
                    double soma =0;
                    for(Circulo c:arrayC){
                        soma = soma + c.calArea();
                    }
                    for(Retangulo r2 :arrayR){
                        soma = soma + r2.calArea();
                    }
                    int tam = arrayC.size()+arrayR.size();
                    System.out.println("\nMedia das areas: "+soma/tam);
                case 4:
                    double soma1 =0;
                    for(Circulo c3:arrayC){
                        soma1 = soma1 + c3.calPerimetro();
                    }
                    for(Retangulo r3 :arrayR){
                        soma1 = soma1 + r3.calPerimetro();
                    }
                    int tam1 = arrayC.size()+arrayR.size();
                    System.out.println("\nMedia das areas: "+soma1/tam1);
            }
        } while (opc!=0);
        sc.close();
    }
}
