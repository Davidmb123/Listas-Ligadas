public class Lista {

    public static Nodo ultimo;
    public static Nodo inicio;
    private static int tamaño;
    private static int prioridad=0;
    public Lista(){

    }

//Crear


//Tamaño


//Apilar
    public static void apilar(String nombre,int id) {
        Plato platito=new Plato(prioridad,nombre);
        Nodo nuevo=new Nodo(platito);
            nuevo.siguiente=ultimo;
            ultimo=nuevo;

    }

//Desapilar

    public static void desapilar() {
        if(ultimo==null){
            System.out.println("La lista esta vacia");

        }else{
            ultimo=ultimo.siguiente;

        }

    }

//Imprimir
    public static void imprimir(){
        Nodo puntero=new Nodo();
        puntero=ultimo;
        while(puntero!=null){
            System.out.println(puntero.platito.color);
            puntero=puntero.siguiente;

        }
    }
    public static void main(String[] args) {
        apilar("Rojo",23);
        apilar("Verde",213);
        apilar("Azul",34);
        apilar("Morado",43);
        apilar("negro",214);
        imprimir();
    }
}
