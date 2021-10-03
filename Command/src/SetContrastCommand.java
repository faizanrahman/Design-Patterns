public class SetContrastCommand implements UndoableCommand {
    private float prevContrast;
    private float contrast;
    private VideoEditor videoEditor;
    private History history;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        this.contrast = contrast;
        this.videoEditor = videoEditor;
        this.history = history;

        this.prevContrast = videoEditor.getContrast();
    }
    @Override
    public void execute() {
       this.videoEditor.setContrast(contrast);
       this.history.push(this);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
