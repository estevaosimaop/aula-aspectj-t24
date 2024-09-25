package aulas.unifor.br;

public class MainClass {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.0);
        Produto produto2 = new Produto("Mouse", 100.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        Pedido pedido = new Pedido(carrinho);
        pedido.processar();
    }
}
