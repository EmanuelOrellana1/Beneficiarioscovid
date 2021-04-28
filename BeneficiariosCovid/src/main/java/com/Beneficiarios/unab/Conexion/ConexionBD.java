package com.Beneficiarios.unab.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
	
private Connection coonec;
    
    public ConexionBD()
    {
    	
    try{
    	Class.forName("com.mysql.jdbc.Driver");
        coonec = DriverManager.getConnection("jdbc:mysql://localhost/beneficiarioscovid","root","root");
        System.out.println("CONECTADO A LA BD");
        
    }catch (Exception e)
    {
        System.out.println("ERROR DE CONEXION A LA BD "+ e);
    }
    }
    public Connection RetornarConexion(){   
        return coonec;   
    }

}
