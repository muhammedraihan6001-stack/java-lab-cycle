// Mountain rescue robot can climb.
class MountainRescueRobot extends RescueRobot implements Climbable {
    public MountainRescueRobot(String robotName, String missionArea) {
        super(robotName, missionArea);
    }

    @Override
    public void performMission() {
        System.out.println("Mountain rescue robot is climbing steep terrain.");
    }

    public void climb() {
        System.out.println("Mountain rescue robot is climbing.");
    }
}
