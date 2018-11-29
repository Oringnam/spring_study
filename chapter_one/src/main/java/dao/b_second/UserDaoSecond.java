package dao.b_second;

import dao.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 메소드 분리로 관심사 1차 분리
 * ==> 메소드 추출 기법
 *
 * 문제점..
 * 다른 종류의 커넥션을 원하는 경우는? (예를 들면 mysql, mssql)
 * ==> 클래스 분리가 필요 (third)
 */
public class UserDaoSecond {
    public void add(User user) throws ClassNotFoundException, SQLException {

        Connection connection = getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("insert into users(id, name, password) values(?,?,?)");

        preparedStatement.setString(1, user.getId());
        preparedStatement.setString(2, user.getName());
        preparedStatement.setString(3, user.getPassword());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection connection = getConnection();

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

    /**
     * add(), get() 양 메소드에서 사용되는 Connection 만들기를 추출하여 메소드 분리
     * @return 완성된 Connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/springbook", "spring", "book");
        return connection;
    }
}
