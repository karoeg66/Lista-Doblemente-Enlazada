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
    public int eliminarPorIndice(int indice){
        if(indice < 0 || indice >= tamanio){
            System.out.println("Indice no valido...");
            return 0;
        }
        if(indice == 0){
            return eliminarInicio();
        }
        if(indice == tamanio-1){
            return eliminarAlFinal();
        }
        Nodo puntero = cabeza;
        for(int i = 0; i < indice; i ++){
            puntero = puntero.siguiente;
        }
        int valor = puntero.valor;
        puntero.siguiente.anterior = puntero.anterior;
        puntero.anterior.siguiente = puntero.siguiente;
        tamanio--;
        return valor;
    }

}
