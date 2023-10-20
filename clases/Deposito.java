package clases;
// Sobreescribe transacciones para realizar el depósito, usa la función con @Override Retiro de la clase Padre para 
//sobreescribir el saldo con el valor depositado.
public class Deposito extends Padre {
   
    @Override
    public void Transacciones(){
        System.out.println("------------------------------");  
        System.out.println("¿Cuánto deseas depositar?");
        System.out.println("------------------------------");  
        Deposito();    
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);

        System.out.println("------------------------------");  
              
        System.out.println("depositaste: " + deposito);
        System.out.println("tu saldo actual es de: " + getSaldo() );
        System.out.println("------------------------------");     
    }
}
