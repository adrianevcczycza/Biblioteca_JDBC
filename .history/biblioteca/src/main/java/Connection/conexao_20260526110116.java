package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:mysql://localhost:3356/stao_escolar?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC\n";
    
    private static final String USER = "USER";

    private static final String PASSARWORD = "USER";

    public static Connection getConexao() throws SQLException{

        return DriverManager.getConnection(URL, USER, PASSARWORD);

    }

}
