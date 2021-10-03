public class SetTextCommand implements UndoableCommand {
    private String labelText;
    private VideoEditor videoEditor;
    private History history;

    public SetTextCommand(String labelText, VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
        this.labelText = labelText;
    }

    @Override
    public void execute() {
        this.videoEditor.setText(labelText);
        this.history.push(this);
    }

    @Override
    public void undo() {
        this.videoEditor.removeText();
    }
}
