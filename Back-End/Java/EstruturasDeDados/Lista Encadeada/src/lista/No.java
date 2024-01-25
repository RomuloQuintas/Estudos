package lista;

public class No<T>{
    private T elemento;
    private No<T> prox;
    
    public No(T elemento, No<T> prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.prox = null;
    }

    public T getElemento() {
        return this.elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No<T> getProx() {
        return this.prox;
    }
    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No [elemento=" + elemento + ", prox=" + prox + "]";
    }
    
}
