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

    public void insertarPorIndice(int valor, int indice) {
        if (indice < 0 || indice > tamanio) {
            System.out.println("El indice es invalido");
            return;
        }
        if (indice == 0){
            insertarAlInicio(valor);
            return;
        }
        if (indice == tamanio) {
            insertarAlFinal(valor);
            return;
        }
        else {
            Nodo puntero = cabeza;
            Nodo nuevo = new Nodo(valor);
            int contador = 0;

            while (contador < indice){
                puntero= puntero.siguiente;
                contador++;
            }
            nuevo.anterior= puntero.anterior;
            nuevo.siguiente=puntero;
            puntero.anterior.siguiente= nuevo;
            puntero.anterior= nuevo;
            tamanio++;
        }
    }
}
