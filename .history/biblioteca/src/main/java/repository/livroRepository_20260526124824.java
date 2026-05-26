package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.livro;

public class livroRepository {

    livro savelivro(livro livro) throws SQLException;

    List<livro> findAll() throws SQLException;

    livro findById(int id) throws SQLException;

    livro update(livro livro) throws SQLException;

    void deleteById(int id) throws SQLException;

}
