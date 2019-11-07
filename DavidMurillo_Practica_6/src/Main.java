public class Main {

    public static void main(String[] args) {
        Lista lista=new Lista();
        lista.agregar("Cetys3",3);
        lista.agregar("Cetys",1);
        lista.agregar("Hola",3);
        lista.agregar("Cetys2",2);
        lista.atender();
        lista.imprimir();
        System.out.println("Lista inversa");

        lista.imprimirInv();
    }


}
