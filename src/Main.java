public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1("10.0");
        calculadora.setNumero2("2.0");
        System.out.println(calculadora.getDivision());
    }
}
