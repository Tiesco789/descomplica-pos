public class App {
    public static void main(String[] args) {
        String primeira = "Java";
        String segunda = "Csharp";
        String terceira = new String("Python");

        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);

        boolean result = primeira.equals(segunda);
        System.out.println(result);

        result = segunda.equals(terceira);
        System.out.println(result);
    }
}
