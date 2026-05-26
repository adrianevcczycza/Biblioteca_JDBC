package model;

import java.time.LocalDate;

public class livro {

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(LocalDate ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

     


}
