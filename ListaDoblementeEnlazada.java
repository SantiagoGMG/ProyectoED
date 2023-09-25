public class ListaDoblementeEnlazada {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int longitud;

    public ListaDoblementeEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.longitud = 0;
    }

    public void insertar(Nodo nuevoNodo) {
        //Nodo nuevoNodo = new Nodo(nombre);
        if (primerNodo == null) {
            primerNodo = nuevoNodo;
            ultimoNodo = nuevoNodo; // Si la lista está vacía, el último nodo es el primero
        } else {
            //nuevoNodo.setAnterior(ultimoNodo); // El nodo anterior al nuevo nodo es el último nodo 
            ultimoNodo.setSiguiente(nuevoNodo); // El siguiente del último nodo es el nuevo nodo 
            ultimoNodo = nuevoNodo; // El nuevo nodo se convierte en el último nodo
        }
        longitud++;
    }

    public String obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Indice fuera de rango");
            return "";
        }
        if(indice == 0){ //Cuando pide el primer nodo se usa la variable del primer nodo
            return primerNodo.getNombre();
        }
        else if(indice == longitud - 1){ //Si pide el ultimo dato, nos apoyamos de la variable ultimoNodo
            return ultimoNodo.getNombre();
        }
        //Dividimos la longitud en 2 para comparar el indice con ese resultado y asi determinar
        //si esta mas cerca del primer nodo o del ultimo nodo
        else if(indice < longitud / 2){ //Cuando el indice esta mas cerca del primer nodo
            Nodo actuaNodo = primerNodo;
            for (int i = 0; i < indice; i++) {
                actuaNodo = actuaNodo.getSiguiente();
            }
            return actuaNodo.getNombre();
        }
        else{ //Cuando el indice esta mas cerca del nodo final
            Nodo actuaNodo = ultimoNodo;
            for (int i = longitud - 1; i > indice; i--) {
                actuaNodo = actuaNodo.getAnterior();
            }
            return actuaNodo.getNombre();
        }

    }

    public void eliminar(int indice) {
        if (indice < 0 || indice >= longitud) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo nodoEliminar;
        if (indice == 0) {
            nodoEliminar = primerNodo;
            primerNodo = primerNodo.getSiguiente();
        } else if (indice == longitud - 1) {
            nodoEliminar = ultimoNodo;
            ultimoNodo = ultimoNodo.getAnterior();
            ultimoNodo.setSiguiente(null);
        } else {
            Nodo nodoActual;
            if (indice < longitud / 2) {
                nodoActual = primerNodo;
                for (int i = 0; i < indice; i++) {
                    nodoActual = nodoActual.getSiguiente();
                }
            } else {
                nodoActual = ultimoNodo;
                for (int i = longitud - 1; i > indice; i--) {
                    nodoActual = nodoActual.getAnterior();
                }
            }
            nodoEliminar = nodoActual;
            nodoActual.getAnterior().setSiguiente(nodoActual.getSiguiente());
            nodoActual.getSiguiente().setAnterior(nodoActual.getAnterior());
        }
        nodoEliminar.setAnterior(null);
        nodoEliminar.setSiguiente(null);
        longitud--;
    }
    
    //Devuelve false si las posiciones de los autos han cambiado
    //Recorre desde el primer nodo hasta el ultimo buscando alguna incoherencia entre
    //la posicion actual del auto y su posicion en el eje Y
    public boolean listaActualizada(Nodo nodo)
    {
        if(nodo.getSiguiente() == null)
            return true;
        else if(nodo.getAuto().getX() > nodo.getSiguiente().getAuto().getY())
            return false;
        else
            return listaActualizada(nodo.getSiguiente());
    }
    
    public void actualizarLista()
    {
        while(true)
        {
            int indice = -1;
            Nodo nodoPorCambiar=primerNodo;
            //Vamos a revisar desde el primer auto para comparar si su posicion
            //debe ser actualizada
            for(int i =0; i< longitud-1; i++){
                if(nodoPorCambiar.getAuto().getY() > nodoPorCambiar.getSiguiente().getAuto().getY())
                {
                    indice = i + 1;
                    break;
                }
                nodoPorCambiar = nodoPorCambiar.getSiguiente();
            }
            /*Para mover un nodo se siguen siguen 3 pasos
             * 1 - El nodo anterior ahora pasa a apuntar al nodo siguiente del nodo actual
             * 2 - Actualizar las referencias del nodo actual, tanto siguiente como anterior
             * 3 - Actualizar ambas referencias del nodo siguiente
             */
            do{
                if(nodoPorCambiar == primerNodo)
                    primerNodo = nodoPorCambiar.getSiguiente();
                else
                    nodoPorCambiar.getAnterior().setSiguiente(nodoPorCambiar.getSiguiente());
                nodoPorCambiar.setSiguiente(nodoPorCambiar.getSiguiente().getSiguiente());
                
                
            }while(nodoPorCambiar.getAuto().getY() > nodoPorCambiar.getSiguiente().getAuto().getY());
                
            
        }
    }

    public int longitud() {
        return longitud;
    }
}