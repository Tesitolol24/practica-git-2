public class Persona {
    String nombre;
    String apellido;
    public void ObtenerNombre(){
        System.out.println(nombre+ " " + apellido);
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
