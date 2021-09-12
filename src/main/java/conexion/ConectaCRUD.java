package conexion;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConectaCRUD")
public class ConectaCRUD extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConectaCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// CREAMOS LA CONEXION CON NUESTRA BBDD
		String jdbcUrl = "jdbc:mysql://localhost:3306/examen?useSSL=false";
		String usuario = "root";
		String contra = "root";
		String driver = "com.mysql.jdbc.Driver";

		try {
			// PARA QUE ESCRIBA EL NAVEGADOR UTIZADFO EL OBETO OUT
			PrintWriter out = response.getWriter();

			// IMPRIMA EL NOMBRE DE LA BBDD
			out.print("Nombre  de la BBDD " + jdbcUrl + "<br>");

			// CARGAMOS EL DRIVER
			Class.forName(driver);

			// CONECTAMOS EL DRIVER A MI APLICACION WEB
			Connection miConexion = DriverManager.getConnection(jdbcUrl, usuario, contra);
			out.println("!!CONECTADOO!!");

			// CERRAMOS LA SESION
			miConexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
