package Q2;

//PessoaIMC herda de pessoa atributos metodos getters e setters e o medoto toString 
public abstract class PessoaIMC extends Pessoa {

    //atributudos da classe 
    private double peso;
    private double altura;


    //metodo construtor de classe com todos os atributos usado como parametro
    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        //usando o metodo construtor da super-classe 
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    //getters e setters
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    //metodo personalisado para calcular o IMC que é o peso dividido pela altura ao quadrado
    public double calculaIMC() {
        return peso / (altura * altura);
    }

    //metodo abstrato que retorna do tipo String, que sera implementado nas suas classes filhas
    public abstract String resultIMC();

    //reinscrição do metedo toString chamando o toString da super-classe e complementando
    //com os atributos da classe
    @Override
    public String toString() {
        return super.toString() + "\n" + "Peso: <" + peso + ">\n" + altura + "<";
    }
} 