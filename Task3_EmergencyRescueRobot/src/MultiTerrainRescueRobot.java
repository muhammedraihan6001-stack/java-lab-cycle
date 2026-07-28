// Multi-terrain robot supports multiple interfaces.
class MultiTerrainRescueRobot extends RescueRobot implements Flyable, Swimmable, Climbable {
    public MultiTerrainRescueRobot(String robotName, String missionArea) {
        super(robotName, missionArea);
    }

    @Override
    public void performMission() {
        System.out.println("Multi-terrain rescue robot is handling a complex rescue mission.");
    }

    public void fly() {
        System.out.println("Multi-terrain rescue robot is flying.");
    }

    public void swim() {
        System.out.println("Multi-terrain rescue robot is swimming.");
    }

    public void climb() {
        System.out.println("Multi-terrain rescue robot is climbing.");
    }
}
