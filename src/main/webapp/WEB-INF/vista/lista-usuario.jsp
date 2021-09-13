<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuarios</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
</head>
<body>
<h1>Usuarios 2021</h1>
	<table class="table table-bordered table-sm">
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Edad</th>
			<th>Email</th>
			<th>Telefono</th>
			<th>Direccion</th>
			<th>Provincia</th>
			<th>Estado civil</th>
			<th>Codigo postal</th>
			<th>Modificar</th>
			<th>Eliminar</th>
		</tr>
		<c:forEach var="usuarioTemp" items="${usuarios}">
		
			<c:url var="linkActualizar" value="/cliente/muestraFormularioActualizar">
				<c:param name="usuarioId" value="${usuarioTemp.id}"></c:param>
			</c:url>
			
			<c:url var="linkEliminar" value="/cliente/eliminar">
				<c:param name="usuarioId" value="${usuarioTemp.id}"></c:param>
			</c:url>
		
			<tr>
				<td>${usuarioTemp.nombre}</td>
				<td>${usuarioTemp.apellido}</td>
				<td>${usuarioTemp.edad}</td>
				<td>${usuarioTemp.email}</td>
				<td>${usuarioTemp.telefono}</td>
				<td>${usuarioTemp.direccion}</td>
				<td>${usuarioTemp.provincia}</td>
				<td>${usuarioTemp.estadoCivil}</td>
				<td>${usuarioTemp.codigoPostal}</td>
				
				<td><a href="${linkActualizar}"><input type="button" value="Modificar"/></a></td>
				<td><a href="${linkEliminar}"><input type="button" value="Eliminar" onclick="if(!(confirm('Vas a eliminar un registro. !!Estas seguro!!')))return false" /></a></td>
				
			</tr>
		</c:forEach>		
	</table>
	<br>
	<input type="button" value="Agregar Usuario" onclick="window.location.href='mostrarFormularioAgregar';return false"/>
</body>
</html>