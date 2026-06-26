package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
      lista.eliminarPorIndice(2);
      lista.metodoImprimir();
      lista.eliminarAlFinal();
      lista.metodoImprimir();
      lista.eliminarInicio();
      lista.metodoImprimir();

    }
}