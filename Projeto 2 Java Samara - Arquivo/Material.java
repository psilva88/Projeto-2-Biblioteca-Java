public abstract class Material {
    protected String titulo;
    protected String autor;

    public Material(String titulo, String autor) {
        this.titulo = titulo.toLowerCase();
        this.autor = autor.toLowerCase();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String toString();
}