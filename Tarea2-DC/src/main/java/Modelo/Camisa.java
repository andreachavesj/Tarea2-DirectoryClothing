package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Camisa {
    private int id;
    private int codigoColor;
    private char tamaño;
    private String descripcion;
    private String imagen;
    private double precio;

    public Camisa() {
    }

    public Camisa(int id, int codigoColor, char tamaño, String descripcion, String imagen, double precio) {
        this.id = id;
        this.codigoColor = codigoColor;
        this.tamaño = tamaño;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(int codigoColor) {
        this.codigoColor = codigoColor;
    }

    public char getTamaño() {
        return tamaño;
    }

    public void setTamaño(char tamaño) {
        this.tamaño = tamaño;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camisa camisa = (Camisa) o;
        return id == camisa.id && codigoColor == camisa.codigoColor && tamaño == camisa.tamaño && Double.compare(camisa.precio, precio) == 0 && Objects.equals(descripcion, camisa.descripcion) && Objects.equals(imagen, camisa.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoColor, tamaño, descripcion, imagen, precio);
    }

    @Override
    public String toString() {
        return "Camisa{" +
                "id=" + id +
                ", codigoColor=" + codigoColor +
                ", tamaño=" + tamaño +
                ", descripcion='" + descripcion + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precio=" + precio +
                '}';
    }
}
