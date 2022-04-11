package Robot;

public class Main {
    public static void main(String[] args){
        Robot robot = new Robot();
        robot.work();

        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();

        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();

        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();

        Robot [] rob = new Robot[]{new CoffeRobot(), new RobotDancer(),new RobotCoocker()};
        for (int i = 0; i< rob.length; i++){
            rob [i].work();
        }


    }

}
