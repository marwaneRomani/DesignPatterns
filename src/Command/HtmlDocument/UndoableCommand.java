package Command.HtmlDocument;

public interface UndoableCommand extends Command {
    void unexecute();
}
