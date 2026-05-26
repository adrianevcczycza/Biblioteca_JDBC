package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.usuario;

public class usuarioRepository {

    usuario saveusuario(emprestimo emprestimo) throws SQLException;

    List<emprestimo> findAllusuario() throws SQLException;

    emprestimo findByIdusuario(int id) throws SQLException;

    emprestimo updateEmprestim(emprestimo emprestimo) throws SQLException;

    void deleteByIdEmprestim(int id) throws SQLException;

}
