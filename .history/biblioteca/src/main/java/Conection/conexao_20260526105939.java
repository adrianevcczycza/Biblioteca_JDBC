package Conection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "USER";
    
    private static final String USER = "USER";

    private static final String PASSARWORD = "USER";

    public static Conenction getConexao() throws SQLException{

        return DriverManager.getConnection(URL, USER, PASSARWORD);

    }

}
