package TaskTemplate;

public class TransferMoneyTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("inside doExecute() method of the transfer money task.");
    }
}
