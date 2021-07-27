<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><%@ taglib
	prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Formulario de Registro</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/recursos/estilos/formulario.css">
	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet' type='text/css'>
</head>
<body>

	<div class="form">
	<h1>Informacion Personal</h1>
	<form:form action="conectarFormulario" modelAttribute="elUsuario">
	
		<form:input path="nombre" placeholder="Nombre"/>
	    <form:errors path="nombre" style="color:#f66151"></form:errors>
		<form:input path="apellido" placeholder="Apellido"/>
		<form:errors path="apellido" style="color:#f66151"></form:errors>
		<form:input path="edad" placeholder="Edad"/>
		<form:errors patch="edad" style="color:#f66151"></form:errors>
		<form:input path="email" placeholder="Email"/>
		<form:errors path="email" style="color:#f66151"></form:errors>
		<form:input path="telefono" placeholder="Telefono"/>
		<form:errors path="telefono" style="color:#f66151"></form:errors>
		<form:input path="direccion" placeholder="Direccion"/>
		<form:errors path="direccion" style="color:#f66151"></form:errors>
		<form:input path="codigoPostal" placeholder="Codigo Postal"/>
		<form:errors path="codigoPostal" style="color:#f66151"></form:errors>
		<br><br>
		Provincia: 
		<form:select path="provincia">

			<form:option value="Pichincha" label="Pichincha"></form:option>
			<form:option value="Azuay" label="Azuay"></form:option>
			<form:option value="Manabi" label="Manabi"></form:option>
			<form:option value="Guayas" label="Guayas"></form:option>

		</form:select>
		&nbsp;&nbsp;&nbsp;Estado Civil: 
		<form:select path="estadoCivil">

			<form:option value="Soltero" label="Soltero"></form:option>
			<form:option value="Casado" label="Casado"></form:option>
			<form:option value="Divorciado" label="Divorciado"></form:option>
			<form:option value="Viudo" label="Viudo"></form:option>

		</form:select>
		<br><br>
		<input class="btn-enviar" type="submit" value="Enviar">
	
	</form:form>
	</div>
</body>
</html>