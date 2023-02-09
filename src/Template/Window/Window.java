package Template.Window;

public class Window {
    public void close() {
        onClosing();
        System.out.println("window is close now.");
        onClose();
    }

    protected void onClose() {};

    protected void onClosing() {};
}
