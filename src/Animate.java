public class Animate implements Runnable{

    private BlockBreakerPanel blockBreakerPanel;

    public Animate(BlockBreakerPanel blockBreakerPanel) {
        this.blockBreakerPanel = blockBreakerPanel;
    }

    @Override
    public void run() {
        while(true){
            blockBreakerPanel.update();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
