package javabasico;

public class Perro {

private String raza;
private int tamano;
static final String cola = "cola";

    public Perro() {
    }

    public Perro(String raza, int tamano) {
        this.raza = raza;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tamano=" + tamano + '}';
    }
    public void comer(){
        System.out.println("El perro come");
    }
    
    public void ladrar(){
        System.out.println("Wooof Wof");
    }
    
}
