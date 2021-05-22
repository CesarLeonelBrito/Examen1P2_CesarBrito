package examen1p2_cesarbrito;

import java.util.Date;

public class Libro {

    private String titulo, descripcion, genero, autor;
    private int puntaje, copias, valor, edicion, publicacion;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, String genero, String autor, int puntaje, int copias, int valor, int edicion, int publicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.autor = autor;
        this.setPuntaje(puntaje);
        this.copias = copias;
        this.valor = valor;
        this.edicion = edicion;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        if (puntaje >= 1 && puntaje <= 5) {
            this.puntaje = puntaje;
        }
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }

}
