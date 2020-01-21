public class Ball {

    private int y, x;
    private int vy, vx;
    private int size;
    private String color;

    public Ball(int y, int x, int vy, int vx, int size, String color) {
        //position
        this.y = y;
        this.x = x;
        //speed
        this.vy = vy;
        this.vx = vx;
        //width and height
        this.size = size;
        //colour
        this.color = color;
    }

    public void move() {

    }

}
