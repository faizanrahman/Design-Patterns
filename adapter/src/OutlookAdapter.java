import Outlook.OutlookClient;

public class OutlookAdapter implements EmailProvider {
    private OutlookClient outlookClient;

    public OutlookAdapter(OutlookClient outlookClient) {
        this.outlookClient = outlookClient;
    }

    @Override
    public void downloadEmails() {
        outlookClient.openConnection();

        outlookClient.getEmailsFromOutlook();

        outlookClient.closeConnection();
    }
}
