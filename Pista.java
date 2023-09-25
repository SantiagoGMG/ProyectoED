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
        
        addObject(new Auto(), 536, 576);
        addObject(new Auto(), 481, 576);
        addObject(new Auto(), 424, 576);
        addObject(new Auto(), 361, 576);
        addObject(new Auto(), 298, 576);
        addObject(new Auto(), 235, 576);
        addObject(new Auto(), 176, 576);
        addObject(new Auto(), 115, 576);
        
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Marcador marcador = new Marcador();
        addObject(marcador,776,300);
    }
}
