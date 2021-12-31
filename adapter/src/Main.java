import Gmail.GmailClient;
import Outlook.OutlookClient;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Adapter Pattern");

        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter(new GmailClient()));
        emailClient.addProvider(new OutlookAdapter(new OutlookClient()));

        emailClient.downloadEmails();

    }
}
