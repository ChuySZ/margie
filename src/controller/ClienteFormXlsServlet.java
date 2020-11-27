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
public class ClienteFormXlsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ClienteFormXlsServlet() {
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
	/////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////
	tabla = new Table (8);
	
	table.setBorderWidth(3);
	tabla.setBordrColor(new Color (0,0,255));
	tabla.setBackgroundColor(new Color (226,222,222));
	tabla.setPadding(5);
	tabla.setSpacing(5);
	font = FontFactory.getFont(FontFactory.COURIER, 8, Font.BOLD, new Color (64, 64,255));
	phrase = new Phrase ("Ciudad", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Entidad Federativa", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Código Postal", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Teléfono", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Celular", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Tarjeta", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Banco", Font);
	tabla.addCell(phrase);
	phrase = new Phrase ("Fecha Expiración", Font);
	tabla.addCell(phrase);
	document.add(tabla);
	
tabla = new Table(8);
 font = FontFactory.getFont(FontFactory.COURIER, 8,Font.BOLD, new Color (0,128,0));
 for (ClienteDTO Cliente:Clientes)
 {
	 phrase = new Phrase(Cliente.getCiudad(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getEntidadFederativa(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getCodigoPostal(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getTelefono(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getCelular(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getTarjetaCredito(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getBanco(), font);
	 tabla.addCell(phrase);
	 phrase = new Phrase(Cliente.getFechaExpiracion(),toString(), font);
	 tabla.addCell(phrase);
    }
   document.add(tabla);
   fos.flush();
   document.close();
}
catch (IOExceptio e)
{
	e.printStackTrace();
}
catch (DocumentExpection e)
{
	e.printStackTrace();
}
}
	 
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

}
