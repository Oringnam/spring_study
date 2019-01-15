package chapter5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author Jin Won Park, oringnam
 * @since 2019-01-15
 */
public class UserService {
    public void upgradeLevels() {
        // dao로 대체할 것
        List<User> users = new ArrayList<>();

        for (User user : users) {
            if(canUpgradeLevel(user)) {
                upgradeLevel(user);
            }
        }
    }

    private boolean canUpgradeLevel(User user) {
        // check logic
        return true;
    }

    private void upgradeLevel(User user) {
        // upgrade level logic
    }
}
