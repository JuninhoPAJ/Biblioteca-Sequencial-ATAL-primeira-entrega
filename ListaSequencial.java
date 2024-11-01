import java.util.Arrays;

public class ListaSequencial {
    private Livro[] livros;
    private int tamanho;

    //construtor para inicializar a lista com capacidade inicial
    public ListaSequencial(int capacidadeInicial){
        livros = new Livro[capacidadeInicial];
        tamanho = 0;
    }

    //Método para adicionar um novo elemento no final
    public void add(Livro livro){
        if (tamanho == livros.length) {
            //Redimensionar o array de objetos quando atingir a capacidade
            livros = Arrays.copyOf(livros, livros.length * 2);
        }
        livros[tamanho] = livro;
        tamanho++;
    }

    //Método para listar todos o livros
    public void listBooks(){
        if (tamanho == 0) {
            System.out.println("Lista vazia");
        }
        else{
            for(int i = 0; i < tamanho; i++){
                System.out.println(livros[i]);
            }
        }
    }

    //Método para ordenar livros
    public void sortBooks(){

    }

    //Método para buscar livro por título
    public Livro searchBookByTitle(String tituto){
        for(int i = 0; i < tamanho; i++){
            if (livros[i].titulo.equalsIgnoreCase(tituto)) {
                return livros[i];
            }
        }
        return null;
    }
}
