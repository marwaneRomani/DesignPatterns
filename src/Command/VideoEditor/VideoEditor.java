package Command.VideoEditor;

public class VideoEditor {
    private String label;
    private float contrast;

    public void setLabel(String label) {
        this.label = label;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    public float getContrast() {
        return contrast;
    }

    public String getLabel() {
        return label;
    }
}
