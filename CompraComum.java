// Implementação comum da compra sem desconto
class CompraComum extends CompraBase {
    private Compra compra;

    public CompraComum(Compra compra) {
        this.compra = compra;
    }

    @Override
    public double calcularTotal() {
        return compra.calcularTotal();
    }

    @Override
    public void exibirDetalhes() {
        compra.exibirDetalhes();
    }
}