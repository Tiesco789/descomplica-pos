abstract class Conta {
    private double saldo;
    private double credito;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public abstract void imprimirExtrato();
    
    public abstract void creditoFinal();
}
