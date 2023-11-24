
public class ContaCorrente extends Conta {
    double valor;

    @Override
    public void creditoFinal() {
        System.out.println("Credito: " + this.getCredito());
    }

    @Override
    public void imprimirExtrato() {}
}
