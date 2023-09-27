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
    
    public Marcador(Auto[] autos, Nodo nodos[])
    {
        lista = new ListaSimple();
        nodo = nodos;
        auto = autos;
        for(int i = 0; i < 8; i++)
        {
            lista.insertar(nodo[i]);
        }
    }
    
    public void act()
    {
        lista.actualizarLista();
    }
    
    public ListaSimple getLista()
    {
        return lista;
    }
}
