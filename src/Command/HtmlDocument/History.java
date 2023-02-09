package Command.HtmlDocument;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<UndoableCommand> commands = new ArrayList<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.remove(commands.size() - 1);
    }
    public int size() {
        return commands.size() ;
    }
}
