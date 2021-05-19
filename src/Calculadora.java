public class Calculadora {
    private String numero1;
    private String numero2;

    public Calculadora() {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getDivision(String numero1, String numero2){
        String resultadoDivision;

        if(convertToDouble(numero2) == 0){
            return resultadoDivision = "No se puede dividir por cero";
        }else {
            double resultado = convertToDouble(numero1) / convertToDouble(numero2);
            return resultadoDivision = "La division es: " + resultado ;
        }
    }

    public static double convertToDouble(String numero){
        return Double.parseDouble(numero);
    }
}
