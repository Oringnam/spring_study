package dao2.a_1_4_IoC;

import dao.User;
import dao.d_fourth.ConnectionMaker;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author : Woonhee Factory를 위한 생성자 근데 왜 롬복이 안 먹을까 ㅠㅠㅠ
 */
@AllArgsConstructor
public class UserDaoFifth {

  private ConnectionMaker connectionMaker;

  public UserDaoFifth(ConnectionMaker connectionMaker) {
    this.connectionMaker = connectionMaker;
  }

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
