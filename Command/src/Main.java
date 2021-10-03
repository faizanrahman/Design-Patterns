import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var videoEditor = new VideoEditor();
        var history = new History();

        SetTextCommand setTextCommand = new SetTextCommand("Hello World", videoEditor, history);

        setTextCommand.execute();

        SetContrastCommand setContrastCommand = new SetContrastCommand(0.44f, videoEditor, history);

        setContrastCommand.execute();

        System.out.println(history.size());

        // Undo command.
        UndoCommandImplementation undoCommand = new UndoCommandImplementation(history);

        undoCommand.execute();

        System.out.println(history.size());

        undoCommand.execute();

        System.out.println(history.size());

        undoCommand.execute();

        System.out.println(history.size());
    }
}
