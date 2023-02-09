package State.Canva;

public class SelectionTool implements ToolType{
    @Override
    public void mouseUp() {
        System.out.println("selecting...");
    }

    @Override
    public void mouseDown() {
        System.out.println("draw a rectangle.");
    }
}
