/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciocancion;

import java.util.Objects;

/**
 *
 * @author cristina
 */
public class Cancion implements Comparable<Cancion> {

    //Atributos encapsulados
    private String nombreAlbum;
    private String nombreCantante;
    private String discografica;
    private double tiempo;
    private double precio;

    //Constructores
    public Cancion(String nombreAlbum, String nombreCantante, String discografica, double tiempo, double precio) {
        this.nombreAlbum = nombreAlbum;
        this.nombreCantante = nombreCantante;
        this.discografica = discografica;
        this.tiempo = tiempo;
        this.precio = precio;
    }

    public Cancion() {
    }

    //getters y setters
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //ToString

    @Override
    public String toString() {
        return "Cancion{" + "nombreAlbum=" + nombreAlbum + ", nombreCantante=" + nombreCantante + ", discografica=" + discografica + ", tiempo=" + tiempo + ", precio=" + precio + '}';
    }

    //Equals y hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nombreAlbum);
        hash = 59 * hash + Objects.hashCode(this.nombreCantante);
        hash = 59 * hash + Objects.hashCode(this.discografica);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.tiempo) ^ (Double.doubleToLongBits(this.tiempo) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
//        if (Double.doubleToLongBits(this.tiempo) != Double.doubleToLongBits(other.tiempo)) {
//            return false;
//        }
//        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
//            return false;
//        }
//        if (!Objects.equals(this.nombreAlbum, other.nombreAlbum)) {
//            return false;
//        }
//        if (!Objects.equals(this.nombreCantante, other.nombreCantante)) {
//            return false;
//        }
        return Objects.equals(this.nombreAlbum, other.nombreAlbum);
    }

    @Override
    public int compareTo(Cancion c) {
        return this.nombreAlbum.compareTo(c.nombreAlbum);

    }

}
