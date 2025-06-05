public class Livro extends Material {
    private Genero genero;

    public Livro(String titulo, String autor, Genero genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Livro - Título: " + titulo + " / Autor: " + autor + " / Gênero: " + genero;
    }
}