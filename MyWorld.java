import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
    }
}
