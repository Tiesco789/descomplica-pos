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

    public void setMarca(String brand) {
        this.marca = brand;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String mod) {
        this.modelo = mod;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setAno(int year) {
        this.ano = year;
    }

    public int getAno() {
        return this.ano;
    }

    public void setVersao(String ver) {
        this.versao = ver;
    }

    public String getVersao() {
        return this.versao;
    }

    public String[][] mostrarCarro() {
        String[][] carroArray = new String[1][4];

        carroArray[0][0] = this.marca;
        carroArray[0][1] = this.modelo;
        carroArray[0][2] = String.valueOf(this.ano);
        carroArray[0][3] = this.versao;

        return carroArray;
    }

    public void atualizarCarro(String marca, String modelo, int ano, String versao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.versao = versao;
    }
}
