<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informacion</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/estilos/mostrar.css">
</head>
<body>
	
	<h2>Informacion sobre ${elUsuario.nombre} ${elUsuario.apellido}:</h2>
	<div>
		<ul>
			<li><strong>Edad:</strong> ${elUsuario.edad}</li>
			<li><strong>Correo electronico:</strong> ${elUsuario.email}</li>
			<li><strong>Numero telefonico:</strong> ${elUsuario.telefono}</li>
			<li><strong>Direccion:</strong> ${elUsuario.direccion}</li>
			<li><strong>Provincia:</strong> ${elUsuario.provincia}</li>
			<li><strong>Codigo postal:</strong> ${elUsuario.codigoPostal}</li>
			<li><strong>Estado civil:</strong> ${elUsuario.estadoCivil}</li>
		</ul>
	</div>
	
</body>
</html>