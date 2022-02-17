/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocancion;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author cristina
 */
public class ListaReproduccion {

    ArrayList<Cancion> canciones;

    public ListaReproduccion() {
        this.canciones = new ArrayList();
    }

    //devuelve el número de canciones de la lista.
    public int numeroCanciones() {
        return canciones.size();
    }

    //devuelve si la lista de reproducción está vacía.
    public boolean estaVacia() {
        if (canciones.size() > 0) {
            return true;
        }
        return false;
    }

    //devuelve la Cancion que se encuentra en la posición indicada.
    public Cancion escucharCancion(int posicion) {
        return canciones.get(posicion);
    }

    //cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
    public void cambiarCancion(int posicion, Cancion cancion) {
        canciones.add(posicion, cancion);
    }

    //agrega al final de la lista la Cancion proporcionada.
    public void grabarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    //elimina la Cancion que se encuentra en la posición indicada.
    public void eliminaCancion(int posicion) {
        canciones.remove(posicion);
    }

    //elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
    public void eliminaCancion(Cancion c) {
        canciones.remove(c);

    }

    //Método de clase que imprime los nombres de las canciones contenidas en tmp.
    public void imprimirLista(ListaReproduccion tmp) {
        for (Cancion cancione : tmp.canciones) {
            System.out.println(cancione);
        }
    }

    //busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra. Usa el método indexOf.
    public int buscarCancion(Cancion c) {
        return canciones.lastIndexOf(c);
    }

    // Collections.sort(lista) lista debe contener objetos que implementan
    // comparable
    public void ordenarISBN() {
        Collections.sort(this.canciones);
    }

    // Búsqueda binaria de un objeto según la ordenación natural
    // binarySearch no funciona si la lista está desordenada
    public int buscarAlbum(Cancion c) {

        return Collections.binarySearch(canciones, c);
    }

    public void ordenarComparatorNombre() {
        Collections.sort(canciones, (Cancion l1, Cancion l2) -> l1.getNombreAlbum().compareTo(l2.getNombreAlbum()));
    }

}
