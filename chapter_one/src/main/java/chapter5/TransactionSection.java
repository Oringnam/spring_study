package chapter5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author Jin Won Park, oringnam
 * @since 2019-01-15
 */
public class TransactionSection {
    DataSource dataSource = new DataSource();

    public void transcationComminAndRollbackTest() throws SQLException {
        TransactionSynchronizationManager.initSynchronization();
        Connection connection = DataSourceUtils.getConnection(dataSource);

        connection.setAutoCommit(false);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("sql1");
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement2 = connection.prepareStatement("sql1");
            preparedStatement2.executeUpdate();

            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
        } finally {
            DataSourceUtils.releaseConnection(connection, dataSource);
            TransactionSynchronizationManager.unbindResource(dataSource);
            TransactionSynchronizationManager.clearSynchronization();
        }
    }
}
