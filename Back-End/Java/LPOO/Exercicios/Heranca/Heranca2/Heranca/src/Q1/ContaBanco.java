package Q1;

import java.util.Scanner;

public class ContaBanco {
    Scanner entrada = new Scanner(System.in);
    private String nome;
    private int num_conta;
    private double saldo;

    //metodos personalizados
    public void sacar(){
        double v;
        System.out.print("Digite o valor para sacar: ");
        v = entrada.nextDouble();
        if(v<getSaldo()){
            this.setSaldo(getSaldo()-v);
            System.out.println("Saque efetuado.");
        } else{
            System.out.println("Saldo insuficiente.");
        }
    }
    //metodos especiais
    public ContaBanco(String nome, int num_conta, Double saldo){
        super();
        this.nome = nome;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }
    public void depositar(){
        Double v;
        System.out.println("Digite o valor para depositar");
        v = entrada.nextDouble();
        this.setSaldo(v+getSaldo());
        System.out.println("Valor depositado com sucesso.");
    }

    public String getNome(){
        return this.nome;
    }
    public void set(String n){
        this.nome = n;
    }
    public int getNum(){
        return this.num_conta;
    }
    public void setNum(int num){
        this.num_conta = num;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(Double s){
        this.saldo = s;
    }
}
