import java.awt.*;

public class Block extends Rectangle {
    private int x;
    private int y;
    private int weight;
    private int height;
    private Image pic;

    public int getx() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int gety() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getheight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Image getPic() {
        return pic;
    }

    public void setPic(Image pic) {
        this.pic = pic;
    }

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
