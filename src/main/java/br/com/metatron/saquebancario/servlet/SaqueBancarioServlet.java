package br.com.metatron.saquebancario.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.metatron.saquebancario.controller.SaqueBancario;
import br.com.metatron.saquebancario.entity.Cedulas;

@WebServlet("/contagemCedulas")
public class SaqueBancarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaqueBancarioServlet() {
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Integer acao = Integer.parseInt(req.getParameter("acao"));
		
		if(acao == 1){
			efetuarSaque(req, resp);
		}		
	}

	protected void efetuarSaque(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String valor = req.getParameter("valor");
		Cedulas cedulas = new Cedulas();

		SaqueBancario saqueBancario = new SaqueBancario();
		cedulas = saqueBancario.efetuarSaque(Integer.parseInt(valor));
		try {
			if (cedulas == null) {
				req.setAttribute("mensagem", "Não foi possível efetuar o saque do valor R$" + valor);
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/erro.jsp");
				dispatcher.forward(req, resp);
			} else {
				req.setAttribute("notas100", cedulas.getNota100());
				req.setAttribute("notas50", cedulas.getNota50());
				req.setAttribute("notas20", cedulas.getNota20());
				req.setAttribute("notas10", cedulas.getNota10());
				
				RequestDispatcher dispatcher = req.getRequestDispatcher("/cedulas.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			req.setAttribute("mensagem", "Não foi possível efetuar o saque do valor R$" + valor);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("/erro.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
