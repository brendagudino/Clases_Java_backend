public class Estudiante {
    String nombre;
    int edad;
    int tam;
    float[] calificaciones = new float [tam];
    public void Agregar(int lugar, float nota){

        calificaciones[lugar]=nota;
    }
    public void Promedio(){
        float acumulador = 0;
        for (int i = 0; i < tam ; i++) {
            acumulador+= calificaciones[i];
        }
        float prom = acumulador/tam;
        System.out.println(" Promedio " + prom);
        System.out.println(" Calificaciones " + calificaciones);
    }
}
