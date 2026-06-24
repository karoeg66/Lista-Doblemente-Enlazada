package org.example;

public class ListaDoble {
    Nodo cabeza;
    int tamanio;

    public static void MetodoImprimir(ListaDoble lista) {
        if (lista.cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = lista.cabeza;

        while (actual != null) {
            System.out.print(actual.dato);

            if (actual.siguiente != null) {
                System.out.print(" <-> ");
            }

            actual = actual.siguiente;
        }
        System.out.println();
    }
    }
