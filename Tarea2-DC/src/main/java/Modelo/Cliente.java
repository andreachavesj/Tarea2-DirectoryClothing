package Modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;

    private String cedula;
    private String direccion;
    private String email;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido1, String apellido2, String direccion, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.email = email;
    }

    public Cliente(String nombre, String apellido1, String apellido2, String cedula, String direccion, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido1, cliente.apellido1) && Objects.equals(apellido2, cliente.apellido2) && Objects.equals(direccion, cliente.direccion) && Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido1, apellido2, direccion, email);
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                '\n';
    }
}
