package controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class BancoUpdate
 */
@WebServlet("/BancoUpdate")
public class BancoUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public BancoUpdate() {
		// TODO Auto-generated constructor stub
		try {
updateBanco()
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NamingException, SQLException {
			String idBanco =request.getPameter("id");
			STring nombreBanco=request.getParameter("nombre");
			BancoDTO banco =new BancoDTO();
			banco.setId(idBanco);
			banco.setNombre(nombreBanco);
			
			Context context = new InitialContext();
			Datasource 
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log("Actualizando Banco");
		//response.setContentType("text/html");
		//Writer writer = response.getWriter();
		//writer.write("<html><body><p>¿Cómo taz?</p></body></html>");
		// TODO Auto-generated method stub
		
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/bancos_update_form.jsp");
		//dispatcher.forward(request, response);
		
		String base = request.getContextPath();
		response.sendRedirect(base + "/banco_update_form.jsp");
	}
	private void updateBanco() {}
	/**
	 * @param connection
	 * @param idBanco
	 * @param nombreBanco
	 * @throws SQLException
	 */
	private void updateBanco(Connection connection, BancoDTO banco)
	/**
	 * @param connection
	 * @param idBanco
	 * @param nombreBanco
	 * @throws SQLException
	 */
	throws SQLException
	{
		Statement statement=connection.createStatement();
		try {
		Statement.executeUpdate("UPDATE banco SET "+"nombre_banco='"+banco.getBanco+"' WHERE id_banco= ?;");
	   -statement.setString(1, banco.getNombre());
		}
		finally{
		 statement.close();	
		}
		}

}
