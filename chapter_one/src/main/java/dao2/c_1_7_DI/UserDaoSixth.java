package dao2.c_1_7_DI;

import dao.d_fourth.MySqlConnectionMaker;

/**
 * Author : Woonhee
 * Setter DI
 *
 */
public class UserDaoSixth {
  private MySqlConnectionMaker connectionMaker;

  public void setConnectionMaker(MySqlConnectionMaker connectionMaker) {
    this.connectionMaker = connectionMaker;
  }
}
