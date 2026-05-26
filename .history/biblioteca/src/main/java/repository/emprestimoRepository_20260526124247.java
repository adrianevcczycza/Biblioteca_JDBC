package repository;

import java.sql.SQLException;
import java.util.List;

public interface emprestimoRepository {

      salvar 
      buscarTodos
       buscarPorId
        atualizar
        deletar

            emprestimo save(Emprestimo emprestimo) throws SQLException;

    List<Emprestimo> findAll() throws SQLException;

    Produto findById(int id) throws SQLException;

    Produto update(Produto produto) throws SQLException;

    void deleteById(int id) throws SQLException;
}