

public class Main {
    public static void main(String[] args) {

    CuentaBancaria Cuenta = new CuentaBancaria();
    int monto= 5000;
    Cuenta.saldo=8000;
    Cuenta.limextraccionmax=6000;
    Cuenta.limextraccionmin=100;

    Estudiante E1 =new Estudiante();
    E1.tam = 5;
        for (int i = 0; i < E1.tam; i++) {
            E1.calificaciones[i]=i;
            float nota=E1.calificaciones[i];
            E1.Agregar(i, nota);
        }

    //Cuenta.Retiro(monto);
    //Cuenta.Depositos(100);







    }
}