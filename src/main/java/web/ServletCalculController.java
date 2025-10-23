package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "cs" , urlPatterns = {"*.do","/servController"})
public class ServletCalculController extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// on va faire un forwarding vers la vue (jsp file)
		req.getRequestDispatcher("VueCalculSumjsp.jsp").forward(req, resp);
	}
	
}
