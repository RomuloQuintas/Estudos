//classe filha herdando da classe pai e implementando da interface
public class ProdutoProprio extends GerenciadorAbstractClass implements GerenciadorInterface{

    //metodo construtor e tambem o cadastrador de produto
    public ProdutoProprio(String nome, double preco, int quantidade, String fornecedor) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setFornecedor(fornecedor);
    }
    
    //reescrevendo os metodos abstratos

    //nesse metodo passando como parametro a quantidade de produtos que sera vendido
    //caso tenha a quantidade suficiente é efetuada a venda e o registro da venda
    @Override
    public void registrarVenda(int quantidadeVenda) {
        if(this.getQuantidade()>=quantidadeVenda){
            this.setQuantidade(this.getQuantidade()-quantidadeVenda);
            System.out.println("Venda registrada com sucesso.");
        }else{
            System.out.println("Quantidade do produto insuficiente.");
        }
    }

    //nesse metodo é percorrido as listas dos produtos na classe main e é emitido um alerta caso 
    //a quantidade de algum produto seja igual ou menor a 10 (10 é o limite minimo de estoque)
    @Override
    public void controleReposicao() {
        if(this.getQuantidade()<=10){
            System.out.println(" ALERTA!!! "+this.getNome()+" Quantidade: "+this.getQuantidade());
        }
    }

    //reescrevendo metodos da interface

    //nesse metodo é percorrido as listas dos produtos na classe main e é relatado o estoque de todos os produtos
    @Override
    public void relatorioEstoque() {
        System.out.println(" | Nome: "+this.getNome()+" |   | Quantidade: "+this.getQuantidade()+" |");
        
    }

    //nesse metodo é percorrido as listas dos produtos na classe main assim visualizando todos os produtos
    //e seus detalhes como preco, nome, quantidade e fornecedor(fornecedor caso nao seja produto proprio 
    //e é mostrada a quantidade idependente da quantidade de cada produto) 
    @Override
    public void visualizarEstoque() {
        System.out.println("\n Nome: "+this.getNome()+"\n Preco: "+this.getPreco()+"\n Quantidade: "+this.getQuantidade()+"\n Fornecedor: "+this.getFornecedor()+"\n");
        
    }
    //optei por varrer a lista dos produtos na classe main para que nao seja preciso importar o ArrayList e o até mesmo o Scanner nessa classe filha
}
