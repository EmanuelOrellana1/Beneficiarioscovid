package com.Beneficiarios.unab.Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Beneficiarios.unab.Entidades.Usuarios;
import com.Beneficiarios.unab.Negocio.ClsConsulta;

/**
 * Servlet implementation class ControllerMostrarInfo
 */
public class ControllerMostrarInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerMostrarInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String DUI = request.getParameter("dui");
		Usuarios usu = new Usuarios();
		usu.setDui(DUI);
		
		ClsConsulta clscon = new ClsConsulta();
		int validacion = clscon.consulta(usu);
		if(validacion == 1) {
			response.sendRedirect("Beneficiario.jsp");
		}else {
			response.sendRedirect("ERROR.jsp");
		}
		
	}

}
