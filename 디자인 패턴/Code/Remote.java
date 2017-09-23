package JavaPackage;

public class Remote {
    private Command button;

    public void setCommand(Command command) {
        button = command;
    }

    public void onClick() {
        button.execute();
    }
}
