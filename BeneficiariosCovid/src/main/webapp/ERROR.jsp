<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="Stylesheet" href= "Style/NoBeneficiario.css">
<head>
<meta charset="ISO-8859-1">
<title>NO ERES BENEFICIARIO</title>
<h1>NO ERES BENEFICIARIO DE LOS $300 DOLARES</h1>
</head>
<body>
<%
HttpSession sesion = (HttpSession) request.getSession();
String usuSession = String.valueOf(sesion.getAttribute("no"));
System.out.print(usuSession +"Nombre usuario");

if(usuSession.equals(null)||usuSession.equals("null")){
	response.sendRedirect("index.jsp");
}
%>
<form action="ControllerMostrarInfo" method="post">
<input type="submit" name="noVerificardui" value="Regresar">
</body>
</html>