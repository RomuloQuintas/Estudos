package lista;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.addElemento(1);

        System.out.println(lista);
        System.out.println("Tamanho da lista = "+lista.getTamanho());

    }
}
