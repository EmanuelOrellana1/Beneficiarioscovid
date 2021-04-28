package com.Beneficiarios.unab.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.Beneficiarios.unab.Conexion.ConexionBD;
import com.Beneficiarios.unab.Entidades.Usuarios;

public class ClsBeneficiario {
	ConexionBD conexion = new ConexionBD();
	Connection con = conexion.RetornarConexion();

	public boolean BerificarUsu(Usuarios usu) {
		boolean confi = false;
		try {
			CallableStatement statement = con.prepareCall("call SP_S_Usuarios(?)");
			statement.setString("PDUI", usu.getDui());
			ResultSet resultado = statement.executeQuery();
			while (resultado.next()) {
				confi = true;

			}
		} catch (Exception e) {
			System.out.println("");
		}
		return confi;
	}
}
