public class Circulo implements ObjetoGeometrico {
    double pi;
    double r;

    public Circulo(){
        this.setPi(pi);
        this.setR(r);
    }

    @Override
    public double calArea(){
        return (getR()*getR())*getPi();
    }

    @Override
    public double calPerimetro(){
        return 2*getPi()*getR();
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
