import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Broke Braker");
        jFrame.setVisible(true);
        jFrame.setSize(400, 600);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BlockBreakerPanel panel = new BlockBreakerPanel();
        jFrame.getContentPane().add(panel);

        jFrame.setResizable(false);

    }
}
