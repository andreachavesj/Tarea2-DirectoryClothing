package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Catalogo {
    private LocalDate creacion;
    private String nombre;
    public ArrayList<Camisa> Camisas;

    public Catalogo() {
    }

    public Catalogo(LocalDate creacion, String nombre, ArrayList<Camisa> camisas) {
        this.creacion = creacion;
        this.nombre = nombre;
        Camisas = camisas;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Camisa> getCamisas() {
        return Camisas;
    }

    public void setCamisas(ArrayList<Camisa> camisas) {
        Camisas = camisas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogo catalogo = (Catalogo) o;
        return Objects.equals(creacion, catalogo.creacion) && Objects.equals(nombre, catalogo.nombre) && Objects.equals(Camisas, catalogo.Camisas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creacion, nombre, Camisas);
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "creacion=" + creacion +
                ", nombre='" + nombre + '\'' +
                ", Camisas=" + Camisas +
                '}';
    }
}
