package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;

public interface emprestimoRepository {

    emprestimo saveEmprestimo(emprestimo emprestimo) throws SQLException;

    List<emprestimo> findAll() throws SQLException;

    emprestimo findByIdEmprestim(int id) throws SQLException;

    emprestimo update(emprestimo emprestimo) throws SQLException;

    void deleteById(int id) throws SQLException;
}