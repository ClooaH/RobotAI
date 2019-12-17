import java.util.ArrayList;

public class Tile {

    private boolean robot;
    private boolean light;
    private boolean food;
    private ArrayList<Tile> tiles = new ArrayList<Tile>();

    public Tile(boolean robot, boolean light, boolean food) {
        this.robot = robot;
        this.light = light;
        this.food = food;
    }

    public boolean isRobot() {
        return robot;
    }

    public void setRobot(boolean robot) {
        this.robot = robot;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}
