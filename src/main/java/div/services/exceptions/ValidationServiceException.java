package div.services.exceptions;

@SuppressWarnings("serial")
public class ValidationServiceException extends Exception
{
	public ValidationServiceException()
	{
		super();
	}

	/**
	 * @param message
	 */
	public ValidationServiceException(String message)
	{
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ValidationServiceException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public ValidationServiceException(Throwable cause)
	{
		super(cause);
	}
}