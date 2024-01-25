public class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public ListaDupla(No inicio, No fim) {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirInicio(String info){
        No no = new No();
        no.setInfo(info);
        no.setAnterior(null);
        no.setProximo(getInicio());
        if(getInicio() != null){
            inicio.setAnterior(no);
        }
        setInicio(no);
        if(tamanho==0){
            setFim(getInicio());
        }
        tamanho++;
    }

    public void inserirFim(String info){
        No no = new No();
        no.setInfo(info);
        no.setProximo(null);
        no.setAnterior(getFim());
        if(fim != null){
            fim.setProximo(no);
        }
        setFim(no);
        if(tamanho==0){
            setInicio(getFim());
        }
        tamanho++;
    }

    public void removerInicio(){
        if(tamanho==0){
            System.out.println("[]");
        }
        setInicio(inicio.getProximo());
        if(getInicio() != null){
            inicio.setAnterior(null);
        }else{
            setFim(null);
        }
        tamanho--;
    }

    public void removerFim(){
        if(tamanho==0){
            System.out.println("[]");
        }
        setFim(fim.getAnterior());
        if (fim != null){
            fim.setProximo(null);
        }else{
            setInicio(null);
        }
        tamanho--;
    }

    public void inserirMeio(int indece, String info){
        if(indece <= 0){
            inserirInicio(info);
        }else if(indece >= tamanho) {
            inserirFim(info);
        }
        else{
            No local = getInicio();
            for(int i = 0; i < indece-1; i++){
                local = local.proximo;
            }
            No no = new No();
            no.setInfo(info);
            no.setAnterior(local);
            no.setProximo(local.proximo);
            local.proximo = no;
            no.getProximo().setAnterior(no);
            tamanho++;
            
        }
    }
    public void removerMeio(int indece){
        if(indece < 0 || indece >= tamanho || inicio == null){
            System.out.println("Elementos inexiste na lista");
        }else if (indece == tamanho-1){
            removerFim();
        }else if(indece == 0){
            removerInicio();
        }
        No local = getInicio();
        for(int i = 0; i < tamanho; i++){
            local = local.getProximo() ;
        }
        if(local.getAnterior() != null){
            local.getAnterior().setProximo(local.getProximo());
        }
        if(local.proximo != null){
            local.getProximo().setAnterior(local.getAnterior());
        }
        tamanho--;
    }

    @Override
    public String toString(){
        String str= "(" +tamanho+") ";
        No local = inicio;
        while(local != null){
            str += local.getInfo()+" ";
            local = local.proximo;
        }
        return str;
    }


    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
