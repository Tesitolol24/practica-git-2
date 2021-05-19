public class Calculator {
    private String number1;
    private String number2;
    public static final String  DIVIDE_BY_ZERO = "No se puede dividir por cero";
    public static final String RESULT = "La division es: ";

    public Calculator() {
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public void getDivision(){
        if(getDivisorEqualToZero()){
            System.out.println(DIVIDE_BY_ZERO);
        }else {
            double resultado = getNonzeroDenominator();
            System.out.println(RESULT + resultado);
        }
    }

    private double getNonzeroDenominator() {
        return convertToDouble(getNumber1()) / convertToDouble(getNumber2());
    }

    private boolean getDivisorEqualToZero() {
        return convertToDouble(getNumber2()) == 0;
    }

    public static double convertToDouble(String numero){
        return Double.parseDouble(numero);
    }
}
