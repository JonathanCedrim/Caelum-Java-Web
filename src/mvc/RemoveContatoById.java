package mvc;

import java.sql.Connection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ContatoService;

@WebServlet("/RemoveContatoById")
public class RemoveContatoById implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		System.out.println("executando");
		Connection conn = (Connection) req.getAttribute("connection");

		ContatoService dao = new ContatoService(conn);
		Long id = Long.parseLong(req.getParameter("id"));

		dao.removePorId(id);
		return "/jsp/remove-contato.jsp";

	}
}
