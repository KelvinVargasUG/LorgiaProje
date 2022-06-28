package Ficha;

import data.dataLibros;

public class Libro {

    private String Autor;
    private String Volumen;
    private String Nombre;
    private String descripcion;
    private int numeroPag;
    private int cantidadDisponibilidad;
    private boolean EstadoDisponibilidad;

    dataLibros data = new dataLibros();

    public String getAutor(int autor) {
        Autor = data.getAutorLibro(autor);
        return Autor;
    }

    public String getVolumen(int volumen) {
        Volumen = data.getVolumenLibros(volumen);
        return Volumen;
    }

    public String getNombreLibro(int nombre) {
        Nombre = data.getNombreLibro(nombre);
        return Nombre;
    }

    public String getDescripcion() {
        descripcion = data.getDescripcionLibros();
        return descripcion;
    }

    public int getNumeroPag() {
        numeroPag = data.getNumeroPagLibros();
        return numeroPag;
    }

    public int getCantidadDisponibilidad() {
        cantidadDisponibilidad = data.getCantidadLibros();
        return cantidadDisponibilidad;
    }

    public boolean isEstadoDisponibilidad() {
        if (cantidadDisponibilidad > 0) {
            EstadoDisponibilidad = true;
        } else {
            EstadoDisponibilidad = false;
        }
        return EstadoDisponibilidad;
    }
}
