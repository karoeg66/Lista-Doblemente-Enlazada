package org.example;

public class ListaDoble {
    Nodo cabeza;
    Nodo ultimo;
    int tamanio;
    public int eliminarInicio() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia...");
            return 0;
        }
        int valor = cabeza.valor;
        cabeza = cabeza.siguiente;
        tamanio--;
        if (cabeza != null) {
            cabeza.anterior = null;
        } else {
            ultimo = null;
        }
        return valor;
    }
    public int eliminarAlFinal(){
        if(ultimo == null){
            System.out.println("La lista esta vacia...");
            return 0;
        }
        int valor = ultimo.valor;
        if(cabeza == ultimo){
            cabeza = null;
            ultimo = null;
        }else{
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
        }
        tamanio--;
        return valor;
    }

}
