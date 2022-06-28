package data;

public class dataRevistas {
        private String autorRevista[] = {"Juan perez", "Max Loja"};
    private String nombreRevista[][] = {
        {"Revista 1 Juan", "Revista 2 Juan"},
        {"Revista 1 Max", "Revista 2 Max"}
    };
    private String volumenRevista[][] = {
        {"Volumen 1 juan Revista 1", "Volumen 2 juan Revista 2"},
        {"Volumen 1 max Revista 1", "Volumen 2 max Revista 2"}
    };
    private String descripcionRevista[][] = {
        {"Descripcion juan Revista 1 vol 1", "Descripcion juan Revista 2 vol 2"},
        {"Descripcion Max Revista 1 vol 1", "Descripcion Revista 2 Max vol 2"}
    };
    private int numeroPagRevista[][]={
        {1,2},
        {3,4}
    };
    private int cantidadRevista[][]={
        {1,0},
        {1,1}
    };
    
    private int autor;
    private int nombre;
    private int volumen;
    
    public String getAutorRevista(int autor) {
                this.autor=autor;
        return autorRevista[this.autor];
    }
    
    public String getNombreRevista(int nombre) {
        this.nombre=nombre;

        return nombreRevista[this.autor][this.nombre];
    }

    public String getVolumenRevista(int volumen) {
        this.volumen=volumen;
        return volumenRevista[this.nombre][this.volumen];
    }

    public String getDescripcionRevista() {
        return descripcionRevista[this.nombre][this.volumen];
    }

    public int getNumeroPagRevista() {
        return numeroPagRevista[this.nombre][this.volumen];
    }

    public int getCantidadRevista() {
        return cantidadRevista[this.nombre][this.volumen];
    }
}
