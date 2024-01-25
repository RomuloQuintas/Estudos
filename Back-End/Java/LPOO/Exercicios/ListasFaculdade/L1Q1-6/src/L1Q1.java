import java.util.Scanner;

public class L1Q1 {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int AnoNasc = entrada.nextInt();
        
        System.out.println("Agorao ano atual: ");
        int AnoAtual = entrada.nextInt();

        int Idade = AnoAtual - AnoNasc;

        System.out.println("Voce tem " + Idade + " anos");

        entrada.close();
    
    }
}


