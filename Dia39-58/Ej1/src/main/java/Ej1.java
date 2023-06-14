import Objects.Libro;

public class Ej1 {

    public static void main(String[] args) {
        Libro libro1=new Libro(123, "xdd", "Juan", 777);
        
        System.out.println("Isbn: " + libro1.getIsbn() + ", Título: " + libro1.getTitulo() + ", Autor: " + libro1.getAutor() + ", N. de Páginas: " + libro1.getNumeroPaginas());
    }
}

