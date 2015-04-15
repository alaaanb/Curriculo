package br.com.curriculo.common.exceptions;

import java.util.List;

@SuppressWarnings("serial")
public class DomainException extends Exception
{
	private List<String> errorMessageList;

	/**
	 * 
	 * @param message
	 */
	public DomainException(String message)
	{
		super(message);
	}

	/**
	 * 
	 * @param errorMessageList
	 */
	public DomainException(List<String> errorMessageList)
	{
		super();

		this.errorMessageList = errorMessageList;
	}

	public List<String> getErrorMessageList()
	{
		return errorMessageList;
	}
}
