package data;

public class dataLibros {
    private String autorLibro[] = {"Juan perez", "Max Loja"};
    private String nombreLibro[][] = {
        {"Lirbo 1 Juan", "Lirbo 2 Juan"},
        {"Lirbo 1 Max", "Lirbo 2 Max"}
    };
    private String volumenLibro[][] = {
        {"Volumen 1 juan libro 1", "Volumen 2 juan libro 2"},
        {"Volumen 1 max libro 1", "Volumen 2 max libro 2"}
    };
    private String descripcionLibro[][] = {
        {"Descripcion juan libro 1 vol 1", "Descripcion juan vol 2"},
        {"Descripcion Max libro 1 vol 1", "Descripcion Max vol 2"}
    };
    private int numeroPagLibro[][]={
        {1,2},
        {3,4}
    };
    private int cantidadLibro[][]={
        {1,0},
        {1,1}
    };
    
    private int autor;
    private int nombre;
    private int volumen;
    
    public String getAutorLibro(int autor) {
        this.autor=autor;
        return autorLibro[this.autor];
    }

    public String getNombreLibro(int nombre) {
        this.nombre=nombre;
        return nombreLibro[this.autor][this.nombre];
    }

    public String getVolumenLibros(int volumen) {
        this.volumen=volumen;
        return volumenLibro[this.nombre][this.volumen];
    }

    public String getDescripcionLibros() {
        return descripcionLibro[this.nombre][this.volumen];
    }

    public int getNumeroPagLibros() {
        return numeroPagLibro[this.nombre][this.volumen];
    }

    public int getCantidadLibros() {
        return cantidadLibro[this.nombre][this.volumen];
    }
    
    
}
