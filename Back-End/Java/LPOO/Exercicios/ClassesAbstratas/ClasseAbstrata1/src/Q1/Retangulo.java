package Q1;
//sub-classe extendida da super-classe Quadrilatero
//nao necessariamente a classe estendida tambem venha ser abstrada
public class Retangulo extends Quadrilatero{

    //delcarando os atributos necessarios
    private float lado;
    private float altura;

    //metodo construtor
    public Retangulo(float lado,float altura){
        this.lado = lado;
        this.altura = altura;
    }
    //aqui sera rescrito/implementado os metodos que estao na super-classe
    @Override
    public float calcularArea(){
        float res = getAltura()*getAltura();
        return res;
    }
    @Override
    public float calcularPerimetro(){
        float res = 2*(getLado()+getAltura());
        return res;
    }
    
    //metodos especiais getters e setters
    public float getLado(){
        return this.lado;
    }
    public void setLado(float lado){
        this.lado = lado;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
}
