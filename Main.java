import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaSequencial lista = new ListaSequencial(5);
        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Ordenar livros por título");
            System.out.println("4. Buscar livro por título");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título do livro: ");
                    String titulo = scan.nextLine();
                    System.out.print("Autor do livro: ");
                    String autor = scan.nextLine();
                    System.out.print("Ano de publicação: ");
                    int anoPublicacao = scan.nextInt();
                    scan.nextLine();
                    lista.add(new Livro(titulo, autor, anoPublicacao));
                    System.out.println("Livro adicionado com sucesso!!");
                    break;

                case 2:
                    lista.listBooks();
                    break;

                case 3:
                    lista.sortBooks();
                    break;

                case 4:
                    System.out.print("Título do livro a buscar: ");
                    titulo = scan.nextLine();
                    Livro livroEncontrado = lista.searchBookByTitle(titulo);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
   }
}
