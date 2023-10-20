package clases;

public class Programa {
    public static void main(String[] args) {
        Padre mensajero = new Consulta(); // se llama consulta desde padre para usar
        mensajero.setSaldo(500);    // Se inicializa el saldo en 500
        mensajero.Operaciones();          // Como se llamó cunsulta, Operaciones va a realizar consulta e iniciará el programa
    }
}
