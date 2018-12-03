package dao2;

import dao2.a_1_4_IoC.DaoFactory;
import dao2.a_1_4_IoC.UserDaoFifth;
import dao2.c_1_7_DI.UserDaoSixth;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
    UserDaoFifth daoFifth = context.getBean("userDaoFifth", UserDaoFifth.class);
  }
}
