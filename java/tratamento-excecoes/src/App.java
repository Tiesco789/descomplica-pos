import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite um valor inteiro: ");

            int num1 = entrada.nextInt();
            System.out.println(num1);
        } catch (Exception ex) {
            System.out.println("Erro, valor digitado não é um número inteiro");
        }
    }
}
