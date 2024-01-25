import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> notas = new ArrayList<Double>();

        int opc;

        do {
            System.out.println("Digite uma das opcoes:");
            System.out.println(" 1 - Adicionar uma nota");
            System.out.println(" 2 - Remover a ultima nota");
            System.out.println(" 3 - Calcular a media");
            System.out.println(" 4 - Mostrar a maior nota");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.print("Digite a nota: ");
                    double nota = sc.nextDouble();
                    notas.add(nota);
                    System.out.println("Nota adicionada.");
                case 2:
                    Boolean vazio1 = notas.isEmpty();
                    if(vazio1==false){
                    System.out.println("Não possui notas.");
                    }
                    else{
                        int ultimo = notas.size() -1;
                        notas.remove(ultimo);
                        System.out.println("Ultima nota removida.");
                    }
                case 3:
                    Boolean vazio = notas.isEmpty();
                    if(vazio==false){
                        System.out.println("Não possui notas.");
                    }
                    else{
                        for(Double nota1 : notas){
                            System.out.println(nota1);
                        }
                    }
                    System.out.println("Media: ");

                case 4: System.out.println("Todas as notas: ");

            }


        } while (opc!=0);
        
    }
}
