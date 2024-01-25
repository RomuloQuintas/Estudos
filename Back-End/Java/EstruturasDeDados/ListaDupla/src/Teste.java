public class Teste {
    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla(null, null);

        //inseindo elemento no inicio
        //Impressao da lista reescrevendo o toString no print
        lista.inserirInicio("a");
        System.out.println(lista);
        lista.inserirInicio("b");
        System.out.println(lista);
        lista.inserirInicio("c");
        System.out.println(lista);

        //inserindo elementos no fim
        lista.inserirFim("d");
        System.out.println(lista);
        lista.inserirFim("e");
        System.out.println(lista);
        lista.inserirFim("f");
        System.out.println(lista);

        //inserindo elementos no meio
        lista.inserirMeio(2, "g");
        System.out.println(lista);
        lista.inserirMeio(3, "h");
        System.out.println(lista);
        lista.inserirMeio(4, "i");
        System.out.println(lista);

        //removendo elementos do inicio
        lista.removerInicio();
        System.out.println(lista);
        lista.removerInicio();
        System.out.println(lista);
        lista.removerInicio();
        System.out.println(lista);

        //revendo elementos do fim
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        

        //impressao da lista vazia com o contador de elemento (0)

        //inseindo elementos na lista novamente
        lista.inserirInicio("j");
        System.out.println(lista);
        lista.inserirInicio("k");
        System.out.println(lista);
        lista.inserirInicio("l");
        System.out.println(lista);
        lista.inserirInicio("m");
        System.out.println(lista);
        lista.inserirInicio("n");
        System.out.println(lista);
        lista.inserirInicio("o");
        System.out.println(lista);

        //revendo elementos ate que tenha elementos inexistente na lista
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        


        //removendo elementos do meio
        lista.removerMeio(2);
        System.out.println(lista);
        lista.removerMeio(3);
        System.out.println(lista);
        lista.removerMeio(4);
        System.out.println(lista);

    }
}
