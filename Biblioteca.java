package livros;

public class Biblioteca {

    private Livro livros[];

    public Livro[] getLivros() {
        return livros;
    }

    public void exibeLivros(){
        for (int i=0; i<livros.length; i++){
            System.out.println("Dados: "+livros[i].getAutor()+", "+livros[i].getIsbn());
        }
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
