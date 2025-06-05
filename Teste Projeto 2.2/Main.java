import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        int opcao;

        do {
            System.out.println("\nSelecione uma das opções abaixo:");
            System.out.println("1 - 🔍 Listagem de materiais");
            System.out.println("2 - ➕ Adicionar um novo livro");
            System.out.println("3 - ➕ Adicionar uma nova revista");
            System.out.println("4 - 📊 Exibir quantidade total de materiais");
            System.out.println("5 - 🔎 Pesquisar material através do título");
            System.out.println("6 - 🗑️ Excluir um material através do título");
            System.out.println("7 - 🚪 Sair do sistema\n");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    // 1 - Listagem de materiais
                    biblioteca.listarMateriais();
                    break;
                case 2:
                    // 2 - Adicionar um novo livro
                    biblioteca.adicionarLivro();
                    break;
                case 3:
                    // 3 - Adicionar uma nova revista
                    biblioteca.adicionarRevista();
                    break;
                case 4:
                    // 4 - Exibir a quantidade total de materiais
                    biblioteca.quantidadeTotal();
                    break;
                case 5:
                    // 5 - Pesquisar material pelo título
                    biblioteca.pesquisarMaterial();
                    break;
                case 6:
                    // 6 - Excluir material pelo título
                    biblioteca.excluirMaterial();
                    break;
                case 7:
                    // 7 - Sair do sistema
                    System.out.println("Sistema encerrado com sucesso!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);

        scan.close();
    }
}