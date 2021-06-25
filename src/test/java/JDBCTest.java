import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class JDBCTest {
    @Inject
    private DataSource ds;

    @Inject
    private SqlSessionFactory sqlFactory;

    @org.junit.Test
    public void test() throws Exception {

        try (Connection conn = ds.getConnection()) {
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void factoryTest() {
        System.out.println(sqlFactory);
    }

    @org.junit.Test
    public void sessionTest() throws Exception {
        try (SqlSession session = sqlFactory.openSession()) {
            System.out.println(session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}