package clases;
// Sobreescribe transacciones para realizar el retiro, usa la función con @Override Retiro de la clase Padre para 
//sobreescribir el saldo en caso de que el valor sea permitido.
public class Retiro extends Padre{
    @Override
      public void Transacciones(){
      
        System.out.println("------------------------------");
        System.out.println("¿Cuánto deseas retirar?: ");
        System.out.println("------------------------------");
        Retiro();
        if (getSaldo() > retiro){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("------------------------------");
            System.out.println("retiraste " + retiro);
            System.out.println("------------------------------");
            System.out.println("tu saldo actual es" + getSaldo());
        }else{
            System.out.println("------------------------------");
            System.out.println("Saldo Insuficiente");
            System.out.println("------------------------------");
        }

      } 
}
