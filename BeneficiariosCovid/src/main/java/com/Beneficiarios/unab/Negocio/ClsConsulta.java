package com.Beneficiarios.unab.Negocio;

import com.Beneficiarios.unab.DAO.ClsBeneficiario;
import com.Beneficiarios.unab.Entidades.Usuarios;

public class ClsConsulta {
	
	public int consulta(Usuarios usu) {
		int validacion = 0;
		ClsBeneficiario clsDui = new ClsBeneficiario();
		var revisar = clsDui.BerificarUsu(usu);
		
		if(revisar == true) {
			validacion = 1;
		}
		return validacion;
		
		
	}
}
