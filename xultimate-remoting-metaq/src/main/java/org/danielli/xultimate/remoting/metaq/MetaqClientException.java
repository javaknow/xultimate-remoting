package org.danielli.xultimate.remoting.metaq;

import org.springframework.core.NestedRuntimeException;

public class MetaqClientException extends NestedRuntimeException  {
	
	private static final long serialVersionUID = 3488287486491666049L;

	public MetaqClientException(String message) {
    	super(message);
    }
	
    public MetaqClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
