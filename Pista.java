import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Pista extends World
{
    public static int posicionNodo[] = {510,450,390,330,270,210,150,90}; 
    //Guarda la coordenada en Y donde debe estar cada nodo, va del octavo lugar hasta el primero
    
    public Pista()
    {    
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
        int posicionXAuto[] = {115,176,235,298,361,424,481,536};
        Nodo nodos[] = new Nodo[8];
        Auto autos[] = new Auto[8];
        for(int i = 0; i < 8; i++)
        {
            autos[i] = new Auto(colores[i]);
            addObject(autos[i], posicionXAuto[i], 576);
            
            nodos[i] = new Nodo(autos[i]);
            //addObject(nodos[i], 790, posicionNodo[i]);
        }
        addObject(new Marcador(autos, nodos), 776,300);
        for(int i = 0; i < 8; i++)
            addObject(nodos[i], 790, posicionNodo[i]);
    }
}
