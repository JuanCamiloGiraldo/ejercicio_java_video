package clases;


/**
 * La clase Consulta es una SubClase de Padre, que sobreescribe la función Transacciones a través
 * de @Override, para mostrar el saldo actual.
 */
public class Consulta extends Padre {
    @Override
    public void Transacciones(){
        System.out.println("---------------------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo() + "Pesos");        
        System.out.println("---------------------------------------------");
    }
}
