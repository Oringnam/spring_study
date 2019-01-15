package chapter1.dao;

import chapter1.dao.a_first.UserDaoFirst;
import java.sql.SQLException;
import org.junit.Test;

public class DaoTester {

    @Test
    public void a_firstTest() throws SQLException, ClassNotFoundException {
        UserDaoFirst userDao = new UserDaoFirst();

        User user = new User("oringnam", "박진원", "netmarble1!");

        userDao.add(user);

        System.err.println(user.getId() + " 등록 성공!!");

        User user2 = userDao.get(user.getId());

        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.err.println(user2.getId() + " 조회 성공!!");
    }
}
