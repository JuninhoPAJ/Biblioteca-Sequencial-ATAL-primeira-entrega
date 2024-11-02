import java.util.Arrays;

public class ListaSequencial {
    private Livro[] livros;
    private int quantidade;

    //construtor para inicializar a lista com capacidade inicial
    public ListaSequencial(int capacidadeInicial){
        livros = new Livro[capacidadeInicial];
        quantidade = 0;
    }

    //Método para adicionar um novo elemento no final
    public void add(Livro livro){
        if (quantidade == livros.length) {
            //Redimensionar o array de objetos quando atingir a capacidade
            livros = Arrays.copyOf(livros, livros.length * 2);
        }
        livros[quantidade] = livro;
        quantidade++;
    }

    //Método para listar todos o livros
    public void listBooks(){
        if (quantidade == 0) {
            System.out.println("Lista vazia");
        }
        else{
            for(int i = 0; i < quantidade; i++){
                System.out.println(livros[i]);
            }
        }
    }

    //Método para ordenar livros
    public void sortBooks(){
        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = i + 1; j < quantidade; j++) {
                if (livros[i].titulo.compareTo(livros[j].titulo) > 0) {
                    Livro temp = livros[i];
                    livros[i] = livros[j];
                    livros[j] = temp;
                }
            }
        }
        System.out.println("Livros ordenados com sucesso.");
    }

    //Método para buscar livro por título
    public Livro searchBookByTitle(String titulo){
        for(int i = 0; i < quantidade; i++){
            if (livros[i].titulo.equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }
}
