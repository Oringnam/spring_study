package chapter1.dao.a_first;

import chapter1.dao.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DB를 사용하여 User 데이터의 조회 조작하는  클래스
 * 관점의 분리가 안되어 있음
 *
 * 세 가지 방법으로 관심 분리
 * 1. 메소드 분리
 * 2. 클래스 분리
 * 3. 인터페이스 구성
 */
public class UserDaoFirst {
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(id, name, password) values(?,?,?)");

        preparedStatement.setString(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPassword());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");

        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ?");

        preparedStatement.setString(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

        User user = new User(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("password"));

        resultSet.close();
        preparedStatement.close();
        connection.close();

        return user;
    }
}
