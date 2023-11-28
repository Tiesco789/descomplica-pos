class Linguagem {
    public void mostrarInfo() {
        System.out.println("Lingua Portuguesa");
    }
}

class Java extends Linguagem {
    public void mostrarInfo() {
        System.out.println("Linguagem java");
    }
}

public class App {
    public static void main(String[] args) {
        Java j1 = new Java();
        j1.mostrarInfo();
        
        Linguagem l1 = new Linguagem();
        l1.mostrarInfo();
    }
}
