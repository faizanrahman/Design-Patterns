import java.util.UnknownFormatConversionException;

public class UndoCommandImplementation implements Command {
    private History history;

    public UndoCommandImplementation(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(this.history.size() > 0) {
            this.history.pop().undo();
        }
    }
}
