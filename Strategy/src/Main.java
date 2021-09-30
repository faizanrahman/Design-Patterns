public class Main {

    public static void main(String[] args) {
	// write your code here
    // var chatClient = new ChatClient("DES");
    // chatClient.send("How are you?");

        var chatClient = new ChatClient(new DESEncryptor());
        chatClient.send("How are you?");

        var chatClient2 = new ChatClient(new AESEncryptor());
        chatClient2.send("I am fine");

        // Benefits of strategy pattern:
        // 1. We remove the ugly if statements
        // 2. We follow the open-closed principle.
        // 3. Our classes follow the single responsibility principle

        // Difference between state and strategy pattern
        // State pattern is when a class has a single state to deal with.
        // Strategy pattern is when a class has multiple states to deal with.

        // We can simplify it further by passing in the state/interface implementations directly to the method also.

    }
}
