package exceprions;

public class WrongOperationException extends Exception{
    public WrongOperationException() {
        super("Акаунт не має достатньо коштів");
    }
}
