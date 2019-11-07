public class Lista {


    private static Nodo inicio;
    private static Nodo ultimo;
    private static int tamaño;

    public Lista() {

    }
//Agregar al final

    public static void agregarInicial(Nodo nuevo){
        inicio=nuevo;
        ultimo=nuevo;
    }
    public static void agregar(String nombre, int prioridad) {
        Tarea nuevaTarea = new Tarea(nombre, prioridad);
        Nodo nuevo = new Nodo(nuevaTarea);
        Nodo puntero = inicio;
        int limite=nuevo.tarea.prioridad;
        if(!(inicio==null)) {
            if(!(inicio.tarea.prioridad>limite)){
                while(puntero.siguiente!=null && puntero.siguiente.tarea.prioridad<=limite){
                    puntero=puntero.siguiente;
                }
                nuevo.siguiente=puntero.siguiente;
                puntero.siguiente=nuevo;
            }else{
                nuevo.siguiente=inicio;
                inicio=nuevo;
            }
        }else{
            agregarInicial(nuevo);

        }
    }


    //Eliminar primero
    public static void atender(){
        if(!(inicio==null)){
            inicio=inicio.siguiente;
        }else{
            System.out.println("La lista esta vacia");
        }
    }

    //Imprimir
    public static void  imprimir(){
        Nodo puntero=new Nodo();
        puntero=inicio;
        while(puntero!=null){
            System.out.println(puntero.tarea.nombre);
            puntero=puntero.siguiente;
        }

    }

    public static void main(String[] args) {
        agregar("asda",1);
        agregar("marios",8);
        agregar("adios",1);
        agregar("holass",12);
        agregar("ola",3);
        atender();
        imprimir();

    }




}
