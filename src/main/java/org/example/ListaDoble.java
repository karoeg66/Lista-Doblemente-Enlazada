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

    public int size () {
        return tamanio;
    }

    public boolean isEmpty(){
        return cabeza == null;
    }


    public int eliminarAlFinal () {
        if (ultimo == null) {
            System.out.println("La lista esta vacia...");
            return 0;
        }
        int valor = ultimo.valor;
        if (cabeza == ultimo) {
            cabeza = null;
            ultimo = null;
        } else {
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
        }
        tamanio--;
        return valor;
    }

    public int eliminarPorIndice ( int indice){
        if (indice < 0 || indice >= tamanio) {
            System.out.println("Indice no valido...");
            return 0;
        }
        if (indice == 0) {
            return eliminarInicio();
        }
        if (indice == tamanio - 1) {
            return eliminarAlFinal();
        }
        Nodo puntero = cabeza;
        for (int i = 0; i < indice; i++) {
            puntero = puntero.siguiente;
        }
        int valor = puntero.valor;
        puntero.siguiente.anterior = puntero.anterior;
        puntero.anterior.siguiente = puntero.siguiente;
        tamanio--;
        return valor;
    }


    public void insertarAlInicio ( int valor){
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            ultimo = nuevo;
        } else {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void insertarAlFinal ( int valor){
        Nodo nuevo = new Nodo(valor);
        if (tamanio == 0) {
            cabeza = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        tamanio++;
    }

    public void insertarPorIndice ( int valor, int indice){
        if (indice < 0 || indice > tamanio) {
            System.out.println("El indice es invalido");
            return;
        }
        if (indice == 0) {
            insertarAlInicio(valor);
            return;
        }
        if (indice == tamanio) {
            insertarAlFinal(valor);
            return;
        } else {
            Nodo puntero = cabeza;
            Nodo nuevo = new Nodo(valor);
            int contador = 0;

            while (contador < indice) {
                puntero = puntero.siguiente;
                contador++;
            }
            nuevo.anterior = puntero.anterior;
            nuevo.siguiente = puntero;
            puntero.anterior.siguiente = nuevo;
            puntero.anterior = nuevo;
            tamanio++;
        }
    }

    public void metodoImprimir () {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.valor);

            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }

            actual = actual.siguiente;
        }
        System.out.println();
    }
    public void metodoVaciar () {
        cabeza = null;
        ultimo = null;
        tamanio = 0;
        System.out.println("La lista ha sido vaciada.");
    }
}