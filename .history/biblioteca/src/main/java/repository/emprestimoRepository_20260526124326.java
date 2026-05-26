package repository;

import java.sql.SQLException;
import java.util.List;

public interface emprestimoRepository {

    emprestimo save(Emprestimo emprestimo) throws SQLException;

    List<Emprestimo> findAll() throws SQLException;

    Emprestimo findById(int id) throws SQLException;

    Emprestimo update(Emprestimo produto) throws SQLException;

    void deleteById(int id) throws SQLException;
}