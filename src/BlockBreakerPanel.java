import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BlockBreakerPanel extends JPanel {
    List<Block> blocks = new ArrayList<Block>();

    public BlockBreakerPanel() {
        for (int i = 0; i < 8; i++) {
            blocks.add(new Block(i * 60 + 2, 0, 60, 25, "blue.jpg"));
        }
    }

    public void paintComponent(Graphics graphics){
        for (Block block:blocks) {
            block.draw(graphics, this);
        }
    }
}
