import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            
            System.out.println(i);
            
            lista.add(i, i + 1);
        }

        System.out.println(lista.get(4));
    }
}
