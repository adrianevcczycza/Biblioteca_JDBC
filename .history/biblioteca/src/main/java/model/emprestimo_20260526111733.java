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

    

}
