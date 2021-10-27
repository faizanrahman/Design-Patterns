public class SignUpCheckBox extends UIControl {
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
