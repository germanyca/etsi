public class Alumno {

    int id;
    String nombre;
    String apellido;


    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarNombre(){

        System.out.println("soy un alumno");
    }

    public void saberAprobado (double calificacion){

        if (calificacion >=6) {
            System.out.println("aprobe la materia");
        }else{
            System.out.println("noo aprobe");
        }

    }
}
