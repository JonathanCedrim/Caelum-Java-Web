package mvc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Logica")
public interface Logica {
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
