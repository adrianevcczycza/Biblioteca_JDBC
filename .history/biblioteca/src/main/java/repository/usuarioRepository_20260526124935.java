package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;

public class usuarioRepository {

    emprestimo saveEmprestimo(emprestimo emprestimo) throws SQLException;

    List<emprestimo> findAllEmprestim() throws SQLException;

    emprestimo findByIdEmprestim(int id) throws SQLException;

    emprestimo updateEmprestim(emprestimo emprestimo) throws SQLException;

    void deleteByIdEmprestim(int id) throws SQLException;

}
