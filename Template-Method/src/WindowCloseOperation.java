public class WindowCloseOperation {
    public void close() {
        onClosing();
        onClosed();
    }

    protected void onClosing() {};
    protected void onClosed() {};
}
