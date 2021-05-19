public class Calculadora {
    private String numero1;
    private String numero2;

    public Calculadora() {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getDivision(){
        String resultadoDivision;

        if(convertToDouble(getNumero2()) == 0){
            resultadoDivision = "No se puede dividir por cero";
        }else {
            double resultado = convertToDouble(getNumero1()) / convertToDouble(getNumero2());
           resultadoDivision = "La division es: " + resultado ;
        }
        return resultadoDivision;
    }

    public static double convertToDouble(String numero){
        return Double.parseDouble(numero);
    }
}
