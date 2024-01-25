package Q2;
//Classe-filha Homem que herda da classe-pai
public class Homem extends PessoaIMC {

    //metodo construtor que usa como parametro tudo que herda 
    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    //reinscrição metodo toString mostrando apenas o resultado do metodo calcularIMC()
    @Override
    public String resultIMC() {
        double imc = calculaIMC();

        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc < 26.4 && imc > 20.7) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
