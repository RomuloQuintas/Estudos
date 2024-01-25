package Q2;

import java.util.Scanner;

public class Retangulo {

    Scanner entrada = new Scanner(System.in);

    private Double base;
    private Double area;
    private Double altura;
    private Double perimetro;
    
    
    //metodos personalizados
    public void criarRetan(){
        System.out.print("Base: ");
        base = entrada.nextDouble();
        System.out.print("Altura: ");
        altura = entrada.nextDouble();
    }
    public void calArea(){
        this.setArea((getBase()*getAlt()));
        System.out.println("Area: "+area);
    }
    public void calPeri(){
        this.setPeri(2*(getBase()+getAlt()));
        System.out.println("perimetro: "+this.getPeri());
    }

    //metodos especiais
    public Double getBase(){
        return this.base;
    }
    public void setBase(Double b){
        this.base = b;
    }
    public Double getAlt(){
        return this.altura;
    }
    public void setAlt(Double h){
        this.altura = h;
    }
    public Double getPeri(){
        return this.perimetro;
    }
    public void setPeri(Double p){
        this.perimetro = p;
    }
    public Double getArea(){
        return this.base;
    }
    public void setArea(Double a){
        this.area = a;
    }
    
}
