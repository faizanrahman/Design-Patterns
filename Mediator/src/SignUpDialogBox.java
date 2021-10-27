public class SignUpDialogBox {
    private TextBox usernameBox = new TextBox();
    private TextBox passwordBox = new TextBox();
    private SignUpCheckBox termsAndConditionsCheckBox = new SignUpCheckBox();
    private SignUpButton signUpButton = new SignUpButton();

    public SignUpDialogBox() {
        usernameBox.addEventHandler(new EventHandler(){
            @Override
            public void handle() {
                // logic to update all other components.
                signUpButton.setEnabled(isFormValid());
            }
        });

        passwordBox.addEventHandler(new EventHandler(){
            @Override
            public void handle() {
                // logic to update all other components.
                signUpButton.setEnabled(isFormValid());

            }
        });

        termsAndConditionsCheckBox.addEventHandler(new EventHandler(){
            @Override
            public void handle() {
                // logic to update all other components.
                signUpButton.setEnabled(isFormValid());
            }
        });
    }

    private boolean areAllConditionsSatisfied() {
        var userNameBoxEmpty = (usernameBox.getContent() == null || usernameBox.getContent().isEmpty());
        var passwordTextBoxEmpty = (passwordBox.getContent() == null || passwordBox.getContent().isEmpty());
        var checkBoxUnSelected = termsAndConditionsCheckBox.isChecked();

        if (!userNameBoxEmpty && !passwordTextBoxEmpty && checkBoxUnSelected) {
            return true;
        }

        return false;
    }

    private boolean isFormValid() {
        return !usernameBox.isEmpty() && !passwordBox.isEmpty() && termsAndConditionsCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        termsAndConditionsCheckBox.setIsChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
