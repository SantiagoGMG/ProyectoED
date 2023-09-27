import greenfoot.*; 
//Esta clase representa cada bloque del marcador, a cada nodo se le asigna
//el auto al que representa
public class Nodo extends Actor
{
    private String nombre;
    private Nodo siguiente;
    private GreenfootImage imagen;
    private Auto auto;
    
    public Nodo(Auto auto) 
    {
        this.auto = auto;
        nombre = auto.getNombre();
        imagen = new GreenfootImage("nodos/" + nombre + ".png");
        setImage(imagen);
        this.siguiente = null;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() 
    {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) 
    {
        this.siguiente = siguiente;
    }
    
    public Auto getAuto()
    {
        return auto;
    }
    
    
}
