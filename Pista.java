import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pista extends World
{
    
    public Pista()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        

        
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Marcador marcador = new Marcador();
        addObject(new Auto("rojo"), 536, 576);
        addObject(new Auto("verde"), 481, 576);
        addObject(new Auto("azul"), 424, 576);
        addObject(new Auto("amarillo"), 361, 576);
        addObject(new Auto("blanco"), 298, 576);
        addObject(new Auto("negro"), 235, 576);
        addObject(new Auto("morado"), 176, 576);
        addObject(new Auto("naranja"), 115, 576);
        addObject(marcador,776,300);
    }
}
