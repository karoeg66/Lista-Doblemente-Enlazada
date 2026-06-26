package org.example;

public class Main {
    public static void main(String[] args) {
      ListaDoble lista = new ListaDoble();
      lista.insertarAlInicio(5);
      lista.metodoImprimir();
      lista.metodoVaciar();
      lista.metodoImprimir();
      lista.insertarAlInicio(8);
      lista.insertarAlInicio(7);
      lista.insertarAlFinal(10);
      lista.metodoImprimir();
      lista.insertarPorIndice(1,1);
      lista.metodoImprimir();
      int elim1 = lista.eliminarPorIndice(2);
      System.out.println("Valor eliminado: " + elim1);
      lista.metodoImprimir();
      int elim2 = lista.eliminarAlFinal();
      System.out.println("Valor eliminado: " + elim2);
      lista.metodoImprimir();
      int elim3 = lista.eliminarInicio();
      System.out.println("Valor eliminado: " + elim3);
      lista.metodoImprimir();
      boolean vacio = lista.isEmpty();
      if(vacio){
          System.out.println("La lista esta vacia");
      }
      else{
          System.out.println("La lista no esta vacia");
      }
      int tam = lista.size();
      System.out.println("Tamaño de la lista: " + tam);


    }
}