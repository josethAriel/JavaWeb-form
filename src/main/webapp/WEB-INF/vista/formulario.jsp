<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><%@ taglib
	prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Formulario de Registro</title>
</head>
<body>
	<h1>Informacion Personal</h1>
	<form:form action="conectarFormulario" modelAttribute="elUsuario">
	
		Primer Nombre: <form:input path="nombre"/>
		Apellido: <form:input path="apellido"/>
		<br><br>
		Email: <form:input path="email"/>
		Telefono: <form:input path="telefono"/>
		<br><br>
		Direccion: <form:input path="direccion"/>
		Provincia: 
		<form:select path="provincia">

			<form:option value="Pichincha" label="Pichincha"></form:option>
			<form:option value="Azuay" label="Azuay"></form:option>
			<form:option value="Manabi" label="Manabi"></form:option>
			<form:option value="Guayas" label="Guayas"></form:option>

		</form:select>
		<br><br>
		Codigo Postal: <form:input path="codigoPostal"/>
		Estado Civil: 
		<form:select path="estadoCivil">

			<form:option value="Soltero" label="Soltero"></form:option>
			<form:option value="Casado" label="Casado"></form:option>
			<form:option value="Divorciado" label="Divorciado"></form:option>
			<form:option value="Viudo" label="Viudo"></form:option>

		</form:select>
		<br><br>
		<input type="submit" value="Enviar">
	
	</form:form>
</body>
</html>