package div.services.exceptions;

@SuppressWarnings("serial")
public class ServiceException extends Exception
{
	public ServiceException()
	{
		super();
	}

	/**
	 * @param message
	 */
	public ServiceException(String message)
	{
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ServiceException(String message, Throwable cause)
	{
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public ServiceException(Throwable cause)
	{
		super(cause);
	}
}