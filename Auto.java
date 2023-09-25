import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Auto extends SmoothMover

{
    private String nombre; //Indica el color del auto
    private static GreenfootImage imagen;
    private int velocidad;
    private int contador=0;
    private int cambioV=10;
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
        cambioV--;
        //move (cambioDeVelocidad());  
        

        //contador--;
        
    }

    public int asignarVelocidad()
    {
        if (contador==0)
        {
        //genera numeros dentro del rango 1 a 4 y ese es el valor del movimiento del carro
        velocidad = (int)(Math.random() * ( 4-1+1)+1);
        contador = 2;

        //return velocidad;

        }
        if (cambioV==0)
        {
         int operacion = (int)(Math.random() * ( 1-0+1)+0);// de 1 al 0
             if (operacion == 0)
             {
                 cambioV=10;
                 velocidad=velocidad-1;
                 if(velocidad == 0)
                 {
                     cambioV=10;
                     velocidad=1;
                 }
             }
             if (operacion == 1)
             {
                 cambioV=10;
                 velocidad=velocidad+1;
             }
             
        }
        cambioV=10;
        //return velocidad;
        /*//genera numeros dentro del rango 0 a 4 y ese es el valor del movimiento del carro
        velocidad = (int)(Math.random() * ( 4-0+1)+1);*/
        return velocidad;
    }
    
    /*public int cambioDeVelocidad()
    {
        if (cambioV==0)
        {
         int operacion =  (int)(Math.random() * ( 1-0+1)+0); 
             if (operacion==0)
             {
                 cambioV=50;
                 velocidad--;
                 if(velocidad==0)
                 {
                     cambioV=50;
                     return velocidad=1;
                 }
             }else if (operacion == 1)
             {
                 cambioV=50;
                 return velocidad+1;
             }
             
        }
        cambioV=50;
        return velocidad;
    }*/
    
    public void mover()
    {
        setLocation(getX(),getY()-asignarVelocidad());
    }
    public String getNombre()
    {
        return nombre;
    }
}