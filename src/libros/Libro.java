package libros;

public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;
    int ejemplares;
    int ejemplaresPrestados;



    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroPaginas, int ejemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public boolean prestamo() {
        boolean res=false;
        if (this.ejemplares>this.ejemplaresPrestados){
            this.ejemplares--;
            this.ejemplaresPrestados++;
            res=true;
        }
        return res;
    }

    public boolean devlucion() {
        boolean res=false;
        if (this.ejemplaresPrestados>0){
            this.ejemplaresPrestados--;
            this.ejemplares++;
            res=false;
        }else {
            res=true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", ejemplares=" + ejemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }
}


