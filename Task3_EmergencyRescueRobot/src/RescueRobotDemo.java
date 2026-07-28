public class RescueRobotDemo {
    public static void main(String[] args) {
        RescueRobot[] robots = {
            new AirRescueRobot("Sky Scout", "Disaster Zone A"),
            new WaterRescueRobot("Wave Rover", "Flooded Village"),
            new MountainRescueRobot("Peak Helper", "Mountain Rescue"),
            new MultiTerrainRescueRobot("Atlas", "Urban Rescue")
        };

        System.out.println("=== Emergency Rescue Robot System ===");
        for (RescueRobot robot : robots) {
            robot.startSystem();
            robot.displayRobotInfo();
            robot.performMission();
            System.out.println();
        }

        Flyable flyer = new AirRescueRobot("Sky Scout 2", "Coastal Rescue");
        Swimmable swimmer = new WaterRescueRobot("Wave Rover 2", "River Rescue");
        Climbable climber = new MountainRescueRobot("Peak Helper 2", "Hill Rescue");

        flyer.fly();
        swimmer.swim();
        climber.climb();
    }
}
