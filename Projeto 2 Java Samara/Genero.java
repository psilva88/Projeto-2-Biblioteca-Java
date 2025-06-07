public enum Genero {
    FICCÃO("Ficção"), 
    AÇÃO("Ação"), 
    ROMANCE("Romance"), 
    TERROR("Terror"), 
    COMEDIA("Comédia"), 
    FANTASIA("Fantasia");

    public final String variavelTemporaria;

    Genero(String variavelTemporaria) {
        this.variavelTemporaria = variavelTemporaria;
    }
    public String getVariavelTemporaria() {
        return variavelTemporaria;
    }
    public static Genero fromVariavelTemporaria(String nome) {
        for (Genero genero : Genero.values()) {
            if (genero.variavelTemporaria.equalsIgnoreCase(nome)) {
                return genero;
            }
        }
        return null; 
}
}