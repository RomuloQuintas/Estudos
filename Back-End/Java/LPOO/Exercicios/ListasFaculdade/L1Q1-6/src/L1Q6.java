import java.util.Scanner;

public class L1Q6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int acima = 0;
        int ideal =0;
        int abaixo = 0;
        int i = 0;

        while (i<5){
            
            System.out.print("Digite o peso: ");
            double peso = entrada.nextDouble();
    
            System.out.print("Digite a altura: ");
            double altura = entrada.nextDouble();
    
            double imc = peso/(altura*altura);

            if (imc<18.5) {
                abaixo = abaixo +1;
            }
            else if (imc>18.5&&imc<25) {
                ideal = ideal + 1;
            }
            else if (imc>18.5) {
                acima = acima + 1;
            }

            i = i+1;
        }
        System.out.println(acima+" pessoas acima do peso, "+ideal+" pessoas dentro do peso ideal e "+abaixo+" pessoas abaixo do peso.");
        entrada.close();
    }
}
