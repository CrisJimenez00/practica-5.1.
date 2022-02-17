/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocancion;

/**
 *
 * @author cristina
 */
public class Main {

    public static void main(String[] args) {
        
        ListaReproduccion lista = new ListaReproduccion();
        
        lista.grabarCancion(new Cancion("Churrasco de nombre", "Pepito", "Sony Music", 15, 12));
        lista.grabarCancion(new Cancion("Churrasco de cancion", "Esae", "Sony Music", 15, 12));
        lista.grabarCancion(new Cancion("Churrasco de Poh eso", "El colega", "Sony Music", 15, 12));
        
        System.out.println("Sin ordenar---");
        
        lista.imprimirLista(lista);
        
        System.out.println("----Ordenado---");
        
        lista.ordenarComparatorNombre();
        
        int posicion = lista.buscarAlbum(new Cancion("Churrasco de cancion", "Esae", "Sony Music", 15, 12));
        lista.imprimirLista(lista);
        System.out.println("La posición de la canción churrasco de canción: " + posicion);
    }

}
