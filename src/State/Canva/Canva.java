package State.Canva;

public class Canva {
    private ToolType currentTool;

    public Canva(ToolType tool) {
        currentTool = tool;
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }
    public void mouseDown() {
        currentTool.mouseDown();
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }
}
