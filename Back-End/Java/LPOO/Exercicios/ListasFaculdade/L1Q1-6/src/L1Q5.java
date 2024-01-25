import java.util.Scanner;

public class L1Q5 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primero num: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo num: ");
        int num2 = entrada.nextInt();

        System.out.println("Agora a operação aritmética desejada: ");
        String OpeAri = entrada.next();

        switch (OpeAri){
            case "+": System.out.println(num1+num2);
                break;
            case "-": System.out.println(num1-num2);
                break;
            case "*": System.out.println(num1*num2);
                break;
            case "/": System.out.println(num1/num2);
                break;
            default: System.out.println("Operador incorreto.");
        }
        entrada.close();
    }
}
