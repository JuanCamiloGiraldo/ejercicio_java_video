package clases;

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
