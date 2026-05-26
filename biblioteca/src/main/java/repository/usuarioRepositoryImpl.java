package repository;

import java.sql.SQLException;
import java.util.List;

import model.emprestimo;
import model.usuario;

public class usuarioRepositoryImpl implements usuarioRepository{

    @Override
    public usuario saveusuario(usuario usuario) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveusuario'");
    }

    @Override
    public List<emprestimo> findAllusuario() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllusuario'");
    }

    @Override
    public emprestimo findByIdusuario(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByIdusuario'");
    }

    @Override
    public emprestimo updateusuario(usuario usuario) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateusuario'");
    }

    @Override
    public void deleteByIdusuario(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByIdusuario'");
    }

}
