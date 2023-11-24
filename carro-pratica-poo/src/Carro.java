public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String versao;

    public Carro(String marca, String modelo, int ano, String versao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.versao = versao;
    }

    // Getter e setter para Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter e setter para Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter e setter para Ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter e setter para Versão
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    // Método melhorado para mostrar os detalhes do carro
    public void mostrarDetalhesCarro() {
        System.out.println("Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Versão: " + versao);
    }

    // Método para atualizar detalhes do carro
    public void atualizarDetalhesCarro(String marca, String modelo, int ano, String versao) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setVersao(versao);
    }
}
