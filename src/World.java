public class World {

    int width = 5;
    int height = 5;
    Tile[] tile;
    Robot[] robot;

    public World(int width, int height, Tile[] tile, Robot[] robot) {
        this.width = width;
        this.height = height;
        this.tile = tile;
        this.robot = robot;
    }
}
