package Command.VideoEditor;

public interface UndoableCommand extends Command {
    void unexecute();
}
