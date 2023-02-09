package Command.HtmlDocument;

public class BoldCommand implements UndoableCommand{
    private String prevContent;
    private Document document;
    private History history;

    public BoldCommand(Document document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }
}
