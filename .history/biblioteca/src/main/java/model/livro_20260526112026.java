package model;

import java.time.LocalDate;

public class livro {

    private Long id;

    private String titulo;

    private String autor;

    private LocalDate ano_publicacao;

    public livro(Long id, String titulo, String autor, LocalDate ano_publicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    public livro(String titulo, String autor, LocalDate ano_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }

    public livro() {
    }

    

}
