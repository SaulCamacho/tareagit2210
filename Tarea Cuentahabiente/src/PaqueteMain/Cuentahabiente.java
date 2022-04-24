package PaqueteMain;

public class Cuentahabiente {

    private int idCliente;
    private String nombre;
    private float balance;  //(donde balance es el dinero que tiene ahorrado)

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
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

    public void retirarDinero(float monto) {
        balance = (balance - monto);
    }

    public String evaluarNivelCliente() {
        if (balance <= 50000.00f) {
            return "Cliente Regular";
        } else {
            return "Cliente Premium";
        }
    }
}
