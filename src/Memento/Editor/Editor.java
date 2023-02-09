package Memento.Editor;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Editor {
    private String content;
    private List<String> prevContents = new ArrayList<>();

    public Editor(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.prevContents.add(content);
    }
}


//    public void undo() {
//        if (prevContents.size() == 1)
//            throw new NoSuchElementException();
//
//        var lastIndex = prevContents.size() - 1;
//        this.content = prevContents.get(lastIndex - 1);
//        prevContents.remove(prevContents.get(lastIndex));
//    }