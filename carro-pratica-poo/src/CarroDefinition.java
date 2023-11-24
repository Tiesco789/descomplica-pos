public class CarroDefinition extends Carro {
    public CarroDefinition(String marca, String modelo, int ano, String versao) {
        super(marca, modelo, ano, versao);
    }

    // Método específico para mostrar detalhes de um Chevrolet
    public void mostrarDetalhesChevrolet() {

        // Reutiliza o método da classe pai
        mostrarDetalhesCarro(); 
    }
}
