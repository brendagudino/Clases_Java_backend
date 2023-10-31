public class Persona {

    int edad;
    double altura;

    String nombre;

    String apellido;

    int id;

    public static void Saludar(String nombre, String apellido, int edad){
        System.out.printf("Holis " + nombre + " " + apellido + " " + edad);
    }
    public void Cumplir(){
        edad++;
        System.out.println("Edad" + edad);
    }





}
