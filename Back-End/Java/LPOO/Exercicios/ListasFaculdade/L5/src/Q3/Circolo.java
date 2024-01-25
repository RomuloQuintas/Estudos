package Q3;

import java.util.Scanner;

public class Circolo {
    Scanner entrada = new Scanner(System.in);
    Double raio;
    Double area;
    Double perimetro;
    Double pi = 3.14;

    public void criarCirculo(){
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        System.out.println("Circulo criado com sucesso");
    }

    public void calArea(){
        System.out.print("Area: "+(pi*(raio*raio))+"\n");
        
    }
    public void calPeri(){
        System.out.println("Perimetro: "+(2*pi*raio)+"\n");
    }
}
