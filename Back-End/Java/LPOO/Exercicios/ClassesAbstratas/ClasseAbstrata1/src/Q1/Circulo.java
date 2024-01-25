package Q1;

//criacao da classe estendida da super-classse abstratas
public class Circulo extends Quadrilatero{
    //definicao do unico atributo que sera usado nos metodos
    private float raio;

    //metodo construtor
    public Circulo(float raio){
        this.raio = raio;
    }
    //metodos getters e setters
    public float getRaio(){
        return this.raio;
    }
    public void setRaio(float raio){
        this.raio = raio;
    }
    //rescrita dos metodos e implementacao do corpo do metodo abstrato
    @Override
    public float calcularArea(){
        float res = 3.14f*(getRaio()*getRaio());
        return res;
    }
    @Override
    public float calcularPerimetro(){
        float res = 2*3.14f*getRaio();
        return res;
    }
}
