package org.example;

public class ListaDoble {
    Nodo cabeza;
    Nodo ultimo;
    int tamanio;

    public ListaDoble() {
        this.cabeza = null;
        this.ultimo = null;
        this.tamanio = 0;
    }


    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (tamanio == 0) {
            cabeza = nuevo;
            ultimo = nuevo;
        }
        else {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void insertarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (tamanio == 0) {
            cabeza = nuevo;
            ultimo = nuevo;
        }
        else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        tamanio++;
    }
}
