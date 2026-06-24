package org.example;

public class ListaDoble {
    Nodo cabeza;
    Nodo ultimo;
    int tamanio;

    public ListaDoble() {
        this.cabeza = null;
        this.tamanio = 0;
    }


    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (tamanio == 0) {
            cabeza = nuevo;
        }
        else {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
        tamanio++;
    }
}
