import java.util.Scanner;

public class Cal{

    public static void main(String[] args) {
        
    
    Scanner entrada = new Scanner(System.in);

    Num n1 = new Num();
    Num n2 = new Num();
    Num res = new Num();

    System.out.print("Digite o valor 1: ");
    n1.setValor(entrada.nextInt());

    System.out.print("Digite o valor 2: ");
    n2.setValor(entrada.nextInt());

    res.setValor(n1.getValor()+n2.getValor());
    System.out.println("O resultado é: "+res.getValor());

    }
}