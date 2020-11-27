package controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class ClienteFromServlet
 */
@WebServlet("/ClienteFromServlet")
public class ClienteFormHtmlServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ClienteFormHtmlServelt() {
		// TODO Auto-generated constructor stub
		try {
updateClientes()
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws NamingException, SQLException {
			String idClientes =request.getPameter("id");
			STring nombreClientes=request.getParameter("nombre");
			ClientesDTO Clientes =new ClientesDTO();
			Clientes.setId(idClientes);
			Clientes.setNombre(nombreClientes);
			
			Context context = new InitialContext();
			Datasource 
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log("Actualizando Clientes");
		//response.setContentType("text/html");
		//Writer writer = response.getWriter();
		//writer.write("<html><body><p>¿Cómo taz?</p></body></html>");
		// TODO Auto-generated method stub
		
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/Clientess_update_form.jsp");
		//dispatcher.forward(request, response);
		
		String base = request.getContextPath();
		response.sendRedirect(base + "/Clientes_update_form.jsp");
	}
	private void updateClientes() {}
	/**
	 * @param connection
	 * @param idClientes
	 * @param nombreClientes
	 * @throws SQLException
	 */
	private void updateClientes(Connection connection, ClientesDTO Clientes)
	/**
	 * @param connection
	 * @param idClientes
	 * @param nombreClientes
	 * @throws SQLException
	 */
	throws SQLException
	{
		Statement statement=connection.createStatement();
		try {
		Statement.executeUpdate("UPDATE Clientes SET "+"nombre_Clientes='"+Clientes.getClientes+"' WHERE id_Clientes= ?;");
	   -statement.setString(1, Clientes.getNombre());
		}
		finally{
		 statement.close();	
		}
		}
private list<ClienteDTO>  getCliente(Connection connection, int key)
throws SQLException{
	
	Statement statement = connection.createStatement();
	String query ="SELECT c.id_cliente"
}
public void xlsShow( Map<String, ClienteDTO> beans,
		HttpServletResponse responce, int key )throws IOException
{
         ServletContext	
}

}
