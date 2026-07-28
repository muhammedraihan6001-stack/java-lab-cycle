// Air rescue robot can fly.
class AirRescueRobot extends RescueRobot implements Flyable {
    public AirRescueRobot(String robotName, String missionArea) {
        super(robotName, missionArea);
    }

    @Override
    public void performMission() {
        System.out.println("Air rescue robot is scanning the sky for survivors.");
    }

    public void fly() {
        System.out.println("Air rescue robot is flying.");
    }
}
