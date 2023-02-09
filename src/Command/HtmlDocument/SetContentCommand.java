package Command.HtmlDocument;

public class SetContentCommand implements UndoableCommand {
    private String prevContent;
    private String newContent;
    private Document document;
    private History history;

    public SetContentCommand(String newContent, Document document, History history) {
        this.newContent = newContent;
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.setContent(newContent);
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
