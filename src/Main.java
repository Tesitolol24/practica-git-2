public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Persona persona = new Persona("Diego", "Aristizabal");
        persona.ObtenerNombre();

        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1("10.0");
        calculadora.setNumero2("2.0");
        System.out.println(calculadora.getDivision());
    }
}
