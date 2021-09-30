import TaskTemplate.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var window1 = new Window1();
        window1.close();

        // TODO: how to remove access to onClosing and onclosed methods from this class.
        // probably keep the class in a separate package.

        var task = new TransferMoneyTask();
        task.execute();
    }
}
