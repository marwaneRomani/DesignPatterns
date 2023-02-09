package Command.HtmlDocument;

public class UndoCommand implements Command {
    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    public int undoSize() {
        return history.size();
    }

    @Override
    public void execute() {
            if (history.size() > 0) {
                UndoableCommand last = history.pop();
                last.unexecute();
            }
            else
                System.out.println("no more history");
    }
}
