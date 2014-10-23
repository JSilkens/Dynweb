package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.LetterCounter;

/**
 * Servlet implementation class Occurences
 */
@WebServlet("/Occurences")
public class Occurences extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LetterCounter lc = new LetterCounter();
	private int count = 0 ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Occurences() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(count +  "").forward(request, response);;
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String word = request.getParameter("word");
		String c =  request.getParameter("char");
		
		 count = lc.countLetters(word, c.charAt(0));
		 request.setAttribute("total", count);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

}
