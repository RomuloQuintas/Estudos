package Q2;
public class Pessoa{
    //atributos da classe
    private String nome;
    private String dataNascimento;

    //metodo construtor
    public Pessoa(String nome, String dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    //metodos getters e setters de nome e data de nascimento
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    //reescrita do metodo toString erdado da classe Object
    //com o formato melhorado
    @Override
    public String toString(){
        return "Nome: <"+nome+ "> \nData de nascimento: <"+ dataNascimento+">";
    }
}