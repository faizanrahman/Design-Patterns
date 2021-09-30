public class ChatClient {
    // private String encryptionAlgorithm;
    private Encryptor encryptionAlgorithm;
    public ChatClient(Encryptor encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
    // if (encryptionAlgorithm == "DES")
    //     System.out.println("Encrypting message using DES");
    // else if (encryptionAlgorithm == "AES")
    //     System.out.println("Encrypting message using AES");
    // else
    //     throw new UnsupportedOperationException("Unsupported encryption algorithm");
        encryptionAlgorithm.Encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}

