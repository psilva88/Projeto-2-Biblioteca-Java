import java.util.*;

public class Biblioteca {
    private List<Material> materiais = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    // 1 - Listagem de materiais
    public void listarMateriais() {
        if (materiais.isEmpty()) {
        System.out.println("Erro! Nenhum material cadastrado.");
    } else {
        System.out.println("Lista de materiais: ");
        for (Material m : materiais) {
            System.out.println(m.toString());
            }
        }   
    }
    // 2 - Adicionar um novo livro
    public void adicionarLivro() {
        System.out.println("Digite o título do livro que deseja adicionar.");
        String livro = scan.nextLine();
        System.out.println("Digite o nome do autor do livro.");
        String autor = scan.nextLine();
        System.out.println("Selecione o gênero do livro.");
        Genero generoSelecionado = null;
        int generoOpcao = -1; 

        int i = 1; 
        for (Genero genero : Genero.values()){
            System.out.println(i + ". " + genero.getVariavelTemporaria()); i++;
        }
        String selecioneGenero = scan.nextLine();
        String numeroString = String.valueOf(selecioneGenero);
        if (numeroString.trim().isEmpty()){
            System.out.println("Opção Inválida por favor digite uma opção válida.");
        } else{
            if (selecioneGenero.matches("\\d+")) { 
                    generoOpcao = Integer.parseInt(selecioneGenero);
                    if (generoOpcao >= 1 && generoOpcao <= Genero.values().length) {
                        generoSelecionado = Genero.values()[generoOpcao - 1];
                    } else {
                        System.out.println("Opção de gênero inválida. Por favor, digite um número da lista.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite apenas números para o gênero.");
                }

        }
        if (livro.trim().isEmpty() || autor.trim().isEmpty()) {
            System.out.println("Por favor preencha todos os campos obrigatórios.");
        } else{
            Material livroAdicionado = new Livro(livro, autor, generoSelecionado);
            materiais.add(livroAdicionado);
            System.out.println("Livro adicionado ao sistema com sucesso!");
        }
    }

    // 3 - Adicionar uma nova revista
    public void adicionarRevista() {
        String titulo = "";
        String autor = "";
        int numero = -1;

        while (titulo.trim().isEmpty()) {
            System.out.print("Digite o título da revista que deseja adicionar: ");
            titulo = scan.nextLine();
            titulo = titulo.toLowerCase();
            if (titulo.trim().isEmpty()) {
                System.out.println("O título não pode estar vazio. Tente novamente.");
            }
        }

        while (autor.trim().isEmpty()) {
            System.out.print("Digite o nome do autor da revista: ");
            autor = scan.nextLine();
            autor  = autor.toLowerCase();
            if (autor.trim().isEmpty()) {
                System.out.println("O autor não pode estar vazio. Tente novamente.");
            }
        }

        while (numero <= 0) {
            System.out.print("Digite o número da revista: ");
            String numeroString = scan.nextLine();
            if (!numeroString.trim().isEmpty() && numeroString.chars().allMatch(Character::isDigit)) {
                numero = Integer.parseInt(numeroString);
            if (numero <= 0) {
                System.out.println("O número da revista deve ser maior que zero. Tente novamente.");}
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número válido para o número da revista.");
            }
        }
            Material revista = new Revista(titulo, autor, numero);
            materiais.add(revista);
            System.out.println("Revista adicionada ao sistema com sucesso!");
    }   

    // 4 - Exibir a quantidade total de materiais
    public void quantidadeTotal() {
        System.out.println("Quantidade total de materiais: " + materiais.size());
    }

    // 5 - Pesquisar material pelo título
    public void pesquisarMaterial() {
        System.out.print("Digite o título do material para pesquisar: ");
    String titulo = scan.nextLine();
    for (Material material : materiais) {
        if (material.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Material encontrado com sucesso!: " + material);
            return;
        }
    }
    System.out.println("Erro! Material não encontrado.");
    }
   

    // 6 - Excluir material pelo título
    public void excluirMaterial() {
        System.out.println("Digite o título do material que deseja excluir:");
        String titulo = scan.nextLine().toLowerCase().trim();
        if (titulo.isEmpty()) {
            System.out.println("Erro! Nenhum título foi digitado.");
        return;}
            boolean removido = materiais.removeIf(m -> m.getTitulo().equalsIgnoreCase(titulo));
        if (removido) {
            System.out.println("O material \"" + titulo + "\" foi excluído com sucesso!");
    }   else {
            System.out.println("Erro! Material com o título \"" + titulo + "\" não foi encontrado.");
        }
    }
}