package etc.pattern.factoryMethod;

public class SuperRobotFactory extends RobotFactory {
    @Override
    Robot createRobot(String name) {
        try {
            Class<?> cls = Class.forName("etc.pattern.factoryMethod." + name);
            Object object = cls.newInstance();
            return (Robot) object;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
