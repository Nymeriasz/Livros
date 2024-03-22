package livros;
public class Livro {

    private int isbn;
    private String autor;

    public Livro(int isbn, String autor) {
        this.isbn = isbn;
        this.autor = autor;
    }

    public Livro(){

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}