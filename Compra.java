import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private int idCompra;
    private Usuario usuarioComprador;
    private List<Produto> produtosComprados;
    private Date dataCompra;

    public Compra(int idCompra, Usuario usuarioComprador) {
        this.idCompra = idCompra;
        this.usuarioComprador = usuarioComprador;
        this.produtosComprados = new ArrayList<>();
        this.dataCompra = new Date(); // Data atual
    }

    // Getters e Setters
    public void adicionarProduto(Produto produto) {
        produtosComprados.add(produto);
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtosComprados) {
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Compra #" + idCompra);
        System.out.println("Data da Compra: " + dataCompra);
        System.out.println("Comprador: " + usuarioComprador.getNome());
        System.out.println("Produtos Comprados:");
        for (Produto produto : produtosComprados) {
            System.out.println(produto);
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}