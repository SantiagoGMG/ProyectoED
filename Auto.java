import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Auto extends SmoothMover

{
    private String nombre; //Indica el color del auto
    private static GreenfootImage imagen;
    private int velocidad;
    //int contador=10;
    public Auto(String nombre)
    {
        this.nombre = nombre;
        imagen = new GreenfootImage("coches/" + nombre + ".png");
        setImage(imagen);
         
    }
    public void act()
    {   
        //velocidad();
        //mover();
        move(asignarVelocidad());
        //contador--;
    }

    public int asignarVelocidad()
    {
        /*if (contador==0)
        {
        //genera numeros dentro del rango 0 a 4 y ese es el valor del movimiento del carro
        velocidad = (int)(Math.random() * ( 4-0+1)+1);
        contador = 10;
        return velocidad;

        }*/
        //genera numeros dentro del rango 0 a 4 y ese es el valor del movimiento del carro
        velocidad = (int)(Math.random() * ( 4-0+1)+1);
        return velocidad;
    }
    
    public void mover()
    {
        setLocation(getX(),getY()-asignarVelocidad());
    }
    public String getNombre()
    {
        return nombre;
    }
}