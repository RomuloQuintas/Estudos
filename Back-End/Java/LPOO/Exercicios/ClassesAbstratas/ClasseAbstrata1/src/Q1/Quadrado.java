package Q1;

//classe estendida da classe Retangulo
//recebendo os mesmo metodos e atributos
//mas no metodo construtor diferencia pois o quadrado tem todos os lado iguais
//assim o super passa como parametro duas vezes o lado e consegui fazer todos os calculos da classe Retangulo
public class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado, lado);
    }
}