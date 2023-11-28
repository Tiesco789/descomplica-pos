import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastrar novo carro");

        System.out.println("-------------------------------------------");

        System.out.print("Digite a marca do carro: ");
        String marca = entrada.nextLine();

        System.out.print("Digite a modelo do carro: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite a ano do carro: ");
        int ano = entrada.nextInt();

        System.out.print("Digite a versão do carro: ");
        String versao = entrada.next();

        System.out.println("-------------------------------------------");

        // Exibe detalhes do carro cadastrado
        CarroDefinition carroNovo = new CarroDefinition(marca, modelo, ano, versao);
        carroNovo.mostrarDetalhesChevrolet();

        // Encerra o Scanner
        entrada.close();
    }
}
