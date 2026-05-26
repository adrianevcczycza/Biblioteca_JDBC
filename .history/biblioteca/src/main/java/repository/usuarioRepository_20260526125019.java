package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.usuario;

public class usuarioRepository {

    usuario saveusuario(usuario usuario) throws SQLException;

    List<emprestimo> findAllusuario() throws SQLException;

    emprestimo findByIdusuario(int id) throws SQLException;

    emprestimo updateusuario(usuario usuario) throws SQLException;

    void deleteByIdusuario(int id) throws SQLException;

}
