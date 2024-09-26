// Implementação do decorator que aplica o cupom de desconto
class CompraComDesconto extends CompraDecorator {
    private double desconto;

    public CompraComDesconto(CompraBase compraBase, double desconto) {
        super(compraBase);
        this.desconto = desconto;
    }

    @Override
    public double calcularTotal() {
        double total = super.calcularTotal();
        return total - (total * desconto / 100);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Desconto aplicado: " + desconto + "%");
        System.out.println("Total com desconto: R$" + calcularTotal());
    }
}
