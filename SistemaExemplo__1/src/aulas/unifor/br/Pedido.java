package aulas.unifor.br;

public class Pedido {
    private Carrinho carrinho;

    public Pedido(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void processar() {
        double total = carrinho.calcularTotal();
        if (total > 0) {
            System.out.println("Processando pedido. Total: R$ " + total);
        } else {
            System.out.println("O carrinho está vazio. Adicione produtos antes de processar.");
        }
    }
}
