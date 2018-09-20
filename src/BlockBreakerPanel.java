import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class BlockBreakerPanel extends JPanel implements KeyListener {
    List<Block> blocks = new ArrayList<Block>();
    Block paddle;
    Thread thread;

    public BlockBreakerPanel() {
        paddle = new Block(175, 480,150, 25, "paddle.png");
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block(i * 60 + 2, 0, 60, 25, "blue.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block(i * 60 + 2, 0, 60, 25, "green.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block(i * 60 + 2, 0, 60, 25, "red.png"));
        }
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block(i * 60 + 2, 0, 60, 25, "yellow.png"));
        }
        addKeyListener(this);
        setFocusable(true);

    }

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        for (Block block:blocks) {
            block.draw(graphics, this);
            paddle.draw(graphics, this);
        }
    }

    public void update(){
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.KEY_PRESSED){
            Animate animate = new Animate(this);
            thread = new Thread(animate);
            thread.start();
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            paddle.setX(paddle.getx()-15);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            paddle.setX(paddle.getx()+15);

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
