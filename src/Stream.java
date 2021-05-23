import java.util.ArrayList;
import java.util.List;

public class Stream {
    private static List<String> nombres;

    public static void filtrar(){
        createList();
        nombres.stream().filter(x -> x.startsWith("D")).forEach(System.out::println);

    }

    public static void ordenar(){
        createList();
        nombres.stream().sorted().forEach(System.out::println);
    }
    public static void transformar(){
        createList();
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    public static void limitar(){
        createList();
        nombres.stream().limit(3).forEach(System.out::println);
    }
    public static void contar(){
        createList();
        long c = nombres.stream().count();
        System.out.println(c);
    }

    private static void createList(){
        //Usando Stream de java 8
        nombres = new ArrayList<>();
        nombres.add("Daniel");
        nombres.add("David");
        nombres.add("Natalia");
        nombres.add("Jose");
        nombres.add("Julian");
        nombres.add("Nora");
    }
}
