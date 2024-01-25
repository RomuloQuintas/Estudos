import java.util.Scanner;

public class L1Q2 {

    public static void main (String[] args) {

        System.out.println("inicio");

        Scanner entrada = new Scanner(System.in);

        double contAltu = 0;

        for (int i=1;i<6;i++) {
            System.out.println("Digite a " + i + "º altura: ");
            double Altu = entrada.nextDouble();

            contAltu = contAltu + Altu;
        }

        double Media = contAltu / 5;
        System.out.println("A media das 5 pessoas é " + Media + ".");
    
        entrada.close();
    }
}