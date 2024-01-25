package Q1;
import java.util.Scanner;
import java.util.ArrayList;

public class Estudante {
    Scanner entrada = new Scanner(System.in);

    private String nome;
    private int matricula;
    private String endereco;
    private Double media;
    private ArrayList<Double> notas = new ArrayList<>(4);

    //metodos personalizados
    public void criarEstudante(){

        System.out.println("Digite o nome do estudante: ");
        nome = entrada.nextLine();

        System.out.println("Digite o enderesso do estudante: ");
        endereco = entrada.nextLine();
        
        System.out.println("Digite a matricula do estudante: ");
        matricula = entrada.nextInt();



        for(int i = 0;i<4;i++){
            System.out.println("Digite a "+(i+1)+"ª nota: ");
            double nota = entrada.nextDouble();
            notas.add(nota);

        }
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setEnde(endereco);
    }
    public void calMedia(){
        Double cont = 0.0;
        for(Double nota:notas){
            cont+=nota;
        this.setMedia((cont/4));
        }
        if(this.getMedia()<=7){
            System.out.println("Nota: "+this.getMedia()+" Reprovado. ");
        } else{
            System.out.println("Nota: "+this.getMedia()+" Aprovado. ");
        }

    }
    public void obterMatri(){
        System.out.println("Matricula: "+this.getMatricula());
    }
    public void obterEnde(){
        System.out.println("endereço: "+this.getEnde());
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
    public void setEnde(String e){
        this.endereco = e;
    }

    public Double getMedia(){
        return this.media;
    }
    public void setMedia(Double m){
        this.media = m;
    }

}
