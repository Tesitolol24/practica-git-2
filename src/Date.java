import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void isBeforeOrAfterBetweenDates(){
        LocalDate nacimiento = LocalDate.of(1994,02,22);
        LocalDate hoy = LocalDate.now();

        //Esta antes -> before
        System.out.println("\n"+ nacimiento.getYear() + " antes " + hoy.getYear());
        System.out.println(nacimiento.isBefore(hoy));

        //Esta despues -> after
        System.out.println("\n"+ nacimiento.getYear() + " despues " + hoy.getYear());
        System.out.println(nacimiento.isAfter(hoy));

        //Esta despues
    }

    public static void isBeforeOrAfterBetweenTimes(){
        LocalTime tiempoAnterior = LocalTime.of(13,42,22);
        LocalTime tiempoActual = LocalTime.now();

        //Esta antes -> before
        System.out.println("\n"+ tiempoAnterior.getHour() + "hrs antes " + tiempoActual.getHour() + "hrs");
        System.out.println(tiempoAnterior.isBefore(tiempoActual));

        //Esta despues -> after
        System.out.println("\n"+ tiempoAnterior.getHour() + "hrs despues " + tiempoActual.getHour() + "hrs");
        System.out.println(tiempoAnterior.isAfter(tiempoActual));

        //Esta despues
    }

    public static void isBeforeOrAfterBetweenDateAndTime(){
        LocalDateTime fechaTiempoAntes = LocalDateTime.of(1994,02,22,13,42,22);
        LocalDateTime fechaTiempoActual = LocalDateTime.now();

        //Esta antes -> before
        System.out.println("\n"+fechaTiempoAntes.getYear() + " antes " + fechaTiempoActual.getYear()  );
        System.out.println(fechaTiempoAntes.getHour() + "hrs antes " + fechaTiempoActual.getHour() + "hrs");
        System.out.println(fechaTiempoAntes.isBefore(fechaTiempoActual));

        //Esta despues -> after
        System.out.println("\n"+ fechaTiempoAntes.getHour() + "hrs despues " + fechaTiempoActual.getHour() + "hrs");
        System.out.println(fechaTiempoAntes.isAfter(fechaTiempoActual));

        //Esta despues
    }

    public static void measureTheTime() throws InterruptedException {
        Instant ini = Instant.now();
        Thread.sleep(1000);
        Instant fin = Instant.now();
        System.out.println(Duration.between(ini,fin).toMillis() + " Milisegundos");
    }
    public static void periodBetweenDates(){
        LocalDate nacimiento = LocalDate.of(1994,02,22);
        LocalDate actual = LocalDate.now();

        Period period = Period.between(nacimiento,actual);
        System.out.println("Han transcurrido " + period.getYears() + " años y " + period.getMonths() + " meses y " +
                period.getDays() +" dias, desde "+ nacimiento + " hasta " + actual);
    }

    public static void convertDates(){
        String fechaNacimiento = "22/02/1994";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fechaNacimiento,formatter);
        System.out.println(date);
        System.out.println(formatter.format(date));
    }
}
