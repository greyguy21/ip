package duke.exception;

/**
 * Thrown when user does not provide correct preposition for certain task descriptions
 */
public class MissingPreException extends DukeException {
    private final String error;

    /**
     * Constructs MissingPreException object
     *
     * @param msg error message
     * @param pre preposition not provided
     */
    public MissingPreException(String msg, String pre) {
        super(msg);
        this.error = String.format("OOPS!!! Missing %s preposition!", pre);
    }

    @Override
    public String getError() {
        return this.error;
    }
}
