package model;

import java.time.LocalDate;

public class emprestimo {

    private Long id;

    private Long livro_id;

    private Long usuario_id;

    private LocalDate data_emprestimo;

    private LocalDate data_devolucao;

    public emprestimo(Long id, Long livro_id, Long usuario_id, LocalDate data_emprestimo, LocalDate data_devolucao) {
        this.id = id;
        this.livro_id = livro_id;
        this.usuario_id = usuario_id;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public emprestimo(Long livro_id, Long usuario_id, LocalDate data_emprestimo, LocalDate data_devolucao) {
        this.livro_id = livro_id;
        this.usuario_id = usuario_id;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public emprestimo() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(Long livro_id) {
        this.livro_id = livro_id;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public LocalDate getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(LocalDate data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public LocalDate getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(LocalDate data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    
}
