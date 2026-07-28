// Water rescue robot can swim.
class WaterRescueRobot extends RescueRobot implements Swimmable {
    public WaterRescueRobot(String robotName, String missionArea) {
        super(robotName, missionArea);
    }

    @Override
    public void performMission() {
        System.out.println("Water rescue robot is searching flooded areas.");
    }

    public void swim() {
        System.out.println("Water rescue robot is swimming.");
    }
}
