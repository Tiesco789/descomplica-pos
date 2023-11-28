public class Poupanca extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo: " + this.getSaldo());
    }

    @Override
    public void creditoFinal() {
        throw new UnsupportedOperationException("Unimplemented method 'creditoFinal'");
    }
}
