package Strategy.ImageEditor;

public class ImageEditor {
    private String url;
    private Compressable compressor;
    private Filtrable filter;

    public ImageEditor(String url,Compressable compressor, Filtrable filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void compress() {
        compressor.compress(url);
    }

    public void filter() {
        filter.filter(url);
    }
}
