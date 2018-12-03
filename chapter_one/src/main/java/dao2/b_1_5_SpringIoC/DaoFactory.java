package dao2.b_1_5_SpringIoC;

import dao.d_fourth.ConnectionMaker;
import dao.d_fourth.MySqlConnectionMaker;
import dao2.a_1_4_IoC.UserDaoFifth;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

  @Bean
  public UserDaoFifth userDaoFifth() {
    return new UserDaoFifth(connectionMaker());
  }

  @Bean
  public ConnectionMaker connectionMaker() {
    return new MySqlConnectionMaker();
  }

}
