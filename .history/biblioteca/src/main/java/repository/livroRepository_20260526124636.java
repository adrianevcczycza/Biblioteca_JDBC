package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.livro;

public class livroRepository {

    livro save(livro livroo) throws SQLException;

    List<livro> findAll() throws SQLException;

    emprestimo findById(int id) throws SQLException;

    emprestimo update(emprestimo emprestimo) throws SQLException;

    void deleteById(int id) throws SQLException;

}
