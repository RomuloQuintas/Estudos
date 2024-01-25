public class Retangulo implements ObjetoGeometrico{

    double b;
    double h;

    public Retangulo(){
        this.setB(b);
        this.setH(h);
    }
    
    @Override
    public double calArea() {
         return getB()*getH();
    }

    @Override
    public double calPerimetro() {
        return (2*getB())*(2*getH());
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    
}
