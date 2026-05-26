

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC\n";
    
    private static final String USER = "root";

    private static final String PASSARWORD = "root";

    public static Connection getConexao() throws SQLException{

        return DriverManager.getConnection(URL, USER, PASSARWORD);

    }

}
