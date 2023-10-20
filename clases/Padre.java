package clases;

import java.util.Scanner;
// se pone la clase padre como abstracta, para el método Transacciones, el cuál se modificará en las otras clases.
public abstract class Padre{
// se declara como protegido transacciones, retiro y depósito, mientras que saldo se declara como privada estática.
    protected int transacciones, retiro, deposito; 
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
//operaciones va a contener el bucle en el que se va a mantener el programa.
    public void Operaciones(){
        int bandera = 0;  //bandera funcionará como interruptor junto a los Do while
        int seleccion = 0;  // selección Será donde se almacenará el valor numérico

        //do principal, se va a encargar de mantener el bucle, mientras que la bandera sea diferente de 2 
        do{
        //do interno mantendrá el bucle interno mientras que bandera sea igual a 0 y se modifica al final
        //para continuar con las entradas por teclado de selección.        
            do{
                System.out.println("-------------------------------");
                System.out.println("Por favor seleccione una opción: ");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo");
                System.out.println("    3. Depósito de efectivo");
                System.out.println("    4. Salir");
                System.out.println("-------------------------------");
                seleccion = entrada.nextInt();
    //mantendrá el bucle de mensaje, si selección es menor a 1 o mayor que 4 imprimiendo un mensaje de error
                if(seleccion >= 1 && seleccion <= 4){
                    bandera = 1;
                }
                else{System.out.println("Opcion no disponible, vuelva a intentar, po favor");}
            }while(bandera == 0);
        
    // si la selección está entre el rango permitido, (1 y 4) bandera cambiará su valor a 1, esto para 
    //pasar al buche externo
                if(seleccion == 1){
                    Padre Consultar = new Consulta();
                    Consultar.Transacciones();    //Transacciones es un método abstracto, por lo que 
                }else if(seleccion == 2){         //realizará una acción distinta según de qué clase venga.  
                    Padre Retirar = new Retiro();
                    Retirar.Transacciones();
                }else if(seleccion == 3){
                    Padre Depositar = new Deposito();
                    Depositar.Transacciones();
                }else if (seleccion ==4){   //Si la selección es igual a 4, bandera cambiará su valor a 2 y finalizará el ciclo, junto con el programa;
                    System.out.println("-------------------------");
                    System.out.println("Gracias, vuelva pronto");
                    System.out.println("-------------------------");
                    bandera = 2;
            
                }
                
                }while(bandera != 2);
        }
    
    // metodo para solicitar la cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();

    }
    // metodo para solicitar depósito
    public void Deposito(){
        deposito = entrada.nextInt();    
    }
    //metodo abstracto
    public abstract void Transacciones();
    
    //setter para saldo
    public int getSaldo(){
        return saldo;
    }
    //getter para saldo
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

}