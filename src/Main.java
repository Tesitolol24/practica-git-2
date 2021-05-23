import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Diego", "Aristizabal");
        persona.getName();

        System.out.println("\nCalculando Division con la instancia de la clase Calculator con el metodo getDivision");
        Calculator calculadora = new Calculator();
        calculadora.setNumber1("10.0");
        calculadora.setNumber2("2.0");
        calculadora.getDivision();

        /*Se van a ordenar una lista con el uso de lambdas compareTo*/
        System.out.println("\nOrdenar las lista de caracteres usando Colletions");
        List<Character> list = getCharacters();
        ordenar(list);

        //Metodos de referencia con objetos
        System.out.println("\nObtener nombre de la clase persona con el metodo getName");
        Persona persona2 = getPersona("Daniel","Aristizabal");
        persona2.getName();

        //Usando Stream
        Stream stream = new Stream();
        System.out.println();
        System.out.println("Limitar lista con solo 3 nombres");
        stream.limitar();
        System.out.println();
        System.out.println("La cantidad de elementos dentro de la lista es: ");
        stream.contar();
    }



    private static Persona getPersona(String name, String lastName) {
        //Crear persona con Lambda
        //IUser user = (x,y) -> new Persona(x,y);
        //Metodo de referencia
        IUser user = Persona::new;
        Persona persona2 = user.create(name,lastName);
        return persona2;
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
