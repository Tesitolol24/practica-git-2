import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Persona persona = new Persona("Diego", "Aristizabal");
        persona.ObtenerNombre();

        Calculator calculadora = new Calculator();
        calculadora.setNumber1("10.0");
        calculadora.setNumber2("2.0");
        calculadora.getDivision();

        /*Se van a ordenar una lista con el uso de lambdas compareTo*/
        List<Character> list = getCharacters();
        ordenar(list);
    }

    private static List<Character> getCharacters() {
        List<Character> list = new ArrayList<>();
        list.add('J');
        list.add('H');
        list.add('S');
        list.add('I');
        list.add('O');
        return list;
    }

    public static void ordenar(List<Character> lista){
        Collections.sort(lista, Character::compareTo);
        /*Collections.sort(lista, (Character letter1, Character letter2) ->
                letter1.compareTo(letter2));*/
        getListOfLetters(lista);
    }


    public static void getListOfLetters(List<Character> list){
        //Método de referencia
        list.forEach(System.out::println);
        /*Forma convencional
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).charValue());
        }
        Lambda
        list.forEach(letter -> System.out.println(letter));
        */
    }
}
