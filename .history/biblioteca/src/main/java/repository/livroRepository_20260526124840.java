package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.livro;

public class livroRepository {

    livro savelivro(livro livro) throws SQLException;

    List<livro> findAlllivro() throws SQLException;

    livro findByIdlivro(int id) throws SQLException;

    livro updatelivro(livro livro) throws SQLException;

    void deleteByIdlivro(int id) throws SQLException;

}
