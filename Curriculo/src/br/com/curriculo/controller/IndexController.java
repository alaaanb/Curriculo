package br.com.curriculo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.curriculo.model.Login;
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
	public String home()
	{
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(@RequestBody Login login, HttpSession session)
	{
		if (login.getUsuario().equals("alan.silva") && login.getSenha().equals("123456"))
		{
			Usuario usuario = new Usuario();
			usuario.setNome("Alan Bruno Rabelo da Silva");
			usuario.setEmail("alanbruno13@yahoo.com.br");

			session.setAttribute("usuario", usuario);

			//return "{ page : 'home' }";
		}

		//return "{ page : '/' }";
	}
}
