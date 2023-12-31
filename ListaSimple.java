public class ListaSimple 
{
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int longitud;

    public ListaSimple() 
    {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void insertar(Nodo nuevoNodo) 
    {
        if (primerNodo == null) 
        {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo; // Si la lista esta vacia, el ultimo nodo es el primero
        } else {
            ultimoNodo.setSiguiente(nuevoNodo); // El siguiente del ultimo nodo es el nuevo nodo 
            ultimoNodo = nuevoNodo; // El nuevo nodo se convierte en el ultimo nodo
        }
        longitud++;
    }
    
    /*Verifica si un auto ha rebasado al auto siguiente y actualiza su lugar en la lista de la siguiente manera:
     * 1 - Se guarda en una variable el nodo que se va a cambiar (nodoPorCambiar) y el nodo anterior a este (anterior)
     * 2 - El nodo anterior ahora hara referencia al nodo que va despues del nodo a cambiar
     * 3 - El nodo a cambiar cambia su referencia al nodo siguiente del nodo que acaba de "rebasar"
     * 4 - El nodo que representa al auto que acaba de ser rebasado, ahora hace referencia al nodo que lo rebaso
     */
    public void actualizarLista() 
    {
        boolean cambioNecesario = false;
        Nodo nodoPorCambiar = primerNodo, anterior = null;
        int yActual,yNuevo;
        // Revisa desde el primer auto hasta el penultimo para comparar si su posicion debe ser actualizada
        for (int i = 0; i < longitud - 1; i++) 
        {
            if (nodoPorCambiar.getAuto().getY() < nodoPorCambiar.getSiguiente().getAuto().getY()) 
            {
                cambioNecesario = true;
                break;
            }
            anterior = nodoPorCambiar;
            nodoPorCambiar = nodoPorCambiar.getSiguiente();
        }
        
        if(cambioNecesario)
        {
            yActual = nodoPorCambiar.getY();
            yNuevo = nodoPorCambiar.getSiguiente().getY();
            
            if (anterior == null) 
            {
                primerNodo = primerNodo.getSiguiente();
                nodoPorCambiar.setSiguiente(nodoPorCambiar.getSiguiente().getSiguiente());
                primerNodo.setSiguiente(nodoPorCambiar);
                
                nodoPorCambiar.setLocation(790,yNuevo);
                primerNodo.setLocation(790,yActual);
            } else 
            { 
                anterior.setSiguiente(nodoPorCambiar.getSiguiente());
                nodoPorCambiar.setSiguiente(nodoPorCambiar.getSiguiente().getSiguiente());
                anterior.getSiguiente().setSiguiente(nodoPorCambiar);
                
                nodoPorCambiar.setLocation(790,yNuevo);
                anterior.getSiguiente().setLocation(790,yActual);
                if(nodoPorCambiar.getSiguiente() == null)
                    ultimoNodo = nodoPorCambiar;
            }
        }
    }

    public int getLongitud()
    {
        return longitud;
    }
    
    public void eliminar(int indice) 
    {
        if (indice < 0 || indice >= longitud) 
        {
            System.err.println("Indice fuera de rango");
            return;
        }
		
        if (indice == 0)
        {
            // Si el �ndice es 0, el nodo a eliminar es el primer nodo.
            primerNodo = primerNodo.getSiguiente();
        } else 
        {
            // Si el �ndice no es 0, encontramos el nodo anterior al nodo a eliminar.
            Nodo nodoAnterior = primerNodo;
            for (int i = 0; i < indice - 1; i++) 
            {
                nodoAnterior = nodoAnterior.getSiguiente();
            }
            // Ahora, el nodo anterior apuntar� al siguiente nodo del nodo a eliminar.
            Nodo nodoEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoEliminar.getSiguiente());
        }
        longitud--;
    }
}