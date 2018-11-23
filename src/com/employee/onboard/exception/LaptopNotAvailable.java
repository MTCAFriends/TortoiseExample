/**
 * 
 */
package com.employee.onboard.exception;

/**
 * @author subbu
 *
 */
public class LaptopNotAvailable extends Exception {

	public LaptopNotAvailable(String message) {
		super(message);
	}

	public LaptopNotAvailable(Throwable cause) {
		super(cause);
	}

	public LaptopNotAvailable(String message, Throwable cause) {
		super(message, cause);
	}

	public LaptopNotAvailable(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
