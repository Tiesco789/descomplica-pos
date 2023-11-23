import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bandas = new ArrayList<>();

        bandas.add("Kiss");
        bandas.add("Metallica");
        bandas.add("Iron Maiden");
        System.out.println("Bandas adicionadas: " + bandas);

        bandas.add(bandas.indexOf("Kiss"), "Fu Manchu");
        System.out.println("Banda adicionada a lista posteriormente: " + bandas);

        bandas.remove("Kiss");
        System.out.println("Banda removida: " + bandas);

        bandas.clear();
        System.out.println("Lista de bandas limpa: " + bandas);
    }
}
