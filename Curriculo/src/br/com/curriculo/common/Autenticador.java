package br.com.curriculo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.curriculo.model.Usuario;

public class Autenticador extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception
	{
		String uri = request.getRequestURI();

		if (uri.endsWith("/") || uri.endsWith("/login") || uri.contains("resources"))
		{
			return true;
		}

		HttpSession session = request.getSession();

		Usuario usuario = (Usuario) session.getAttribute("usuario");

		if (usuario != null)
		{
			return true;
		}

		response.sendRedirect("/Curriculo/");

		return false;
	}
}
