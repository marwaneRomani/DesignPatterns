package Memento.Document;


public class Document {
    private String content;
    private String fontName;
    private float fontSize;


    public Document(String content, String fontName, float fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentState createState() {
        return new DocumentState(content,fontName,fontSize);
    }

    public void restore(DocumentState prevState) {
        this.content = prevState.getContent();
        this.fontName = prevState.getFontName();
        this.fontSize = prevState.getFontSize();
    }

    public void redo(DocumentState revertedState) {
        this.content = revertedState.getContent();
        this.fontName = revertedState.getFontName();
        this.fontSize = revertedState.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }
}
