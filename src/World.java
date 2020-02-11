import java.util.ArrayList;

public class World {

    int width;
    int height;
    private Robot[] robot;

    public World(int width, int height, Tile[] tile, Robot[] robot) {
        this.width = width;
        this.height = height;
        this.robot = robot;
    }
}
