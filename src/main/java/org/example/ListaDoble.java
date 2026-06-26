package org.example;

public class ListaDoble {
    Nodo cabeza;
    int tamanio;

    public int size(){
        int contador = 0;
        Nodo actual = cabeza;

        while(actual != null){
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }


    }
