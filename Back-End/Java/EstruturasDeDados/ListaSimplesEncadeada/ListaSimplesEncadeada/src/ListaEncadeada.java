
public class ListaEncadeada {
    private No inicio;
    private No ultimo;
    private int tamanho;


    public void adicionar(Double valor){
        No no = new No();
        if(tamanho==0){
            no.setValue(valor);
            this.inicio = no;
        }else{
            this.ultimo.setProx(no);
        }
        no.setValue(valor);
        this.ultimo = no;
        tamanho++; 
    }

    public String percorrerLista() {

        if(tamanho==0){
            return "[]";
        }
        StringBuffer sb = new StringBuffer();
            sb.append(" [ ");
            No p = inicio;
            while(p != null){
                sb.append(p.getValor()+ ", ");
                p = p.getProx();
            }
            sb.append("]");
            return sb.
            
            
        
        

        
	}
    public int getTamanho() {
        return tamanho;
    }

}
