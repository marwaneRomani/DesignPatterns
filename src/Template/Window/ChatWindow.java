package Template.Window;

public class ChatWindow extends Window {
    @Override
    protected void onClosing() {
        System.out.println("confirmation.");
    }

    @Override
    protected void onClose() {
        System.out.println("clear the memory.");
    }
}
