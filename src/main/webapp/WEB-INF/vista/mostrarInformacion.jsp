<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informacion</title>
</head>
<body>
	
	<h2>Informacion sobre ${elUsuario.nombre} ${elUsuario.apellido}</h2>
	<div>
		<ul>
			<li>Correo electronico: ${elUsuario.email}</li>
			<li>Numero telefonico: ${elUsuario.telefono}</li>
			<li>Direccion: ${elUsuario.direccion}</li>
			<li>Provincia: ${elUsuario.provincia}</li>
			<li>Codigo postal: ${elUsuario.codigoPostal}</li>
			<li>Estado civil: ${elUsuario.estadoCivil}</li>
		</ul>
	</div>
	
</body>
</html>