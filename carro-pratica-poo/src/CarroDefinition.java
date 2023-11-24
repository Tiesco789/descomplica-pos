public class CarroDefinition extends Carro {
    public CarroDefinition(String marca, String modelo, int ano, String versao) {
        super(marca, modelo, ano, versao);
    }

    public void mostrarCarroChevrolet() {
        String[][] carroArray = mostrarCarro();

        System.out.println("Carro");
        System.out.println("Marca: " + carroArray[0][0]);
        System.out.println("Modelo: " + carroArray[0][1]);
        System.out.println("Ano: " + carroArray[0][2]);
        System.out.println("Versão: " + carroArray[0][3]);
    }
}
