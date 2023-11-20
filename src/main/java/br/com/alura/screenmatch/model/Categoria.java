package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");
    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public static Categoria paraPort(String txt) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoria.equalsIgnoreCase(txt)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma caretogira encontrada");
    }
}

