public class ListaSimple {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int longitud;

    public ListaSimple() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void insertar(Nodo nuevoNodo) {
        if (primerNodo == null) {
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
    public void actualizarLista() {
        boolean cambioNecesario = false;
        Nodo nodoPorCambiar = primerNodo, anterior = null;
        // Revisa desde el primer auto hasta el penultimo para comparar si su posicion debe ser actualizada
        for (int i = 0; i < longitud - 2; i++) {
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
            if (anterior == null) 
            {
                primerNodo = primerNodo.getSiguiente();
                nodoPorCambiar.setSiguiente(nodoPorCambiar.getSiguiente().getSiguiente());
                primerNodo.setSiguiente(nodoPorCambiar);
            } else 
            { 
                anterior.setSiguiente(nodoPorCambiar.getSiguiente());
                nodoPorCambiar.setSiguiente(nodoPorCambiar.getSiguiente().getSiguiente());
                anterior.getSiguiente().setSiguiente(nodoPorCambiar);
                if(nodoPorCambiar.getSiguiente() == null)
                    ultimoNodo = nodoPorCambiar;
            }
        }
    }

    public int longitud(){
        return longitud;
    }
}