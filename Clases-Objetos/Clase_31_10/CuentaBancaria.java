public class CuentaBancaria {
 int num_cuenta;
 int limextraccionmax;
 int limextraccionmin;

 double saldo;

 public void Retiro(int monto){
  if (monto<saldo){
   if (monto<limextraccionmax && monto>limextraccionmin){
    saldo-=monto;
    System.out.println(" Saldo actual retiro " + saldo);
   }
  }

 }
 public void Depositos(int monto){
    saldo+=monto;
    System.out.println(" Saldo actual deposito " + saldo);
  }



}
