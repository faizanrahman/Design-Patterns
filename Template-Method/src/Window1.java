import java.sql.SQLOutput;

public class Window1 extends WindowCloseOperation {
    @Override
    protected void onClosing() {
        System.out.println("Window1 is closing");
    }

    @Override
    protected void onClosed() {
        System.out.println("Window1 has closed");
    }
}
