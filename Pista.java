import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
        String colores[] = {"negro","rojo","verde","morado","amarillo","azul","naranja","blanco"};
        int posicionX[] = {115,176,235,298,361,424,481,536};
        Auto autos[] = new Auto[8];
        for(int i = 0; i < 8; i++)
        {
            autos[i] = new Auto(colores[i]);
            addObject(autos[i], posicionX[i], 576);
        }
        addObject(new Marcador(autos), 776,300);
        //790,90);
        //790,150);
        //790,210);
        //790,270);
        //790,330);
        //790,390);
        //790,450);
        //790,510);
    }
}
