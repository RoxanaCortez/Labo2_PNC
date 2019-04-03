package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnotacionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }	
		
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//doGet(request, response);
			String usuario = request.getParameter("usuario");
			String contra = request.getParameter("contra");
			
			
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			if(usuario.equals("admin") && contra.equals("123")) {
				out.println("<h3>" + "Inicio de sesion exictosa" + "</h3>");
			}else {
				out.println("<h3>" + "Error credenciales invalidas" + "</h3>");
			}
			out.println("</body>");
			out.println("</html>");
		}
}
