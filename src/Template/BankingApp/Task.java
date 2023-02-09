package Template.BankingApp;

public abstract class Task {

    public void execute() {
        System.out.println("journalisation");
        doExecute();
    }
    protected abstract  void doExecute();
}
