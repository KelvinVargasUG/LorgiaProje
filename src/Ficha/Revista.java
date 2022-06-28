package Ficha;

import data.dataRevistas;

public class Revista {

    private String Autor;
    private String Nombre;
    private String Volumen;
    private String descripcion;
    private int numeroPag;
    private int cantidadDisponibilidad;
    private boolean EstadoDisponibilidad;

    dataRevistas data = new dataRevistas();

    public String getAutor(int autor) {
        Autor = data.getAutorRevista(autor);
        return Autor;
    }

    public String getNombre(int nombre) {
        Nombre = data.getNombreRevista(nombre);
        return Nombre;
    }

    public String getVolumen(int volumen) {
        Volumen = data.getVolumenRevista(volumen);
        return Volumen;
    }

    public String getDescripcion() {
        descripcion = data.getDescripcionRevista();
        return descripcion;
    }

    public int getNumeroPag() {
        numeroPag = data.getNumeroPagRevista();
        return numeroPag;
    }

    public int getCantidadDisponibilidad() {
        cantidadDisponibilidad = data.getCantidadRevista();
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
