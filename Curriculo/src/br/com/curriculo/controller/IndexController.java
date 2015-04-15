package br.com.curriculo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.curriculo.common.exceptions.DomainException;
import br.com.curriculo.model.Login;
import br.com.curriculo.model.UniqueResult;
import br.com.curriculo.model.Usuario;

@Controller
public class IndexController
{
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}

	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request)
	{
		Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
		
		return new ModelAndView("home", "logado", usuario.getNome());
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public UniqueResult login(@RequestBody Login login, HttpSession session) throws Exception
	{
		if (login.getUsuario().equals("alan.silva") && login.getSenha().equals("123456"))
		{
			Usuario usuario = new Usuario();
			usuario.setNome("Alan Bruno Rabelo da Silva");
			usuario.setEmail("alanbruno13@yahoo.com.br");

			session.setAttribute("usuario", usuario);

			return new UniqueResult("Home", false);
		}
		else
			throw new DomainException("Usuário e/ou senha inválido(s).");
	}
}
