package in.co.pro4.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred.
 * @author Sourav Jagirdar
 *
 */
public class DuplicateRecordException extends Exception {

	public DuplicateRecordException(String msg) {
		super(msg);
	}
}
