import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Auto extends Actor
{
    private String nombre; //Indica el color del auto
    private static GreenfootImage imagen;
    
    public Auto(String nombre)
    {
        this.nombre = nombre;
        imagen = new GreenfootImage("coches/" + nombre + ".png");
        setImage(imagen);
    }
    public void act()
    {   
        velocidad();
        mover();
    }

    public int velocidad()
    {
        //genera numeros dentro del rango 0 a 4 y ese es el valor del movimiento del carro
        int velocidad = (int)(Math.random() * ( 4-0+1)+1);
        return velocidad;
    }
    
        public void mover()
    {
        setLocation(getX(),getY()-velocidad());
    }
    public String getNombre()
    {
        return nombre;
    }
}