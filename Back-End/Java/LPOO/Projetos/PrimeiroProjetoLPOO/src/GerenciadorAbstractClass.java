//classe pai abstrata
public abstract class GerenciadorAbstractClass {

    //declaracao de atributos
    private String nome;
    private double preco;
    private int quantidade;
    private String fornecedor;

    //metodos abstratos 
    public abstract void registrarVenda(int quantidadeVenda);
    public abstract void controleReposicao();
    

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        public String getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
