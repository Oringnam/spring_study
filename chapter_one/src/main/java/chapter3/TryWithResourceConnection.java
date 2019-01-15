package chapter3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Test;

/**
 * @author Jin Won Park, oringnam
 * @since 2018-12-21
 */
public class TryWithResourceConnection {
    @Test
    public void connectionTest() {
        String sql = "select 1";

        try(Connection connection = DriverManager.getConnection("","","")) {
            // 이하 동문
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
