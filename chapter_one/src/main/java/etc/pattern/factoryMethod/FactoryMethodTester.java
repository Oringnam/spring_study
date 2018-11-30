package etc.pattern.factoryMethod;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class FactoryMethodTester {
    @Test
    public void factoryMethodTest() {
        RobotFactory robotFactory = new SuperRobotFactory();
        Robot superRobot = robotFactory.createRobot("SuperRobot");
        Robot powerRobot = robotFactory.createRobot("PowerRobot");

        log.info("superRobot : {}", superRobot.getName());
        log.info("powerRobot : {}", powerRobot.getName());
    }
}
