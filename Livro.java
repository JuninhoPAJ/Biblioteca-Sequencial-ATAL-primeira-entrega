public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoDePublicacao;
    }
}