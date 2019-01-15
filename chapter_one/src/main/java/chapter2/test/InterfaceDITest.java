package chapter2.test;

import javax.sql.DataSource;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Jin Won Park, oringnam
 * @since 2018-12-21
 */
// @DirtiesContext 어플리케이션 컨텍스트의 구성이나 상태를 변경할 수 있음을 테스트 컨텍스트 프레임워크에 전달
//@DirtiesContext
public class InterfaceDITest {
    @Autowired
    UserDao dao;

    @Before
    public void setUp() {
        DataSource dataSource = null;
        // datasource 선언
        // ..

        // 코드를 통한 수동 DI
        dao.setDataSource(dataSource);
    }
}
