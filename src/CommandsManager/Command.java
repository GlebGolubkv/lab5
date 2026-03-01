package CommandsManager;

public abstract class Command {
    public abstract void execute();

    public abstract void execute(String value1);

    public abstract String commandInfo();
}
