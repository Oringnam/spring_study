package chapter5;

import java.sql.Connection;

/**
 * @author Jin Won Park, oringnam
 * @since 2019-01-15
 */
public interface UserDao {
    public void add(Connection connection, User user);
}
