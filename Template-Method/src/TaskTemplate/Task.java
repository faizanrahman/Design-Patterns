package TaskTemplate;

public abstract class Task {
    public void execute() {
        System.out.println("inside execute method");

        doExecute();
    }

    protected abstract void doExecute();
}
