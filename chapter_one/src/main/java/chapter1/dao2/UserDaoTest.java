package chapter1.dao2;

import chapter1.dao2.a_1_4_IoC.DaoFactory;
import chapter1.dao2.a_1_4_IoC.UserDaoFifth;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
    UserDaoFifth daoFifth = context.getBean("userDaoFifth", UserDaoFifth.class);
  }
}
