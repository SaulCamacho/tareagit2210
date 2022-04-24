package arraysobjetos;

public class PruebaEjemplo {

    public static void main(String[] args) {
        Cuentahabiente clientes[] = new Cuentahabiente[5];
        clientes[0] = new Cuentahabiente(1, "Felipe", 1000.00f);
        clientes[1] = new Cuentahabiente(5, "Pedro", 100000.00f);
        clientes[2] = new Cuentahabiente(3, "Maria", 25600.00f);
        clientes[3] = new Cuentahabiente(2, "Juan", 50289.00f);
        clientes[4] = new Cuentahabiente(4, "Karina", 56402.00f);
        
        
        for (Cuentahabiente registro : clientes) {
            System.out.println(registro.getNombre()+": "+registro.evaluarNivelCliente());
            System.out.println("-------------------------");
        }
        
    }
    
}
