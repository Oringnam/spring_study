package chapter2;

import javafx.application.Application;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Jin Won Park, oringnam
 * @since 2018-12-20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class UserDaoTest {

    // SpringJUnit에서 context를 클래스 실행전에 만들어 줌
   @Autowired
    private Application context;


    @Before
    public void setUp() {}
}