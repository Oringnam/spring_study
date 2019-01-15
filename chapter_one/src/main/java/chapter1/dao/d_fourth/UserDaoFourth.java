package chapter1.dao.d_fourth;

import chapter1.dao.User;
import java.sql.Connection;
import java.sql.SQLException;
import lombok.AllArgsConstructor;

/**
 * Main에서 ConnectionMaker 구현체의 인스턴스를 넘겨받고 서비스 진행
 */
@AllArgsConstructor
public class UserDaoFourth {
    private ConnectionMaker connectionMaker;

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection connection = connectionMaker.makeConnection();

        // logic
    }

    public User get(String id) throws SQLException, ClassNotFoundException {
        Connection connection = connectionMaker.makeConnection();

        // logic

        return null;
    }
}
