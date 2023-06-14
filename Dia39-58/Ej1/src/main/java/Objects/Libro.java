package Objects;

public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;
    
    public Libro(int isbn, String titulo, String autor, int numeroPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }
    
    public int getIsbn(){
        return this.isbn;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }
}
