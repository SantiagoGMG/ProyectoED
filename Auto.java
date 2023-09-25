import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Auto extends Actor
{
    private String nombre; //Indica el color del auto
    private static GreenfootImage imagen= new GreenfootImage(25,49);
    
    public Auto(String nombre)
    {
      imagen = new GreenfootImage("coches/" + nombre + ".png");  
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