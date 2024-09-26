// Decorator abstrato que permite a adição de funcionalidades
abstract class CompraDecorator extends CompraBase {
    protected CompraBase compraBase;

    public CompraDecorator(CompraBase compraBase) {
        this.compraBase = compraBase;
    }

    @Override
    public double calcularTotal() {
        return compraBase.calcularTotal();
    }

    @Override
    public void exibirDetalhes() {
        compraBase.exibirDetalhes();
    }
}
