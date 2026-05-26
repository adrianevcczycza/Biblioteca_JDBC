package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;

public interface emprestimoRepository {

    emprestimo save(emprestimo emprestimo) throws SQLException;

    List<Emprestimo> findAll() throws SQLException;

    Emprestimo findById(int id) throws SQLException;

    Emprestimo update(Emprestimo emprestimo) throws SQLException;

    void deleteById(int id) throws SQLException;
}