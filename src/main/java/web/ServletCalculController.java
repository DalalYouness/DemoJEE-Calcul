package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.CalculImpl;
import metier.ICaclul;


@WebServlet(name = "cs" , urlPatterns = {"*.do","/servController"})
public class ServletCalculController extends HttpServlet {
	
	private ICaclul metierCalcul;
	@Override
	public void init() throws ServletException {
		metierCalcul = new CalculImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// on va faire un forwarding vers la vue (jsp file)
		req.getRequestDispatcher("VueCalculSum.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get parametres from http request body & validation
		double numberOne = Double.parseDouble(req.getParameter("number-one"));
		double numberTwo = Double.parseDouble(req.getParameter("number-two"));
		
		//stock data in the model
		CalculModel model = new CalculModel();
		model.setNumberOne(numberOne);
		model.setNumberTwo(numberTwo);
		
		// call the business layer for logic
		double resultSum = metierCalcul.sum(numberOne, numberTwo);
		
		//add result to the model
		model.setResultSum(resultSum);
		
		//add model to the req object
		req.setAttribute("modelCalcul", model);
		
		// forward data to the view
		req.getRequestDispatcher("VueCalculSum.jsp").forward(req, resp);
	}
	
	
}
