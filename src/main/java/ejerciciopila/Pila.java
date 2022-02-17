/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopila;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Pila {

    ArrayList<Character> lista;
    int tamanio;

    public Pila(int tamanio) {

        this.lista = new ArrayList<>(15);
        this.tamanio = tamanio;

    }

    public void push(char a) {
        if (lista.size() < tamanio) {
            lista.add(a);
        }
    }

    public char pop() {
        char elemento = 0;
        if (tamanio > 0) {
            elemento = lista.get(lista.size() - 1);
            lista.remove(lista.size() - 1);
        }
        return elemento;
    }

    public boolean isVacia() {
        return lista.isEmpty();
    }

    public int numElementos() {
        return lista.size();
    }

    public void rellenar(char[] array) {
        tamanio = array.length;
        for (int i = 0; i < tamanio; i++) {
            push(array[i]);
        }

    }

    public char[] sacarElemento() {
        char[] array = new char[lista.size()];
        for (int i = 0; i < tamanio; i++) {
            array[lista.size() - 1] = pop();
        }
        return array;
    }

    public void mostrarLista() {
        for (Character character : lista) {
            System.out.print(character + ",");
        }
    }

}
