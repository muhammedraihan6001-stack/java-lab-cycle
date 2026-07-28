// Abstract class for all rescue robots.
abstract class RescueRobot {
    protected String robotName;
    protected String missionArea;

    public RescueRobot(String robotName, String missionArea) {
        this.robotName = robotName;
        this.missionArea = missionArea;
    }

    public void displayRobotInfo() {
        System.out.println("Robot: " + robotName);
        System.out.println("Mission Area: " + missionArea);
    }

    public void startSystem() {
        System.out.println(robotName + " systems are online.");
    }

    public abstract void performMission();
}
