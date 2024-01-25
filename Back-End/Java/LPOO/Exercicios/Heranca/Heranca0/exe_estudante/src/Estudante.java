import java.util.Scanner;

public class Estudante {
    Scanner entrada = new Scanner(System.in);

    private String nome;
    private int matricula;
    private String endereco;
    private float[] notas;


    //Construtor
    public Estudante(String n,int m,String e){
        this.nome = n;
        this.matricula = m;
        this.endereco = e;
        this.notas = new float[4];
    }
    //metodos personalizados
    public void criarEstudante(){

        System.out.println("Digite o nome do estudante: ");
        nome = entrada.nextLine();
        System.out.println("Digite a matricula do estudante: ");
        matricula = entrada.nextInt();
        System.out.println("Digite o enderesso do estudante: ");
        endereco = entrada.nextLine();

        this.setNome(nome);
        this.setMatricula(matricula);
        this.seetEnde(endereco);
    }
    

    //metodos especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }


    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }


    public String getEnde(){
        return this.endereco;
    }
    public void seetEnde(String e){
        this.endereco = e;
    }


    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }

}
