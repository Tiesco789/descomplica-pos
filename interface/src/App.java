public class App {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        
        cp.depositar(732);
        cp.sacar(8);
        cp.getSaldo();
    }
}
