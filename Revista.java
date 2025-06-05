public class Revista extends Material {
    private int numero;

    public Revista(String titulo, String autor, int numero) {
        super(titulo, autor);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Revista - Título: " + titulo + " / Autor: " + autor + " / Número: " + numero;
    }
}