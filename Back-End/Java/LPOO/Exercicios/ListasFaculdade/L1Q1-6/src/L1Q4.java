import java.util.Scanner;

public class L1Q4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        float ContIdade = 0;
        float ContPesso = 0;

        while(num==0) {
            System.out.println("Digite a idade: ");
            int NumDig = entrada.nextInt();

            ContIdade = ContIdade + NumDig;
            ContPesso = ContPesso + 1;

            if (NumDig==0) {
                num = 1;
                ContPesso = ContPesso - 1;
            }
        }
        
        float media = ContIdade / ContPesso;
        System.out.println("Media: "+media);
        

        entrada.close();
        }

    }
    

