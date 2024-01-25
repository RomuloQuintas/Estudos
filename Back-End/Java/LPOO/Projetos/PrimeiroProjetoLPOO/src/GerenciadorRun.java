//importacao dos utilitarios
import java.util.Scanner;
import java.util.ArrayList;

//declaracao da classe main
public class GerenciadorRun {
    public static void main(String[] args) {

        //declaracao do utilitario scanner 
        Scanner sc = new Scanner(System.in);

        //declaracao dos dois ArrayList dos dois tipos de produto
        ArrayList<ProdutoProprio> produtoProprio = new ArrayList<>();
        ArrayList<ProdutoTerceirizado> produtoTerceirizado = new ArrayList<>();

        //declaracao da opcao que sera digitada pelo usuario
        int opc;
        do {
            //menu
            System.out.println("\n ~~~~~~~~~ Digite uma das opcoes: ~~~~~~~~~ \n");
            System.out.println("           1 - Cadastrar produto");
            System.out.println("           2 - Registro de venda");
            System.out.println("           3 - Controle de reposicao");
            System.out.println("           4 - Relatorio estoque");
            System.out.println("           5 - Visualizar de estoque");
            System.out.print("           0 - Sair\n\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \n -> ");
            
            //atribuicao da opcao
            opc = sc.nextInt();

            //switch a opcao digitada pelo usuario
            switch(opc){
                case 1:

                    //tratamento por excecao
                    try {

                        //perguntando ao usuario qual o tipo de produto que sera cadastrado e atribuindo em uma variavei "tipo"
                        System.out.println(" ~~~~~~~~~ Qual o tipo do produto:  ~~~~~~~~~ ");
                        System.out.println(" 1 - Produto proprio");
                        System.out.print(" 2 - Produto terceizado\n -> ");
                        int tipo = sc.nextInt();
                        if(tipo!=1 && tipo!=2){
                            System.out.println("\n=-=-=-= Digite um tipo de produto valido. =-=-=-=");
                            break;
                        }

                        //pedindo ao usuario as informacoes do produto
                        System.out.print("Digite o nome do produto: ");
                        String nome = sc.next();
                        System.out.print("Digite o preco do produto: ");
                        Double preco = sc.nextDouble();
                        System.out.print("Digite a quantidade do produto: ");
                        int quantidade = sc.nextInt();

                        //verificando o a variavel "tipo" e deternado se vai pedir ao usuario o fornecedor caso o produto seja terceirizado
                        if(tipo==1){
                            String fornecedorPro = "Fornecedor proprio.";
                            ProdutoProprio pp = new ProdutoProprio(nome, preco, quantidade, fornecedorPro);
                            produtoProprio.add(pp);
                            System.out.println("\n =-=-=-= Produto proprio cadastrado com sucesso. =-=-=-=");
                        }if(tipo==2){
                            System.out.print("Digite o fornecedor: ");
                            String fornecedorTer = sc.next();
                            ProdutoTerceirizado pt = new ProdutoTerceirizado(nome, preco, quantidade, fornecedorTer);
                            produtoTerceirizado.add(pt);
                            System.out.println("\n =-=-=-= Produto terceirizado cadastratrado. =-=-=-=");
                        }
                    
                    //caso aconteca uma excecao sera emido uma mesagem "ERRO:" junto com a descricao da excecao captada
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;

                case 2:
                    //tratamento por excecao
                    try {
                        //declaracao de variaveis do tipo boleana para veficar se o produto consta em uma das listas do produtos
                        boolean produtoEncontradoP = false;
                        boolean produtoEncontradoT = false;
                        
                        //pede ao usuario o nome do produto varre a primeira lista do produtos proprios
                        //caso nao encontre nao sera mais varrido a lista dos produtos terceirizados
                        //mudando a variavel "produtoEncontradoP" para true
                        System.out.print("\nDigite o nome do produto: " );
                        String nomeVenda = sc.next();
                        for(ProdutoProprio produtoP : produtoProprio){
                            if(produtoP.getNome().equals(nomeVenda)){
                                System.out.print("Digite a quantidade que sera vendida: ");
                                int quantidadeVenda = sc.nextInt();
                                produtoP.registrarVenda(quantidadeVenda);
                                produtoEncontradoP = true;
                                break;
                            }
                            //caso nao seja econtrado emitido essa notificacao
                            if(!produtoEncontradoP){
                                System.out.println("\n=-=-=-= Produto nao consta na lista dos produtos proprios. =-=-=-=");
                            }
                        }
                        
                        //varrendo a lista dos produtos terceirizado e caso nao seja encontrado em nenhuma das listas emitirar uma notificacao
                        if(!produtoEncontradoP){
                            for(ProdutoProprio produtoT : produtoProprio){
                                if(produtoT.getNome().equals(nomeVenda)){
                                    System.out.print("Digite a quantidade que sera vendida2: ");
                                    int quantidadeVenda = sc.nextInt();
                                    produtoT.registrarVenda(quantidadeVenda);
                                    produtoEncontradoT = true;
                                    break;
                            }
                            if(!produtoEncontradoP&&!produtoEncontradoT){
                                System.out.println("\n=-=-=-= Produto nao consta na lista dos produtos terceirizados. =-=-=-=");
                            }
                            }
                        }
                    
                    //caso aconteca uma excecao sera emido uma mesagem "ERRO:" junto com a descricao da excecao captada
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                        }
                    break;

                case 3:
                    //tratamento por excecao
                    try {
                        
                        //pequeno menu
                        System.out.println("\n ~~~~~~~~~~ OBS: Limide de quantidade minima = 10 unidades ~~~~~~~~~~");
                        System.out.println("\n ~~~~~~~~~~ Produtos com alerta de quantidade baixa:  ~~~~~~~~~~\n");
                        
                        //chama o metodo que verre as lista verificando os estoques de cada produto para a reposicao
                        //caso algum produto esteja abaixo do limite do estoque sera emitido uma notificacao
                        for(ProdutoProprio produto : produtoProprio){
                            produto.controleReposicao();
                        }
                        for(ProdutoTerceirizado produto : produtoTerceirizado){
                            produto.controleReposicao();
                        }
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    
                    //caso aconteca uma excecao sera emido uma mesagem "ERRO:" junto com a descricao da excecao captada
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;

                case 4:
                    //tratamento por excecao
                    try {

                        //chama os metodos que varre as duas listas informando apenas o nome e a quantidade restande do produto
                        System.out.println("\n ~~~~~~~~~~ Relatorio do estoque atual: ~~~~~~~~~~\n");
                        for(ProdutoProprio produto : produtoProprio){
                            produto.relatorioEstoque();
                        }
                        for(ProdutoTerceirizado produto : produtoTerceirizado){
                            produto.relatorioEstoque();
                        }

                    //caso aconteca uma excecao sera emido uma mesagem "ERRO:" junto com a descricao da excecao captada
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                    }
                    break;

                case 5:

                    //tratamento por excecao
                    try {

                        //chama o metodo que varre as listas informando todos os detalhes dos dois tipos de produtos
                        System.out.println("\n ~~~~~~~~~~ Vuzualizao estoque atual: ~~~~~~~~~~\n");
                        for(ProdutoProprio produto : produtoProprio){
                            produto.visualizarEstoque();
                        }
                        for(ProdutoTerceirizado produto : produtoTerceirizado){
                            produto.visualizarEstoque();
                        }
                    
                    //caso aconteca uma excecao sera emido uma mesagem "ERRO:" junto com a descricao da excecao captada
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                    }
            }
        } while (opc!=0);
        sc.close();
    }
}
