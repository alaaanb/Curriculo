package br.com.curriculo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.curriculo.common.exceptions.DomainException;
import br.com.curriculo.model.ResponseExceptionJson;

@ControllerAdvice
public class ExceptionHandlerController
{
	@ResponseStatus(value = HttpStatus.OK)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseExceptionJson handlerException(HttpServletRequest request, Exception ex)
	{
		if (ex instanceof DomainException)
		{
			DomainException domainException = (DomainException) ex;

			if (domainException.getErrorMessageList() == null)
			{
				return new ResponseExceptionJson(domainException.getMessage());
			}

			return new ResponseExceptionJson(domainException.getErrorMessageList());
		}

		return new ResponseExceptionJson("Erro genérico.");
	}
}
