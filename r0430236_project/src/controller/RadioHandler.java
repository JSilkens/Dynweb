package controller;

import java.io.IOException;
import java.util.List;

import model.ModelException;
import model.Radio;
import model.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddStation
 */
@WebServlet("/RadioHandler")
public class RadioHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Radio radio = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RadioHandler() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		 String stations = showStreams(request, response);
		 RequestDispatcher view = request.getRequestDispatcher(stations);
		 view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO implement
		String name = request.getParameter("name");
		String url = request.getParameter("link");

		try {
			this.radio = new Radio("radio");
			System.out.println(name);
			System.out.println(url);
			this.radio.addStream(name, url);
		} catch (ModelException me) {
			request.setAttribute("validationerror", me.getMessage());
		}
		if (request.getParameter("name") == null
				|| request.getParameter("link") == null) {
			RequestDispatcher view = request
					.getRequestDispatcher("/jsp/radioplayer.jsp");
		}

		RequestDispatcher view = request
				.getRequestDispatcher("/jsp/radioplayer.jsp");
		view.forward(request, response);
	}

	private String showStreams(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int size = this.radio.totalStreams();
		request.setAttribute("total", size);
		List<Stream> streams = this.radio.getAllStreams();
		request.setAttribute("streams", streams);
		return "/jsp/radioplayer.jsp";
	}

}
