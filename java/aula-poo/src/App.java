public class App {
    public static void main(String[] args) {
        Cao cachorro = new Cao();

        cachorro.setIdade(5);

        if (cachorro.VerificaIdade()) {
            System.out.println("Ele é idoso");
        } else {
            System.out.println("É novinho");
        }
    }
}
