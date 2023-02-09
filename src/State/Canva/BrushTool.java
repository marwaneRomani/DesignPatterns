package State.Canva;

public class BrushTool implements ToolType {
    @Override
    public void mouseUp() {
        System.out.println("brushing...");
    }

    @Override
    public void mouseDown() {
        System.out.println("drawing some tkhrmize.");
    }
}
