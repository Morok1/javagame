import java.awt.*;

public class Block extends Rectangle {
    private int x;
    private int y;
    private int weight;
    private int height;
    private Image pic;

    public Block(int x, int y, int width, int height, String stringOfImage
    ) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
        this.pic = Toolkit.getDefaultToolkit().getImage(stringOfImage);
    }

    public void draw(
            Graphics graphic, Component component) {
        graphic.drawImage(pic, x, y, weight, height, component);
    }
}
