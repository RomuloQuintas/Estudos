
public class ListaCircular{

    //atributos
    private No inicio;

    //metodo tamanho da lista
    public int tamanho(){

        //cria a variavel tamanho que será retornado 
        int tamanho = 0;

        //if verifica se a lista esta vazia atraves do metodo listaVazia()
        //caso nao esteja vazia entra no if
        //caso esteja retorna o tamnho declarado ou seja o 0
        if(!listaVazia()){
            
            //se a lista nao esta vazia possui pelo menos um No
            //assim a variavel ja e incrementada
            tamanho++;

            //cria outra variavel que copia o dado do No inical da lista
            String dado = inicio.dado;

            //enquanto o dado proximo No for diferente da variavel dado
            //percorre a lista ate o ultimo No 
            while(!inicio.proximo.dado.equals(dado)){

                //cada vez que passa para o proximo a variavel tamanho e incrementada
                tamanho++;

                //e assim o ponteiro inicio passa ser o proximo da lista
                inicio = inicio.proximo;
            }
            //ao final do while o ponteiro do inicio aponta para o ultimo da lista
            //mas basta apontar esse ponteiro para o proximo que chegará ao primeiro da lista
            inicio = inicio.proximo;
        }
        //retorna o tamanho da lista estando vazia ou nao
        return tamanho;
    }

    //metodo para printar a lista
    public void printLista(){
        
        System.out.print("Lista ->");

        //verifica se a lista esta vazia
        if(!listaVazia()){

            //pega o tamanho da lista e atribui a varivel tamanho
            int tamanho = tamanho();

            //varre a lista do index 0 ate o final utilizando a variavel tamanho
            for(int i = 0;i<tamanho;i++){
                
                //iprime o dado do no do inicio
                System.out.print(inicio.dado);

                //aponta o ponteiro do incio para o proximo no
                inicio = inicio.proximo;
            }
        }
        System.out.print("Null");
    }

    //metodo para printar o ultimo da lista
    public String printUltimo(){

        //verifica se a lista esta vazia
        if(listaVazia()){
            //se sim retorna null
            return null;

        //caso tenha pelo menos um no entra no else
        }else{
            //atribui o dado do No do inicio da lista para a variavel
            String dado = inicio.dado;

            //enquanto o dado do proximo No for diferente da variavel dado
            while(!inicio.proximo.dado.equals(dado)){
                
                //apontando para o proximo No a cada interacao ate o ultimo
                inicio = inicio.proximo;
            }
            //quando o while acabar o ponterio do inicio ira esta apontando para o ultimo
            //assim pego o dado do ultimo No e passa para a variavel dado
            dado = inicio.dado;

            //passa o ponteiro do inicio para o proximo novamenta para chegar preiro da lista
            inicio = inicio.proximo;

            //retorna dado tendo apenas um No ou varios
            return dado;
        }
    }

    //metodo para printar o primeiro da lista
    public String printPrimeiro(){

        //veridica se a lista esta vazia e se sim retorna null
        if(listaVazia()){
            return null;
        
        //se nao retorna o dado do No apontado como inicio
        }else{
            return inicio.dado;
        }
    }

    //metodo retorna se a lista esta vazia
    public Boolean listaVazia(){
        //se estiver vazia retorna null
        return inicio == null;
    }

    public void addInicio(){

    }
}