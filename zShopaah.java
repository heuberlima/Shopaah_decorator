public class zShopaah {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto(1, "Notebook", "Notebook de alta performance", 3000.00, 10);
        Produto produto2 = new Produto(2, "Mouse", "Mouse sem fio", 150.00, 50);

        // Criando usuário
        Usuario usuario = new Usuario(1, "João Silva", "joao.silva@email.com");

        // Criando compra base
        Compra comprabase = new Compra(123, usuario);
        comprabase.adicionarProduto(produto1);
        comprabase.adicionarProduto(produto2);

        // Compra comum (sem desconto)
        CompraBase compraComum = new CompraComum(comprabase);
        System.out.println("Compra comum:");
        compraComum.exibirDetalhes();

        // Aplicando um cupom de desconto de 10%
        CompraBase compraComDesconto = new CompraComDesconto(compraComum, 10.0);
        System.out.println("\nCompra com desconto:");
        compraComDesconto.exibirDetalhes();
    }
}