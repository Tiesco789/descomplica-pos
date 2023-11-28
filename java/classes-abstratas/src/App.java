public class App {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        Conta cc = new ContaCorrente();

        cp.setSaldo(5000);
        cp.imprimirExtrato();

        cc.setCredito(1000);
        cc.creditoFinal();
    }
}
