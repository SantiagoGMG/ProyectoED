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
        // Add your action code here.
    }
    public String getNombre()
    {
        return nombre;
    }
}