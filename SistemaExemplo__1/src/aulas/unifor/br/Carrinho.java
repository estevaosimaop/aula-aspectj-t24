package aulas.unifor.br;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}