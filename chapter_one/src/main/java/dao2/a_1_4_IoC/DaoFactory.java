package dao2.a_1_4_IoC;

import dao.d_fourth.ConnectionMaker;
import dao.d_fourth.MySqlConnectionMaker;
import dao.d_fourth.UserDaoFourth;

/**
 * Author : Woonhee 역할과 생성 방법을 결정하는 Factory
 */
public class DaoFactory {

  public UserDaoFifth userDaoFourth() {
    ConnectionMaker connectionMaker = new MySqlConnectionMaker();
    UserDaoFifth userDaoFifth = new UserDaoFifth(connectionMaker);

    return userDaoFifth;
  }
}
