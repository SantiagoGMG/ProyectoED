import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Marcador extends Actor
{
    private ListaSimple lista;
    private Auto auto[];
    private Nodo nodo[];
    private int posiciones[] = {510,450,390,330,270,210,150,90}; 
    //Guarda la coordenada en Y donde debe estar cada nodo, va del octavo lugar hasta el primero
    
    public Marcador()
    {
        lista = new ListaSimple();
        auto = new Auto[8];
    }
    
    public Marcador(Auto[] autos)
    {
        lista = new ListaSimple();
        nodo = new Nodo[8];
        auto = autos;
        for(int i = 0; i < 8; i++)
        {
            nodo[i] = new Nodo(auto[i]);
            //getWorld().addObject(nodo[i], 100,100);
            lista.insertar(nodo[i]);
        }
    }
    public void act()
    {
        lista.actualizarLista();
    }
    
}
