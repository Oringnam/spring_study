package Item1.c_third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * mssql 연동 UserDao
 */
public class MsSqlUserDao extends UserDaoThird {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost", "spring", "book");
        return connection;
    }
}
