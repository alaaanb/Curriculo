package br.com.curriculo.model;

import java.util.List;

public class ResponseExceptionJson
{
	private String errorMessage;
	private List<String> errorMessageMap;
	private boolean hasErrorList;

	/**
	 * Construtor que recebe uma mensagem de erro a ser exibida.
	 * 
	 * @param errorMessage
	 */
	public ResponseExceptionJson(String errorMessage)
	{
		this.hasErrorList = false;
		this.errorMessage = errorMessage;
	}

	/**
	 * Construtor que recebe uma mapa de mensagens para exibir erros em lote.
	 * 
	 * @param errorMessageMap
	 */
	public ResponseExceptionJson(List<String> errorMessageMap)
	{
		this.hasErrorList = true;
		this.errorMessageMap = errorMessageMap;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public List<String> getErrorMessageMap()
	{
		return errorMessageMap;
	}

	public boolean getHasErrorList()
	{
		return hasErrorList;
	}
}
