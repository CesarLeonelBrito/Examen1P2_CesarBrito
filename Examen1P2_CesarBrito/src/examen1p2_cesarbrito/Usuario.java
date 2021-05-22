package examen1p2_cesarbrito;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String username, password, correo, nombre, genero;
    private int telefono;
    private Date nacimiento;
    private ArrayList<Usuario> amigos = new ArrayList();
    private ArrayList<Libro> libros = new ArrayList();

    public Usuario() {
    }

    public Usuario(String username, String password, String correo, String nombre, String genero, int telefono, Date nacimiento) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return nombre + " - " + username + " - " + password;
    }

}
