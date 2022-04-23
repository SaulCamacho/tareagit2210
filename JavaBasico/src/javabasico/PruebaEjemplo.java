package javabasico;

public class PruebaEjemplo {

    
    private int idCliente;
    private String nombre;
    private float balance;

    public PruebaEjemplo() {
    }

    public PruebaEjemplo(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PruebaEjemplo{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }

    public static void main(String[] args) {
        /*Se debe crear un arreglo de 5 cuentahabientes con datos de ejemplo
              y con un FOR EACH deben mostrar quien es Premium y quien es Regular*/
        Cuentahabiente[] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente(1, "Merino", 52000.00f);
        lista[1] = new Cuentahabiente(3, "Karina", 30000.00f);
        lista[2] = new Cuentahabiente(2, "Fernando", 60000.00f);
        lista[3] = new Cuentahabiente(5, "Mariana", 2000.00f);
        lista[4] = new Cuentahabiente(4, "Ignacio", 35000.00f);

        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println("Nombre: " + cuentahabiente.getNombre());
        //    System.out.println("Saldo: "+cuentahabiente.getBalance());
            if (cuentahabiente.getBalance() >= 50000.00f) {
                System.out.println("Cliente Premium");
            } else {
                System.out.println("Cliente Regular");
            }
            System.out.println("------------------------");
        }
    }
}
