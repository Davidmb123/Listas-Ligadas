public class Lista {
    public static Nodo inicio;
    public static Nodo ultimo;

    public static void agregarInicial(Nodo nuevo){
        inicio=nuevo;
    }
    public static void agregar(String nombre, int prioridad){
        Tarea tarea= new Tarea(nombre,prioridad);
        Nodo nuevo=new Nodo(tarea);
        Nodo puntero=new Nodo();
        puntero=inicio;
        int limite=nuevo.tarea.prioridad;
        if((inicio==null)){
            agregarInicial(nuevo);
            return;
        }
        while(puntero.siguiente!=null) {
            puntero.anterior=puntero;
            puntero=puntero.siguiente;


        }
        nuevo.anterior=puntero;
        puntero.siguiente=nuevo;
        nuevo=ultimo;


    }

    static void imprimirInv(){
        Nodo puntero=new Nodo();
        puntero=ultimo;
        while(ultimo.anterior!=null)
        {
            System.out.println(puntero.tarea.nombre);
            puntero=puntero.anterior;


        }
    }
    public static void  imprimir(){
        Nodo puntero=new Nodo();
        puntero=inicio;
        while(puntero!=null){
            System.out.println(puntero.tarea.nombre);
            puntero=puntero.siguiente;
        }

    }


    public static void main(String[] args) {
        agregar("davod",3);
        agregar("asd",1);
        agregar("kjlk",2);
        agregar("bnmb",1);
        agregar("asdzxc",1);

        agregar("asdazxc",3);
        imprimir();
        System.out.println(" ");
        imprimirInv();

    }

}
