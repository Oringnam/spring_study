package chapter1.dao.d_fourth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MsSqlConnectionMaker implements ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost", "spring", "book");
        return connection;
    }
}
