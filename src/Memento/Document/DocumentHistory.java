package Memento.Document;

import java.util.NoSuchElementException;
import java.util.Stack;

public class DocumentHistory {
    private Stack<DocumentState> states = new Stack<>();
    private Stack<DocumentState> revertStates = new Stack<>();

    public void push(DocumentState state) {
        states.push(state);
    }
    public DocumentState pop() {
        if (states.isEmpty())
            throw new NoSuchElementException();
        var poped = states.pop();
        revertStates.push(poped);
        return poped;
    }

    //for redo functionality
    public DocumentState redo() {
        if (revertStates.isEmpty())
            throw new NoSuchElementException();

        var reverted = revertStates.pop();
        states.push(reverted);
        return reverted;
    }
}
