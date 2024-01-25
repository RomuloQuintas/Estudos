package lista;

public class ListaEncadeada<T> {
    private No<T> incio;
    private int tamanho = 0;

    public void addElemento(T elemento){
        No<T> celula = new No<T>(elemento);
        this.incio = celula;
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "listaEncadeada [incio=" + incio + "]";
    }
    
}
