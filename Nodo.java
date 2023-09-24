import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//Esta clase representa cada bloque del marcador, a cada nodo se le asigna
//el auto al que representa
public class Nodo extends Actor
{
    private String nombre;
    private Nodo siguiente, anterior;
    private GreenfootImage imagen;
    private Auto auto;
    
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
}
