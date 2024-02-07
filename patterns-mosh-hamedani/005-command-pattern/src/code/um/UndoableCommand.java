package code.um;

public interface UndoableCommand extends Command{
    void unexecute();
}
