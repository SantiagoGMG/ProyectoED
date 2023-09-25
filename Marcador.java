import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Marcador extends Actor
{
    private ListaSimple lista;
    private Auto auto[];
    private Nodo nodo[];
    
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
