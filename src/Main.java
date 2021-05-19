public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Persona persona = new Persona("Diego", "Aristizabal");
        persona.ObtenerNombre();

        Calculator calculadora = new Calculator();
        calculadora.setNumber1("10.0");
        calculadora.setNumber2("2.0");
        calculadora.getDivision();
    }
}
