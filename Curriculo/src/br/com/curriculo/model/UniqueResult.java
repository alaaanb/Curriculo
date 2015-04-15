package br.com.curriculo.model;

public class UniqueResult
{
	private String page;
	private boolean hasError;

	public UniqueResult(String page, boolean hasError)
	{
		this.page = page;
		this.hasError = hasError;
	}

	public String getPage()
	{
		return page;
	}

	public boolean getHasError()
	{
		return hasError;
	}
}
