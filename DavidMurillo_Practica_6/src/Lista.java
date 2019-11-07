public class Lista {

    public static int tamaño;
    public static Nodo inicio;
    public static Nodo ultimo;


    public static void  agregarInicial(Nodo nuevo){
        inicio=nuevo;
        ultimo=nuevo;
    }

    public static void agregar(String nombre, int prioridad) {
        Tarea nuevaTarea = new Tarea(nombre, prioridad);
        Nodo nuevo = new Nodo(nuevaTarea);
        Nodo puntero = inicio;
        int limite=nuevo.tarea.prioridad;
        int cont=0;
        if((inicio==null)) {
            agregarInicial(nuevo);
            tamaño++;
            return;

        }
        if((limite>=ultimo.tarea.prioridad)){
            ultimo.siguiente=nuevo;
            nuevo.siguiente=inicio;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            ultimo.siguiente=inicio;
            inicio.anterior=ultimo;
            tamaño++;
            return;
        }
        if(!(inicio.tarea.prioridad>limite)){

                while (cont <tamaño && puntero.siguiente.tarea.prioridad <= limite) {
                    puntero = puntero.siguiente;
                    cont++;
                }
                puntero.siguiente.anterior = nuevo;
                nuevo.siguiente = puntero.siguiente;
                nuevo.anterior = puntero;
                puntero.siguiente = nuevo;

        }else{
            nuevo.anterior=ultimo;
            nuevo.siguiente = inicio;
            inicio.anterior=nuevo;
            inicio = nuevo;
        }

        ultimo.siguiente=inicio;
        inicio.anterior=ultimo;

        tamaño++;
    }

    public static void imprimir()
    {
        Nodo puntero= new Nodo();
        puntero=inicio;
        for(int i=0; i<tamaño;i++){
            System.out.println(puntero.tarea.nombre);
            puntero=puntero.siguiente;
        }
    }
    public static void imprimirInv()
    {
        Nodo puntero=new Nodo();
        puntero=ultimo;
        for(int i=tamaño; i>0;i--){
            System.out.println(puntero.tarea.nombre);
            puntero=puntero.anterior;
        }
    }

    public static void atender(){
        if(!(inicio==null)) {
            inicio=inicio.siguiente;
            inicio.anterior=ultimo;
            ultimo.siguiente=inicio;
            tamaño--;
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    public static void main(String[] args)
    {
        agregar("asd",3);
        agregar("david",2);
        agregar("juan",1);
        agregar("asxz",1);
        agregar("manuel",2);
        agregar("Pedro", 1);
        agregar("gus", 1);

        System.out.println("Lista normal");
        System.out.println("");
        imprimir();
        System.out.println(" ");
        System.out.println("Lista invertida");
        System.out.println("");
        imprimirInv();
    }
}
