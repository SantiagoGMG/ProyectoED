import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Auto extends SmoothMover
{
    private String nombre; //Indica el color del auto
    private static GreenfootImage imagen;
    private int contador=0;
    private double velocidad;
    
    public Auto(String nombre)
    {
        this.nombre = nombre;
        imagen = new GreenfootImage("coches/" + nombre + ".png");
        setImage(imagen);
    }
    
    public void act()
    {    
        cambioVelocidad();
        avanzar();
        contador--;
        eliminarAuto();
        
    }
    
    public void cambioVelocidad()
    {
        if(contador <= 0)
        {
            velocidad = Math.random() * 2 + 0.5;
            contador = 10;
        }
    }
    
    public void avanzar()
    {
        setLocation(getX(), getY()- velocidad);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void eliminarAuto()
    {
        if(getY() == 0)
        {
            getWorld().getObjects(Marcador.class).get(0).getLista().eliminar(getWorld().getObjects(Marcador.class).get(0).getLista().getLongitud()-1);
            getWorld().removeObject(this);
        }
        
    }
}